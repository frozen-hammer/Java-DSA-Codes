// leftshift 1 to i+1 places then take negation of it and the & it w

public class ClearNBitsFromLast {
    public static void main(String[] args) {
        int n = 12;
        int k = 3;
        int mask = (~0 << k);
        n = (n & mask);
        System.out.println(n);
    }
}
