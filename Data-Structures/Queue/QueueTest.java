package Queue;

/**
 * Programmer: Jiho Shin
 */

public class QueueTest {
    public static void main(String[] args) {
        QueueReferenceBased aQueue = new QueueReferenceBased();
        for (int i = 0; i < 50; i++) {
            aQueue.enqueue(i);
        } // end for

        for (int i = 0; i < 50; i++) {
            System.out.println(aQueue.dequeue());
        }
    } // end main
}
// end QueueTest
