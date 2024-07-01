import java.util.ArrayList;
import java.util.LinkedList;

public class User {
    String name;
    TaskList taskList;

    public User(String name) {
        this.name = name;
        this.taskList = new TaskList();
    }

    public void insertTask(String taskDescription, boolean status, int location) {
        taskList.insertTask(taskDescription, status, location);
    }

    public void traverseTasks() {
        System.out.println(name + "'s Tasks:");
        taskList.traverseTasks();
    }

    public void changeStatus(boolean status, int location) {
        taskList.changeStatus(status, location);
    }
}
