import java.util.LinkedList;
import java.util.Queue;

public class ReorderQueue {
    public static void reorder(Queue<Integer> queue){
        if(queue.size()%2 != 0){
            System.out.println("Input array is of even size");
            return;
        }
        Queue<Integer> temp = new LinkedList<>();
        int halfSize = queue.size()/2;
        for(int i=0; i<halfSize;i++){
            temp.add(queue.poll());
        }
        while(!temp.isEmpty()){
            queue.add(temp.poll());
            queue.add(queue.poll());

        }
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        queue.add(6);
        reorder(queue);
        for(int i : queue){
            System.out.println(i+" ");
        }
    }
}
