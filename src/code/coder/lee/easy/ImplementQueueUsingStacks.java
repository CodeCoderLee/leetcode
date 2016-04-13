package code.coder.lee.easy;

import java.util.Stack;

/**
 * Created by bcc on 16/3/28.
 */
public class ImplementQueueUsingStacks {
    public Stack<Integer> head;
    public Stack<Integer> tail;
}

class MyQueue{
    private Stack<Integer> head = new Stack<>();
    private Stack<Integer> tail = new Stack<>();
    // Push element x to the back of queue.
    public void push(int x) {
        tail.push(x);
    }

    // Removes the element from in front of queue.
    public void pop() {
        if (!head.empty()){
           head.pop();
        }else if (!tail.empty()){
            while (!tail.empty()){
                head.push(tail.pop());
            }
            head.pop();
        }
    }

    // Get the front element.
    public int peek() {
        if (head.empty()&&tail.empty()){
            return -1;
        }
        if (!head.empty()){
            return head.peek();
        }else{
            while (!tail.empty()){
                head.push(tail.pop());
            }
            return head.peek();
        }
    }

    // Return whether the queue is empty.
    public boolean empty() {
        return head.empty()&&tail.empty();
    }
}
