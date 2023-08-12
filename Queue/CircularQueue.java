public class CircularQueue {
    int [] arr;
    int front;
    int rear;
    int size;
    int count;
    CircularQueue(int size){
        this.size = size;
        this.arr = new int[size];
        this.front = 0;
        this.rear = -1;
        this.count = 0;
    }

    public void enqueue(int value){
        if(isFull()){
            System.out.println("Queue is full can't perform enqueue");
            return;
        }
        rear = (rear+1)%size;
        arr[rear] = value;
        count++;
    }

    public int dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty can't perform dequeue");
            return -1;
        }
        int val = arr[front];
        front = (front + 1);
        count--;
        return val;
    }
   
    public int peek(){
        if(isEmpty()){
            System.out.println("Queue is empty can't perform peek");
            return -1;
        }
        return arr[front];
    }

    public boolean isEmpty(){
        return count == 0;
    }

    public boolean isFull(){
        return count == size;
    }

    public static void main(String[] args) {
        CircularQueue queue = new CircularQueue(5);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        System.out.println("Front element is "+queue.peek());
        queue.dequeue();
        queue.dequeue();
        System.out.println("Front element is "+queue.peek());
        queue.enqueue(5);
        queue.enqueue(6);
    }
}
