// Find Nth Largest Element in an Array

import java.util.Arrays;

public class NthLargestElement {

    static void nLargest(int[] ar,int n){
        Arrays.sort(ar);
        if(n>ar.length){
            throw new RuntimeException("ArrayOutOfBound");
        }
        System.out.println("The "+n+" Largest Element is: "+ar[ar.length-n]);
    }
    public static void main(String[] args) {
        int arr[] = {1000,2000,90,100,1,444};
        nLargest(arr,4);     
    }
}
