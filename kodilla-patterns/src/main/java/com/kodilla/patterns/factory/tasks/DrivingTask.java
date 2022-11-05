package com.kodilla.patterns.factory.tasks;

public final class DrivingTask implements Task {
    private final String taskName;
    private final String where;
    private final String using;
    private boolean taskFlag = false;

    public DrivingTask(final String taskName, final String where, final String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    public String getTaskName() {
        return taskName;
    }

    @Override
    public String executeTask() {
        taskFlag=true;
        return "Task " + taskName + " is executed. You need go by " + using + " to " + where;
    }

    @Override
    public boolean isTaskExecuted() {
        return taskFlag;
    }
}
