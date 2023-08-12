import java.util.Arrays;

public class Anagram {

    static boolean checkAnagram1(String str1,String str2){
        if(str1.length() != str2.length()){
            return false;
        }

        char [] charArr1 = str1.toCharArray();
        Arrays.sort(charArr1);
        str1 = new String(charArr1);

        
        char [] charArr2 = str2.toCharArray();
        Arrays.sort(charArr2);
        str2 = new String(charArr2);

        return str1.equals(str2);
    }

    // Hash Approach
    // static boolean checkAnagram2(String str1 , String str2){

    // }
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        System.out.println(checkAnagram1(str1,str2));

        // System.out.println(checkAnagram2(str1,str2));
    }
}
