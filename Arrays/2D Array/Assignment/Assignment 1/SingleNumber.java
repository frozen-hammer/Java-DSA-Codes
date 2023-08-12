public class SingleNumber {
    public static int singleNumber(int[] nums) {
        int xor = 0;
        for (int i = 0; i < nums.length; i++) {
            xor = xor ^ nums[i];
        }
        return xor;
    }

    public static void main(String args[]) {
        int nums[] = { 7, 2, 2, 4, 4 };
        System.out.println(singleNumber(nums));
    }
}

