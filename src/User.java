import java.util.HashSet;

public class User {
    private static HashSet<String> userNames = new HashSet<>();
    String name;
    TaskList taskList;

    public User(String name) throws IllegalArgumentException {
        if (userNames.contains(name)) {
            throw new IllegalArgumentException("Error - Username already exists.");
        } else {
            this.name = name;
            this.taskList = new TaskList();
            userNames.add(name);
        }
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
