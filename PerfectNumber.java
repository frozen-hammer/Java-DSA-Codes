import java.io.*;
import java.util.*;

class Solution {
    
 public ArrayList<Integer> perfect(int n) {
        // your solutions goes here..
        if(n < 6){
            ArrayList<Integer> ar = new ArrayList<>();
            return ar;
        }
        ArrayList<Integer> res = perfect(n-1);
        int sum =0;
        for(int i=1; i<=n/2;i++){
            if(n % i == 0){
                sum+=i;
            }
        }
        if(sum == n){
            res.add(n);
        }
        return res;
    }
}

public class PerfectNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
 
        // Reading N and K
        String str = bufferedReader.readLine().trim();
        int n = Integer.parseInt(str);
        
        Solution solution = new Solution();
        ArrayList<Integer> result = solution.perfect(n);
        System.out.println(result);
    }
}