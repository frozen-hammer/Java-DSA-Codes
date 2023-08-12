import java.util.Stack;

public class ReverseAStatementUsingStack {
    public static void main(String args[]){
        String s = "The sky is blue";
        String arr[] = s.split(" ");
        Stack<String> st = new Stack<>();
        for(String str: arr)
            st.push(str);
        String result = "";

 

        while(!st.isEmpty())
            result += st.pop() + " ";
        result.trim();
        System.out.println(result);
    }
}
