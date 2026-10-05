package phase2;

    public interface StackInterface {
    /**
     * Determines whether the stack is empty.
     * 
     * @return true if the stack is empty; otherwise false.
     */
    public boolean isEmpty();
    /**
     * Removes all the items from the stack.
     */
    public void popAll();
    /**
     * Adds an item to the top of the stack.
     * 
     * @param newItem the item to be added.
     * @throws StackException if the stack cannot accept new items.
     */
    public void push(Object newItem) throws StackException;
    /**
     * Removes and returns the item at the top of the stack.
     * 
     * @return the item that was added most recently.
     * @throws StackException if the stack is empty.
     */
    public Object pop() throws StackException;
    /**
     * Retrieves the item at the top of the stack without removing it.
     * 
     * @return the item at the top of the stack.
     * @throws StackException if the stack is empty.
     */
    public Object peek() throws StackException;   
}
