// import java.util.Arrays;

public class MedianOfTwoArrays {
    static double MedianOfSortedArrays(int[] ar1,int[] ar2){
        int n1 = ar1.length;
        int n2 = ar2.length;
        int total = n1+n2;
        int [] ar3 = new int[n1+n2];
        int c = 0;
        // for(int i=0; i<n1;i++){
        //     ar3[c] = ar1[i];
        //     c+=1;
        // }
        // for(int i=0; i<n2;i++){
        //     ar3[c] = ar2[i];
        //     c+=1;
        // }
        // Arrays.sort(ar3);
        int i = 0;
        int j = 0;
        while(i<n1 && j<n2){
            
            if(i == n1-1){
                while(j<n2){
                    ar3[c++] = ar2[j++];
                    break;
                }
            }
            else if(j == n2-1){
                while(i<n1){
                    ar3[c++] = ar1[i++];
                    break;
                }
            }

            if(ar1[i]<ar2[j]){
                ar3[c] = ar1[i];
                i++;
                c++;
            }
            else{
                ar3[c] = ar2[j];
                j++;
                c++;
            }

        }

        if((total%2) == 0){
            return ((float)(ar3[total/2 - 1]+ar3[total/2])/2);
        }
        else{
            return (float)ar3[total/2];
        }

    }
    public static void main(String[] args) {
        int [] ar1 = {1,2,3};
        int [] ar2 = {4,5,6};
        System.out.println(MedianOfSortedArrays(ar1,ar2));
    }
}
