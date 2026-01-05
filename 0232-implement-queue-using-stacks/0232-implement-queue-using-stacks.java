import java.util.Stack;

class MyQueue {

    Stack<Integer> in;
    Stack<Integer> out;

    public MyQueue() {
        in = new Stack<>();
        out = new Stack<>();
    }

    public void push(int x) {
        in.push(x);
    }

    public int pop() {
        if (out.isEmpty()) {
            moveInToOut();
        }
        return out.pop();
    }

    public int peek() {
        if (out.isEmpty()) {
            moveInToOut();
        }
        return out.peek();
    }

    public boolean empty() {
        return in.isEmpty() && out.isEmpty();
    }

    private void moveInToOut() {
        while (!in.isEmpty()) {
            out.push(in.pop());
        }
    }
}