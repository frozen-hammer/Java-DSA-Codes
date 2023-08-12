public class LongestCommonPrefix {
    static String commonPrefix(String[] arr, int n){
        int minLen = minLength(arr,n);
        
        String ans = "";
        for(int i = 0; i < minLen; i++){
            char currChar = arr[0].charAt(i);
            for(int j=1; j<n; j++){
                if(arr[j].charAt(i) != currChar){
                    return ans;
                }
            }
            ans += currChar;
        }
        if(ans.isEmpty()){
            System.out.println("NO LONGEST COMMON PREFIX FOUND");
        }
        return ans;
    }
    
    static int minLength(String [] arr , int n){
        int min = arr[0].length();
        for(int i=0; i<n; i++){
            if(arr[i].length() < min){
                min = arr[i].length();
            }
        }
        return min;
    }

    public static void main(String[] args) {
        String[] arr = {"lists","listens","like","lies"};
        int n = arr.length;
        System.out.println("The Longest Common Prefix: "+commonPrefix(arr, n));
    }

}
