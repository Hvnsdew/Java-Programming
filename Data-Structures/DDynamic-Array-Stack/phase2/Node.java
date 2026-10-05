package phase2;

/*
 * Programmer: Jiho Shin
 */
public class Node {
    private Object item;
    private Node next;

    public Node() {
        item = null;
        next = null;
    }

    public Node(Object newItem) {
        setItem(newItem);
        next = null;
    }

    public Node(Object newItem, Node newNext) {
        setItem(newItem);
        next = newNext;
    }

    public void setItem(Object newItem) {
        item = newItem;
    }

    public Object getItem() {
        return item;
    }

    public void setNext(Node newNext) {
        next = newNext;
    }

    public Node getNext() {
        return next;
    }
}
