public class PowerOfFour {
    public static void main(String[] args) {
        int num = 64;
        System.out.println(isPowerOfFour(num));
    }

    static boolean isPowerOfFour(int n){
        if(n<1){
            return false;
        }
        if(n == 1){
            return true;
        }
        if(n%4 == 0){
            return isPowerOfFour(n/4);
        }
        return false;
    }
}
