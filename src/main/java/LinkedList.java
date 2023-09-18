import javax.xml.soap.Node;

public class LinkedList {
    Node head;
    int size;

    LinkedList() {
        size = 0;
    }

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addFirst(String data) {
        Node newnode = new Node(data);
        newnode.next = head;
        head = newnode;
    }

    public void addLast(String data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            return;
        }
        Node lastnode = head;
        while (lastnode.next != null) {
            lastnode = lastnode.next;
        }
        lastnode.next = newnode;


    }

    public void printList() {
        Node currentnode = head;
        while (currentnode != null) {
            System.out.println(currentnode.data + " ");
            currentnode = currentnode.next;

        }
        System.out.println("null");
    }

    public void removeFirst() {
        if (head == null) {
            System.out.println("not possible");
            return;
        }
        head = this.head.next;
    }

    public void removeLast() {
        if (head == null) {
            System.out.println("not possible");
            return;
        }
        if (head.next == null) {
            head = head.next;
            return;
        }
        Node currentnode = head;
        Node lastnode = head.next;
        while (lastnode.next != null) {
            currentnode = currentnode.next;
            lastnode = lastnode.next;
        }
        currentnode.next = null;

    }

    public int getSize() {
        return size;
    }

    public static void main(String args[]) {
        LinkedList list = new LinkedList();
        list.addLast("is");
        list.addLast("a");
        list.addLast("list");
        list.printList();
        list.addFirst("this");
        list.printList();
        System.out.println(list.getSize());
        list.removeFirst();
        list.printList();
        list.removeLast();
        list.printList();
    }
}



