import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

                ArrayList<User> users = new ArrayList<>();

                User user1 = new User("Amy");
                User user2 = new User("Billy");
                users.add(user1);
                users.add(user2);

                user1.insertTask("Finish Sprint", false, 0);
                user1.insertTask("Complete AWS labs", false, 0);

                user2.insertTask("Go for a hike", true, 0);
                user2.insertTask("Put away laundry", false, 0);

                for (User user : users) {
                    user.traverseTasks();
        }

        user1.changeStatus(true, 1);
        user2.changeStatus(false, 1);
        user1.traverseTasks();
        user2.traverseTasks();

    }
}