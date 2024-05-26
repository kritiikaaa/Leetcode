import java.util.Stack;

class MyQueue {
    private Stack<Integer> input;
    private Stack<Integer> output;

    // Constructor to initialize the stacks
    public MyQueue() {
        input = new Stack<>();
        output = new Stack<>();
    }

    // Pushes element x to the back of the queue.
    public void push(int x) {
        input.push(x);
    }

    // Removes the element from the front of the queue and returns it.
    public int pop() {
        if (!output.isEmpty()) {
            return output.pop();
        } else {
            while (!input.isEmpty()) {
                output.push(input.pop());
            }
            return output.pop();
        }
    }

    // Returns the element at the front of the queue.
    public int peek() {
        if (!output.isEmpty()) {
            return output.peek();
        } else {
            while (!input.isEmpty()) {
                output.push(input.pop());
            }
            return output.peek();
        }
    }

    // Returns true if the queue is empty, false otherwise.
    public boolean empty() {
        return input.isEmpty() && output.isEmpty();
    }

    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        myQueue.push(1);
        myQueue.push(2);
        System.out.println(myQueue.peek()); // returns 1
        System.out.println(myQueue.pop());  // returns 1
        System.out.println(myQueue.empty()); // returns false
    }
}
