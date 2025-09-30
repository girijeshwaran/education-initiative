package domain.decorator;

import core.Position;
import core.Rover;
import domain.grid.GridComposite;

public abstract class RoverDecorator extends Rover {
    protected Rover decoratedRover;

    public RoverDecorator(Rover rover) {
        super(rover.statusPosition(), rover.statusDirection(), rover.getGrid());
        this.decoratedRover = rover;
    }

    @Override
    public void moveForward() {
        decoratedRover.moveForward();
    }

    @Override
    public void turnLeft() {
        decoratedRover.turnLeft();
    }

    @Override
    public void turnRight() {
        decoratedRover.turnRight();
    }

    @Override
    public String status() {
        return decoratedRover.status();
    }

    @Override
    public Position statusPosition() {
        return decoratedRover.statusPosition();
    }

    @Override
    public domain.direction.Direction statusDirection() {
        return decoratedRover.statusDirection();
    }

    @Override
    public GridComposite getGrid() {
        return decoratedRover.getGrid();
    }
}