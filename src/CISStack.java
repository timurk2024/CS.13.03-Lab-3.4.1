import java.util.LinkedList;

public class CISStack {

    // Linked list property.
    private LinkedList<Integer> stack;

    // Size property.
    private int size;

    // Constructor.
    public CISStack() {
        stack = new LinkedList<>();
        size = 0;
    }

    // Push. This method pushes a value onto the top of the stack.
    public void push(int value) {
        stack.addLast(value);
        size++;
    }

    // Pop. This method pops a value from the top of the stack.
    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Cannot pop from an empty stack.");
        }
        size--;
        return stack.removeLast();
    }

    // isEmpty. Returns a boolean indicating whether the linked list is empty.
    public boolean isEmpty() {
        return size == 0;
    }

    // size. Returns the size of the queue.
    public int size() {
        return size;
    }

    // toString. Returns a description of the queue in, for example, the following format:
    // CISStack{stack=[7, 11], size=2}
    @Override
    public String toString() {
        return "CISStack{stack=" + stack + ", size=" + size + "}";
    }
}
