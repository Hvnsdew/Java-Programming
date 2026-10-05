package Queue;

/**
 * Programmer: Jiho Shin
 */

public class QueueReferenceBased implements QueueInterface {
    private Node head, tail;

    public QueueReferenceBased() {
        head = null;
        tail = null;
    } // end default constructor
      // queue operations:

    public boolean isEmpty() {
        return head == null;
    } // end isEmpty

    public void dequeueAll() {
        tail = null;
        head = null;
    } // end dequeueAll

    public void enqueue(Object newItem) {
        Node newNode = new Node(newItem);
        // insert the new node
        if (isEmpty()) {
            // insertion into empty queue
            head = newNode;
        } else {
            // insertion into nonempty queue
            tail.next = newNode;
        } // end if
        tail = newNode; // new node is at back
    } // end enqueue

    public Object dequeue() throws QueueException {
        if (!isEmpty()) {
            // queue is not empty; remove front
            Object temp = head.item;
            if (head == tail) {
    head = null;
    tail = null; 
} else {
    head = head.next;[cite: 15]
} // end if
            return temp;
        } else {
            throw new QueueException("QueueException on dequeue:"
                    + "queue empty");
        } // end if
    } // end dequeue

public Object peek() throws QueueException {
    if (!isEmpty()) {
        return head.item;
    } else {
        throw new QueueException("QueueException on peek: queue empty");[cite: 15]
    }
} // end peek
} // end QueueReferenceBased
