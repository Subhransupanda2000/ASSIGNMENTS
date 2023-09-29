package Collection;
import java.util.HashMap;
import java.util.Map;

class Node {
    Node prev;
    Node next;
    int key;
    int value;

    public Node(int key, int value) {
        this.key = key;
        this.value = value;
    }
}

public class LruCache {
    private Node head = new Node(0, 0);
    private Node tail = new Node(0, 0);
    private Map<Integer, Node> map = new HashMap<>();
    private int capacity;

    public LruCache(int capacity) {
        this.capacity = capacity;
        head.next = tail;
        tail.prev = head;
    }

    public int get(int key) {
        if (map.containsKey(key)) {
            Node node = map.get(key);
            remove(node);
            insert(node);
            return node.value;
        } else {
            return -1;
        }
    }

    private void remove(Node node) {
        map.remove(node.key);
        node.next.prev = node.prev;
        node.prev.next = node.next;
    }

    private void insert(Node node) {
        map.put(node.key, node);
        node.next = head.next;
        node.next.prev = node;
        head.next = node;
        node.prev = head;
    }

    public void put(int key, int value) {
        if (map.containsKey(key)) {
            remove(map.get(key));
        }
        if (map.size() >= capacity) {
            remove(tail.prev);
        }
        insert(new Node(key, value));
    }

    public void display() {
        Node current = head.next;
        while (current != tail) {
            System.out.println("Key: " + current.key + ", Value: " + current.value);
            current = current.next;
        }
    }

    public static void main(String[] args) {
        LruCache cache = new LruCache(2);
        cache.put(1, 10);
        cache.put(3, 15);
        cache.put(2, 12);
        cache.get(3);
        cache.put(4, 20);
        cache.get(2);
        cache.put(4, 25);
        cache.display();
    }
}
