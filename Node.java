package adtlinkedlist;


public class Node {
    private String item;
    private Node next;

    public Node() {
        item = "";
        next = null;
    }

    public Node(String newItem) {
        setItem(newItem);
        next = null;
    }

    public Node(String newItem, Node newNext) {
        setItem(newItem);
        next = newNext;
    }

    public void setItem(String newItem) {
        item = newItem;
    }

    public String getItem() {
        return item;
    }

    public void setNext(Node newNext) {
        next = newNext;
    }

    public Node getNext() {
        return next;
    }
}
