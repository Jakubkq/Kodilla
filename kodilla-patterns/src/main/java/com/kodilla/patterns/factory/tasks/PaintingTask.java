package com.kodilla.patterns.factory.tasks;

public final class PaintingTask implements Task {
    private final String taskName;
    private final String colour;
    private final String whatToPaint;
    private boolean taskFlag = false;

    public PaintingTask(String taskName, String colour, String whatToPaint) {
        this.taskName = taskName;
        this.colour = colour;
        this.whatToPaint = whatToPaint;
    }

    public String getTaskName() {
        return taskName;
    }

    @Override
    public String executeTask() {
        taskFlag=true;
        return "Task "+ taskName+ " is executed. You need to paint on "+colour+" colour "+whatToPaint;
    }

    @Override
    public boolean isTaskExecuted() {
        return taskFlag;
    }
}
