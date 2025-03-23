package DSA.Os;

import java.util.*;

public class LRU {
    Node head = new Node(0, 0);
    Node tail = new Node(0, 0);
    Map < Integer, Node > map = new HashMap();
    int capacity;

    public LRU(int _capacity) {
        capacity = _capacity;
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

    public void put(int key, int value) {
        if (map.containsKey(key)) {
            remove(map.get(key));
        }
        if (map.size() == capacity) {
            remove(tail.prev);
        }
        insert(new Node(key, value));
    }

    private void remove(Node node) {
        map.remove(node.key);
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    private void insert(Node node) {
        map.put(node.key, node);
        node.next = head.next;
        node.next.prev = node;
        head.next = node;
        node.prev = head;
    }

    class Node {
        Node prev, next;
        int key, value;
        Node(int _key, int _value) {
            key = _key;
            value = _value;
        }
    }

    public void displayCache(){
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.key+" "+ temp.value);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        LRU cache = new LRU(4);
        cache.put(7,1);
        cache.put(0,2);
        cache.put(1,3);
        cache.put(2,4);
        cache.put(0,5);

        cache.put(3,5);
        System.out.println(cache.get(7));

        cache.displayCache();
    }
}