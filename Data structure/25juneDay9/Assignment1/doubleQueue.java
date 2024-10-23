package Assignment1;

import java.util.Deque;
import java.util.LinkedList;

public class doubleQueue {
    private Deque<Integer> deque;

    public doubleQueue() {
        deque = new LinkedList<>();
    }

    public void push_front(int element) {
        deque.addFirst(element); 
    }

    public void push_back(int element) {
        deque.addLast(element);   
    }

    public int pop_front() {
        if (!deque.isEmpty()) {
            return deque.removeFirst(); 
        } else {
            throw new RuntimeException("Deque is empty!");
        }
    }

    public int pop_back() {
        if (!deque.isEmpty()) {
            return deque.removeLast();
        } else {
            throw new RuntimeException("Deque is empty!");
        }
    }

    public int front() {
        if (!deque.isEmpty()) {
            return deque.getFirst();  
        } else {
            throw new RuntimeException("Deque is empty!");
        }
    }

    public int back() {
        if (!deque.isEmpty()) {
            return deque.getLast();    
        } else {
            throw new RuntimeException("Deque is empty!");
        }
    }

}
