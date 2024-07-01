import java.util.LinkedList;

public class TaskList {
    private Node head;
    private Node tail;
    public int size;

    public void insertTask(String taskDescription, boolean status, int location){
        Node node = new Node(new Task(taskDescription, status));
        // Added the creating a Linked List here.
        if(head == null) {
            head = node;
            tail = node;
            size = 1;
            return;
        } else if (location == 0) {
            node.next = head;
            head = node;
        } else if (location >= size) {
            tail.next = node;
            node.next = null;
            tail = node;
        } else {
            Node tempNode = head;
            int index = 0;
            while (index < location - 1) {
                tempNode = tempNode.next;
                index++;
            }

            Node nextNode = tempNode.next;
            tempNode.next = node;
            node.next = nextNode;
        }
        size++;
    }

    public void traverseTasks(){
        if (head == null) {
            System.out.println("No tasks.");
        } else {
            Node tempNode = head;
            System.out.print("\n");
            for (int i = 0; i < size; i++){
                String statusString = tempNode.task.status ? "Completed" : "Pending";
                System.out.println("- " + tempNode.task.description + " [Status: " + statusString + "]");
                tempNode = tempNode.next;
            }
        }
        System.out.print("\n");
    }

    public void changeStatus(boolean status, int location) {
        if (location < 0 || location >= size) {
            System.out.println("Invalid location.");
            return;
        }

        Node tempNode = head;
        for (int i = 0; i < location; i++) {
            tempNode = tempNode.next;
        }

        tempNode.task.status = status;
    }
}
