package linkedlist;

public class Main {
    public static void main(String[] args) {

        // create the first node (head of the list)
        Node head = new Node(10);

        // Link the second node
        head.next = new Node(20);

        // link the third node
        head.next.next = new Node(30);

        // link te fourth node
        head.next.next.next = new Node(40);

        head.next.next.next.next = new Node(50);

        while (head != null) {
            System.out.println(head.data + " ");
            head = head.next;
        }
    }
}
