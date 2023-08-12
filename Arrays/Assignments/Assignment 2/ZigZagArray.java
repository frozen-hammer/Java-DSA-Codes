// Convert Array into Zig Zag Array
// arr[] = {4,3,7,8,6,2,1}
// output: {3,7,4,8,2,6,1}
// first < second > third and so on

class ZigZagArray{
    public static void main(String[] args) {
        int[] arr = {4,3,7,8,6,2,1};
        int first = 0;
        int sec = 1;
        int third = 2;
        int temp=0;
        for(int i=1;third<=arr.length;i+=2){
            if(arr[i]<arr[first]){
                temp = arr[first];
                arr[first] = arr[i];
                arr[sec] = temp;
            }
            if(arr[third]>arr[i]){
                temp = arr[third];
                arr[third] = arr[i];
                arr[sec] = temp;
            }
            first+=2;
            sec+=2;
            third+=2;
        }
        for(int e: arr){
            System.out.print(e+" ");
        }
    }
}