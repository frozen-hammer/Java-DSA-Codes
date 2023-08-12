// Find Third Largest Element in an Array

class ThirdLargestElement{
    public static void main(String[] args) {
        int arr[] = {1000,2000,90,100,1,444};
        int firstLargest = Integer.MIN_VALUE; 
        int secondLargest = Integer.MIN_VALUE;
        int thirdLargest = Integer.MIN_VALUE;

        if(arr.length<3){
            System.out.println("Small Array...");
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i]>firstLargest){
                thirdLargest = secondLargest;
                secondLargest = firstLargest;
                firstLargest = arr[i];
            }
            else if(arr[i]>secondLargest && arr[i]!=firstLargest){
                thirdLargest = secondLargest;
                secondLargest = arr[i];
            }
            else if(arr[i]>thirdLargest && arr[i]!=secondLargest && arr[i]!=firstLargest){
                thirdLargest = arr[i];
            }
        }
        System.out.println("Third Largest Element is: "+thirdLargest);

    }
}