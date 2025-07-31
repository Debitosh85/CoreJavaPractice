package Test;

abstract class Task {
    protected String taskName;
    protected int priority;

    public Task(String taskName, int priority) {
        this.taskName = taskName;
        this.priority = priority;
    }

    public abstract String completeTask();

    public abstract String displayTaskInfo();

    public String displayPriority() {
        return "Priority level: " + priority;
    }
}

class AssignmentTask extends Task {
    private String dueDate;

    public AssignmentTask(String taskName, int priority, String dueDate) {
        super(taskName, priority);
        this.dueDate = dueDate;
    }

    @Override
    public String completeTask() {
        return "Task " + taskName + " is completed.";
    }

    @Override
    public String displayTaskInfo() {
        return "Task Name: " + taskName + "\nPriority: " + priority + "\nDue Date: " + dueDate;
    }
}

