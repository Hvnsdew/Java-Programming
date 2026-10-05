package adtlinkedlist;

/**
 * Programmer: Jiho
 */

public class ADTGroceryList {

    private int size;
    private Node head;

    public ADTGroceryList() {
        head = null;

        size = 0;
    }

    public ADTGroceryList(String[] listItems) {
        Node newNode = new Node(listItems[0]);
        Node nextNode;

        head = newNode;
        for (int i = 1; i < listItems.length; i++) {
            nextNode = new Node(listItems[i]);
            newNode.setNext(nextNode);
            newNode = nextNode;
        }
        size = listItems.length;
    }

    public void addItem(int index, String newItem) {

        Node newNode = new Node(newItem);
        if (index < 0 || index > size) {
            System.out.println(index + " is an invalid index number for the item " + newItem);
            return;
        }
        if (index == 0) {
            newNode.setNext(head);
            head = newNode;
            size++;
            return;
        }

        Node pointer = head;

        for (int i = 0; i < index - 1; i++) {
            pointer = pointer.getNext();
        }
        Node temp = pointer.getNext();
        pointer.setNext(newNode);
        newNode.setNext(temp);
        size++;
    }

    public String getItem(int index) {
        Node pointer = head;
        if (index >= 0 && index < size) {
            for (int i = 0; i < index; i++) {
                pointer = pointer.getNext();
            }
            return pointer.getItem();
        } else
            return "";

    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        if (size == 0)
            return true;
        else
            return false;
    }

    public String toString() {
        Node pointer = head;
        String result = "";

        for (int i = 0; i < size; i++) {
            result = result + pointer.getItem() + "\n";
            pointer = pointer.getNext();
        }

        return result;
    }

public void removeItem(int index) {
    if (index < 0 || index >= size || head == null) {
        System.out.println(index + " is an invalid index number.");
        return;
    }

    if (index == 0) {
        head = head.getNext();
        size--;
        return;
    }

    Node pointer = head;
    for (int i = 0; i < index - 1; i++) {
        pointer = pointer.getNext();
    }

    Node target = pointer.getNext();
    if (target != null) {
        pointer.setNext(target.getNext());
        target.setNext(null);
        size--;
    }
}

    public void removeAll() {
        head=null;
        size = 0;
        
       
    }
}
