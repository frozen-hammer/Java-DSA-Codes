public class MaxInSubArray {
    
    static int [] maxInSubArray(int [] arr, int k){
        int n = arr.length;
        int ans[] = new int[n-k+1];

        for(int i=0; i<=n-k; i++){
            int max = arr[i];
            for(int j=1; j<k; j++){
                if(arr[i+j]>max){
                    max = arr[i+j];
                }
            }
            ans[i] = max;
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {1,-2,3,4,-5,7,6};
        int [] ans = maxInSubArray(arr, 3);
        for(int ele:ans){
            System.out.print(ele+" ");
        }
    }
}
