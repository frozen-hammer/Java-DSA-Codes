import java.io.*;

class Solution {
   
    public String convert(int n) {
        int decimal = O2D(n);  //O2D: Octal to Decimal
        return D2H(decimal); //D2H: Decimal to Hexadecimal
    }

    static int O2D(int octal) {
        if (octal == 0) return 0;
        int digit = octal % 10; 
        return digit + 8 * O2D(octal / 10);
    }

    static String D2H(int decimal) {
        if (decimal == 0) return "";
        int remainder = decimal % 16;
        char hexDigit = remainder < 10 ? (char) (remainder + '0') : (char) (remainder - 10 + 'A'); //if remainder is ledd than 10 that means we can epresent it beyween 0-9 but 
        // if incae it's gretaer than or equal to 10 then we have to add 'A' and subtract it with 10 to get the accirate value of hexDigit
        return D2H(decimal / 16) + hexDigit;
    }
    
}

public class OctalToHex {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
 
        // Reading N and K
        String str = bufferedReader.readLine().trim();
        int n = Integer.parseInt(str);
        
        Solution solution = new Solution();
        String result = solution.convert(n);
        System.out.println(result);
    }
}