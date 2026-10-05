package phase1;

public class StackArrayBased implements StackInterface {
    int MAX_STACK = 50; 
    private Object items[];
    private int top;

    public StackArrayBased() { 
        items = new Object[MAX_STACK];
        top = -1;
    } 

    public boolean isEmpty() {
        return top < 0;
    } 

    public boolean isFull() {
        return top == MAX_STACK - 1;
    } 

    public void push(Object newItem) throws StackException {
        if (!isFull()) {
            items[++top] = newItem;
        } else {
            Object[] temp = items;
            items = new Object[temp.length * 2];
            for (int i = 0; i < temp.length; i++) {
                items[i] = temp[i];
            }
            items[++top] = newItem;
            MAX_STACK = items.length;
        } 
    } 

    public void popAll() {
        items = new Object[MAX_STACK];
        top = -1;
    } 

    public Object pop() throws StackException {
        if (!isEmpty()) {
            return items[top--];
        } else {
            throw new StackException("StackException on " +
                    "pop: stack empty");
        } 
    }

    public Object peek() throws StackException {
        if (!isEmpty()) {
            return items[top];
        } else {
            throw new StackException("Stack exception on " +
                    "peek - stack empty");
        } 
    } 
} 