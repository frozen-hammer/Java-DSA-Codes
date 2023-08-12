// Given an array of size N-1 such that it only contains distinct integers in the range of 1 to N. Find the missing element.

// Example 1:

// Input:
// N = 5
// A[] = {1,2,3,5}
// Output: 4
// Example 2:

// Input:
// N = 10
// A[] = {6,1,2,8,3,4,7,10,5}
// Output: 9

import java.util.Arrays;

public class MissingNumberInArray {
    public static void main(String[] args) {
        int n = 10;
        int ar[] = {6,1,2,8,3,4,7,10,5};
        System.out.println(missingNumber(n,ar));
    }

    static int missingNumber(int n , int [] ar){
        Arrays.sort(ar);
        return findMissingNumber(0,n,ar);
    }

    static int findMissingNumber(int temp,int n,int [] ar){
        if(ar[n] != n-1){
            return n-1;
        }

        return findMissingNumber(n-1,ar);
    }
}
