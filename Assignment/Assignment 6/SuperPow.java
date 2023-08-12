// Your task is to calculate ab mod 1337 where a is a positive integer and b is an extremely large positive integer given in the form of an array.

 

// Example 1:

// Input: a = 2, b = [3]
// Output: 8
// Example 2:

// Input: a = 2, b = [1,0]
// Output: 1024
// Example 3:

// Input: a = 1, b = [4,3,3,8,5,2]
// Output: 1

public class SuperPow {
    public static void main(String[] args) {
        int a = 2;
        int [] b = {1,0,2};

        System.out.println(superPow(a, b, b.length-1));
    }

    static int superPow(int a,int [] b,int index){
        if(index < 0){
            return 1;
        }
        superPow(a, b, index-1);
        return Math.pow()
    }
}
