public class Task {

    private TaskPriority taskPriority;
    private String description;

    public Task(TaskPriority taskPriority, String description) {
        this.taskPriority = taskPriority;
        this.description = description;
    }

    public TaskPriority getPriority() {
        return taskPriority;
    }

    public String getDescription() {
        return description;
    }
}