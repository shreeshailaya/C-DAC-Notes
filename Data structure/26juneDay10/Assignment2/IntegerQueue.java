package Assignment2;

class Node {
    int data;
    Node next;
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class IntegerQueue {
    private Node head;

    public IntegerQueue() {
        this.head = null;
    }

    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null || head.data < data) {
            newNode.next = head;
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null && current.next.data >= data) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
    }
    public int poll() {
        if (head == null) {
            System.out.println("Priority Queue is empty");
        }
        int value = head.data;
        head = head.next;  
        return value;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int peek() {
        if (head == null) {
            System.out.println("Priority Queue is empty");
        }
        return head.data;
    }
}


