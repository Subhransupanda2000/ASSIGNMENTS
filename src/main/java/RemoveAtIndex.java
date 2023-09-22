import java.io.*;

public class RemoveAtIndex {
    public static class Node {
        int data;
        Node next;
    }

    public static class LinkedList {
        Node head;
        Node tail;
        int size;

        void addLast(int val) {
            Node temp = new Node();
            temp.data = val;
            temp.next = null;

            if (size == 0) {
                head = tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }

            size++;
        }

        public int size() {
            return size;
        }

        public void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        public void removeFirst() {
            if (size == 0) {
                System.out.println("List is empty");
            } else if (size == 1) {
                head = tail = null;
                size = 0;
            } else {
                head = head.next;
                size--;
            }
        }

        public void removeLast() {
            if (size == 0) {
                System.out.println("List is empty");
            } else if (size == 1) {
                head = tail = null;
                size = 0;
            } else {
                Node temp = head;
                while (temp.next != tail) {
                    temp = temp.next;
                }

                temp.next = null;
                tail = temp;
                size--;
            }
        }

        public void removeAt(int idx) {
            if (idx < 0 || idx >= size) {
                System.out.println("Invalid index");
            } else if (idx == 0) {
                removeFirst();
            } else if (idx == size - 1) {
                removeLast();
            } else {
                Node temp = head;
                for (int i = 0; i < idx - 1; i++) {
                    temp = temp.next;
                }
                int removeElement= temp.data;
                temp.next = temp.next.next;
                size--;
                System.out.println(removeElement);
            }

        }

        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            LinkedList list = new LinkedList();

            String str = br.readLine();
            while (!str.equals("quit")) {
                if (str.startsWith("addLast")) {
                    int val = Integer.parseInt(str.split(" ")[1]);
                    list.addLast(val);
                } else if (str.startsWith("size")) {
                    System.out.println(list.size());
                } else if (str.startsWith("display")) {
                    list.display();
                } else if (str.startsWith("removeAt")) {
                    int idx = Integer.parseInt(str.split(" ")[1]);
                    list.removeAt(idx);
                }
                str = br.readLine();
            }
        }
    }
}
