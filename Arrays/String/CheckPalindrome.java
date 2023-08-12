class CheckPalindrome{

    //Reverse and check approach
    static boolean approach1(String str){
        StringBuilder rev = new StringBuilder(str);
        rev.reverse();

        return str.equals(rev.toString());
    }

    //Two Pointer Approach
    static boolean approach2(String str,int startPointer,int endPointer){
        while(startPointer < endPointer){
            if(str.charAt(startPointer) != str.charAt(endPointer)){
                return false; 
            }
            startPointer++;
            endPointer--;    
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "abbcbba";
        System.out.println(approach1(str));
        System.out.println(approach2(str,0,str.length()-1));
    }
}