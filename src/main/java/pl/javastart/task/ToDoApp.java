package pl.javastart.task;

public class ToDoApp {
    public static void main(String[] args) {
        Person person1 = new Person("Jan", "Kowalski");
        Task task1 = new Task("Cleaning", "Clean table", 1, person1);
        Person person2 = new Person("Jana", "Kowalska");
        Task task2 = new Task("Washing", "Wash dishes", 0, person2);
        Task task3 = new Task("Watering", "Water flowers", -1, person2);
        System.out.println(task1.lowPriority());
        System.out.println(task2.mediumPriority());
        System.out.println(task3.highPriority());
    }
}
