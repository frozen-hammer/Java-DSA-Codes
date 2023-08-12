//Convert String to Integer

public class ConvertAToI {
    static int Convert(String s){
        int n = s.length();
        int sign = 1;
        int index = 0;
        int r = 0;

        //remove spaces
        while(index<n && s.charAt(index) == ' '){
            index++;
        }

        //Sign
        if(index<n && s.charAt(index) == '+'){
            sign  =1;
            index++;
        }
        else{
            if(index<n && s.charAt(index) == '-'){
                sign = -1;
                index++;
            }
        }

        while(index<n && Character.isDigit(s.charAt(index))){
            int digit = s.charAt(index) - '0'; //This will convert the character at that index to integer 
            if(sign == 1 && r>=Integer.MAX_VALUE/10){
                return Integer.MAX_VALUE;
            }
            else if(sign == -1 && r<=Integer.MIN_VALUE/10){
                return Integer.MIN_VALUE;
            }
            r = 10 * r + digit;
            index++;
        }
        return r*sign;
    }
    public static void main(String[] args) {
        String s = "     -49";
        System.out.println(Convert(s));
    }
}
