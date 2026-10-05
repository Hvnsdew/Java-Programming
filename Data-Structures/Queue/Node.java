package Queue;
/**
 * Programmer: Jiho Shin
 */
class Node {
    public Object item;
    public Node next;

    public Node() {
        item = "";
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
