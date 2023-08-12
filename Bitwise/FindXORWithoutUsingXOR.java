public class FindXORWithoutUsingXOR {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int res = ((a & ~b) + (b & ~a));
        System.out.println(res);
    }
}
