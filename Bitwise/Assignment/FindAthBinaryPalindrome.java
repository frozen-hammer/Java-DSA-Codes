// Given an integer A find the Ath number whose binary representation is a palindrome.

// NOTE:

// Consider the 1st number whose binary representation is palindrome as 1, instead of 0
// Do not consider the leading zeros, while considering the binary representation.

// Input : A = 9
//  Output : 27
// Explanation: 9th Number whose binary representation is palindrome is 27 (11011)

public class FindAthBinaryPalindrome {
    static int solve(int A) {
        int count =1;
        int len = 1;
        while(count < A){
            len++;
            int elementForLen = (1 << (len -1)/2);
            count+= elementForLen;
        }
        count-= (1 <<(len-1)/2) ;
        int offset = A - count -1;

        int ans = (1 << (len-1));
        ans |= (offset << (len/2));

        int valFr = (ans >> (len/2));
        ans |= rev(valFr);

        return ans;
    }

    static int rev(int valFr){
        int rev = 0;

        while(valFr !=0){
            int lb = valFr & 1;
            rev = rev|lb;
            rev = rev<< 1;
        valFr = valFr >> 1;
        }
        rev = rev>>1;
        return rev;
    }
    public static void main(String[] args) {
        System.out.println(solve(9));
    }

}
