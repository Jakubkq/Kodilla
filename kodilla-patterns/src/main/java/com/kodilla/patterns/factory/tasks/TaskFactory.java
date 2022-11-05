package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {
    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public final Task makeTask(final String taskClass) {
        return switch (taskClass) {
            case SHOPPING -> new ShoppingTask("shopping", "onions", 8.0);
            case PAINTING -> new PaintingTask("painting", "white", "garage");
            case DRIVING -> new DrivingTask("driving", "Cracov", "car");
            default -> null;
        };
    }
}


