import java.util.ArrayList;

public class StackWithArrayList {
    private ArrayList<Integer> stack;
    
    public StackWithArrayList(){
        stack = new ArrayList<>();
    }

    public void push(int x){
        stack.add(x);
        System.out.println("Push Element "+stack.get(stack.size()-1));
    }

    public int pop(){
        if(isEmpty()){
            throw new IllegalStateException("Stack is Empty");
        }

        int lastIndex = stack.size()-1;
        return stack.remove(lastIndex);
    }

    public boolean isEmpty(){
        return stack.isEmpty();
    }

    public int peek(){
        int lastIndex = stack.size()-1;
        return stack.get(lastIndex);
    }

    public int size(){
        return stack.size();
    }

    public static void main(String[] args) {
        StackWithArrayList stack = new StackWithArrayList();
        stack.push(10);
        stack.push(11);
        stack.push(12);
        stack.push(13);
        stack.push(14);
        stack.pop();
        System.out.println(stack.size());
        System.out.println(stack.peek());
    }

}
