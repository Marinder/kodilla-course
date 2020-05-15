package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String DRIVINGTASK = "DRIVINGTASK";
    public static final String PAINTINGTASK = "PAINTINGTASK";
    public static final String SHOPPINGTASK = "SHOPPINGTASK";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case DRIVINGTASK:
                return new DrivingTask("Trip", "Gdansk", "Car");
            case PAINTINGTASK:
                return new PaintingTask("Sea", "Blue", "Water");
            case SHOPPINGTASK:
                return new ShoppingTask("Drink", "Beer", 10);
            default:
                return null;
        }
    }

}
