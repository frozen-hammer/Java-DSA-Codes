import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class MaxElementQueue {
    private Queue<Integer> queue;
    private Deque<Integer> maxDeque;

    public MaxElementQueue(){
        queue = new LinkedList<>();
        maxDeque = new LinkedList<>();
    }
    public void enqueue(int value){
        queue.offer(value);
        while(!maxDeque.isEmpty() && maxDeque.peekLast()<value){
            maxDeque.removeLast();
        }
        maxDeque.addLast(value);
    }

    public int dequeue(){
        if(queue.isEmpty()){
            throw new IllegalStateException("Queue is empty, cannot perform dequeue operation");
        }
        int dequeuedValue = queue.poll();
        if(dequeuedValue == maxDeque.peekFirst()){
            maxDeque.removeFirst();
        }
        return dequeuedValue;
    }

    public int getMax(){
        if(maxDeque.isEmpty()){
            throw new IllegalStateException("Queue is empty");
        }
        return maxDeque.peekFirst();
    }
    public static void main(String[] args) {
        MaxElementQueue maxQueue = new MaxElementQueue();
        
        maxQueue.enqueue(51);
        maxQueue.enqueue(10);
        maxQueue.enqueue(12);
        maxQueue.enqueue(50);
        maxQueue.enqueue(20);
        maxQueue.enqueue(15);
        
        
        System.out.println("Maximum Element in the Queue is : "+ maxQueue.getMax());
        maxQueue.dequeue();
        System.out.println("Maximum Element in the Queue is : "+ maxQueue.getMax());
    }
}
