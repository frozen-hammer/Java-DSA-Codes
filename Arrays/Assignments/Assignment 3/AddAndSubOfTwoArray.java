import java.util.ArrayList;
import java.util.Arrays;


public class AddAndSubOfTwoArray {

    static void addArrays(int [] arr1, int[] arr2){
        int carry = 0;
        int sum;
        ArrayList<Integer> res = new ArrayList<>();
        for(int i =arr1.length-1; i>=0;i--){
            sum = (arr1[i]+arr2[i]);
            if(sum > 9){
                res.add(0,(sum%10)+carry);
                carry = sum/10;
            }else{
                res.add(0,sum+carry);
                carry = 0;
            }
        }

        if(carry!=0){
            res.add(0, carry);
        }
        
        Integer[] arr = new Integer[res.size()];

        for(int i=0;i<arr.length;i++){
            arr[i] = res.get(i);
        }
        
        System.out.println(Arrays.toString(arr));
    }

    static void subArrays(int [] arr1, int[] arr2){
        if(arr1.length != arr2.length){
            System.out.println("Size of Both Array should be same");
            return;
        }

        int sub;
        ArrayList<Integer> res = new ArrayList<>();
        for(int i = Math.max(arr1.length, arr2.length)-1; i>=0; i--){
            sub = (arr1[i] - arr2[i]);
            if(sub<0){
                arr1[i] = arr1[i] + 10;
                arr1[i-1] = arr1[i-1] - 1;
                sub = arr1[i] - arr2[i];
            }
            res.add(0,sub);
        }

        Integer[] arr = new Integer[res.size()];

        for(int i=0;i<arr.length;i++){
            arr[i] = res.get(i);
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int [] arr1 = {9,1,4,2};
        int [] arr2 = {1,2,7,4};
        addArrays(arr1,arr2);
        subArrays(arr1, arr2);
    }
}
