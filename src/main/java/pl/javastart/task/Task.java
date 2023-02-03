package pl.javastart.task;

public class Task {
    String title;
    String description;
    int priority;
    Person person;

    public Task(String title, String description, int priority) {
        this(title, description);
        this.priority = priority;
    }

    public Task(String title, String description, Person person) {
        this(title, description);
        this.person = person;
    }

    public Task(String title, String description, int priority, Person person) {
        this(title, description);
        this.priority = priority;
        this.person = person;
    }

    public Task(String title, String description) {
        this.title = title;
        this.description = description;
    }

    boolean highPriority() {
        return priority > 0;
    }

    boolean mediumPriority() {
        return priority == 0;
    }

    boolean lowPriority() {
        return priority < 0;
    }
}
