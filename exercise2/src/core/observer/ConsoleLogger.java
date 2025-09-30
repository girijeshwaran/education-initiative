package core.observer;

import core.Position;

public class ConsoleLogger implements Observer {
    @Override
    public void update(Position position) {
        System.out.println("[Logger] Rover moved to position: " + position);
    }
}