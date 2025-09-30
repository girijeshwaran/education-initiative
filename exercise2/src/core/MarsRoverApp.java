package core;
import domain.commands.*;
import domain.direction.*;
import domain.grid.*;
import domain.decorator.*;
import java.util.*;
import core.observer.ConsoleLogger;
public class MarsRoverApp {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            // Dynamic Grid Size Input
            System.out.print("Enter grid size (width height): ");
            int width = sc.nextInt();
            int height = sc.nextInt();
            GridManager.init(width, height);
            GridComposite grid = GridManager.getInstance().getGrid();

            // Dynamic Obstacle Input
            System.out.print("Enter obstacle positions (e.g., 2,2 3,5) or leave empty: ");
            sc.nextLine(); // consume newline
            String obstaclesLine = sc.nextLine();
            if(!obstaclesLine.isBlank()){
                String[] obsTokens = obstaclesLine.split(" ");
                for(String token : obsTokens){
                    String[] coords = token.split(",");
                    int ox = Integer.parseInt(coords[0]);
                    int oy = Integer.parseInt(coords[1]);
                    grid.add(new Obstacle(ox, oy));
                }
            }

            // Starting Position Input
            System.out.print("Enter start position (x y direction[N/S/E/W]): ");
            int startX = sc.nextInt();
            int startY = sc.nextInt();
            char startDir = sc.next().toUpperCase().charAt(0);

            Rover baseRover = new Rover(new Position(startX,startY),
                                        DirectionFactory.create(startDir),
                                        grid);
            Rover rover = new LoggingRover(baseRover);

            // Add observer to the rover
            ConsoleLogger logger = new ConsoleLogger();
            baseRover.addObserver(logger);

            // Commands Input - Interactive Mode
            Map<Character,Command> commandMap = new HashMap<>();
            commandMap.put('M', new MoveCommand(rover));
            commandMap.put('L', new LeftCommand(rover));
            commandMap.put('R', new RightCommand(rover));

            while (true) {
                System.out.print("Enter command (M,L,R or type 'exit' to quit): ");
                String input = sc.next();

                if (input.equalsIgnoreCase("exit")) {
                    break;
                }

                for (char c : input.toCharArray()) {
                    Command cmd = commandMap.get(c);
                    if (cmd != null) cmd.execute();
                    else System.out.println("Invalid command: " + c);
                }
            }


            // Final Status Output
            Position finalPos = rover.statusPosition();
            String dirName = rover.statusDirection().name();
            System.out.println("Final Position: (" + finalPos.x() + ", " + finalPos.y() + ", " + dirName + ")");

            String dirFull = switch(dirName){
                case "N" -> "North";
                case "S" -> "South";
                case "E" -> "East";
                case "W" -> "West";
                default -> dirName;
            };
            String obstacleReport = grid.isObstacle(finalPos.x(), finalPos.y()) ? 
                "Obstacle detected at (" + finalPos.x() + "," + finalPos.y() + ")." :
                "No Obstacles detected.";
            System.out.println("Status Report: \"Rover is at (" + finalPos.x() + ", " + finalPos.y() + ") facing " + dirFull + ". " + obstacleReport + "\"");
        }
    }
}