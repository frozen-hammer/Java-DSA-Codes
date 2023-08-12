
public class TOH {
    public static void towerOfHanoi(int n, String src, String helper, String dest) {
        if(n == 1) {
            System.out.println("transfer disk " + n + " from " + src + " to " + dest);
            return;
    }
        //transfer top n-1 from src to helper using dest as 'helper'
        towerOfHanoi(n-1, src, dest, helper);

        //transfer nth from src to dest
        // towerOfHanoi(1, src, helper, dest); 
        System.out.println("transfer disk " + n + " from " + src + " to " + dest); // Instead of calling towerOfHanoi once more for n=1 we can directly write this print statement

        //transfer n-1 from helper to dest using src as 'helper'
        towerOfHanoi(n-1, helper, src, dest);
    }
    
    public static void main(String[] args) {
        int n = 3;
        towerOfHanoi(n,"A", "B", "C");
    }
}
