//step one class node 

public class single_linklist_ex {

    static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;

        }

    }
    Node head;

    //step two
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;

        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;

        }
        temp.next = newNode;
    }

    //step three -insert at beginning
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;

    }

    //step 4 delete by value
    public void delete(int key) {
        if (head == null) {
            System.out.println("LinkedList is Empty");
            return;

        }
        if (head.data == key) {
            head = head.next;
            return;

        }
        Node temp = head;
        while (temp.next != null && temp.next.data != key) {
            temp = temp.next;
        }
        if (temp.next == null) {
            System.out.println("value not found");
        } else {
            temp.next = temp.next.next;
        }

    }

    //step 5 display
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        single_linklist_ex list = new single_linklist_ex();
        list.insertAtEnd(1);
        list.insertAtEnd(2);
        list.insertAtEnd(3);
        list.display();
        list.insertAtBeginning(4);
        list.delete(2);

    }
}
