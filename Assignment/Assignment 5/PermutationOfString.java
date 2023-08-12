// Permutation of a String
// e.g void perm (String str, String result){
// }


class PermutationOfString{
    public static void main(String[] args) {
        printPermutation("abc","");
    }

    static void printPermutation(String str, String result){
        if(str.length() == 0){
            System.out.println(result);
            return;
        }
 
        for(int i=0;i<str.length();i++){
            char curChar = str.charAt(i);
            String newStr = str.substring(0,i) + str.substring(i+1); 
            printPermutation(newStr, result+curChar);
        }
    }
}