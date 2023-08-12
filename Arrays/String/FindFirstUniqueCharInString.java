import java.util.HashMap;

public class FindFirstUniqueCharInString {
    static int firstUnique(String str){
        HashMap<Character,Integer> count = new HashMap<>();
        int n = str.length();
        for(int i=0 ; i<n; i++){
            char c = str.charAt(i);
            count.put(c, count.getOrDefault(c,0)+1);
        }

        for(int i=0;i<n;i++){
            if((count.get(str.charAt(i))) == 1){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String str = "leeltcode";
        System.out.println(firstUnique(str));
    }
}
