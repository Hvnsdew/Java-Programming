package phase2;

    public class StackReferenceBased implements StackInterface {
    private Node top;

    public StackReferenceBased() {
        top = null;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void push(Object newItem) {
        top = new Node(newItem, top);
    }

   public Object pop() throws StackException {
        if (!isEmpty()) {
            Object tempItem = top.getItem();
            top = top.getNext();
            return tempItem;
        } else {
            throw new StackException("StackException on " +
                    "pop: stack empty");
        }
    } 

    public void popAll() {
        top = null;
    } 

    public Object peek() throws StackException {
        if (!isEmpty()) {
            return top.getItem();
        } else {
            throw new StackException("StackException on " +
                    "peek: stack empty");
        } 
    } 
} 