package Programming.linkedList;

class Node{
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        next = null;
    }

}

public class SinglyLinkedList {
    Node head;

    public SinglyLinkedList() {
        this.head = null;
    }
    public void printLinkedList(){
        Node current = this.head;
        if(current == null){
            System.out.println("Linked list is empty");
            return;
        }
        while(current.next != null){
            System.out.print(current.data);
            System.out.print("-->");
            current = current.next;
        }
        System.out.println(current.data);
    }


//   insert node into Linked List
    public void insert(int data) {
        Node node = new Node(data);
        if (this.head == null) {
            head = node;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = node;
    }

    public static void main(String[] args) {
        SinglyLinkedList ll = new SinglyLinkedList();
        ll.printLinkedList();
        ll.insert(1);
        ll.printLinkedList();
        ll.insert(2);
        ll.insert(3);
        ll.printLinkedList();
    }
}
