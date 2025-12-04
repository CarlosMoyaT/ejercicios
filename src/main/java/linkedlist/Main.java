package linkedlist;

public class Main {
    public static void main(String[] args) {

        // create the first node (head of the list)
        Node head = new Node("first");

        // Link the second node
        head.next = new Node("second");

        // link the third node
        head.next.next = new Node("thirtd");

        // link te fourth node
        head.next.next.next = new Node("fourth");

        head.next.next.next.next = new Node("fifth");

        while (head != null) {
            System.out.println(head.data + " ");
            head = head.next;
        }
    }
}
