class MissingNumberInArray {

    static int missingNum(int array[],int n) {
        // Your Code H ere
        int sumOfGiven = 0;
        
        for(int ele: array){
            sumOfGiven += ele;
        }
        
        int sumOfFirstN = (n*(n+1))/2;  // using formula: (n*(n+1))/2;

        int missingNumber = sumOfFirstN - sumOfGiven;
        return missingNumber;
        
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,5};
        int n=5;
        int res = missingNum(arr,n);
        System.out.println(res);
    }
}