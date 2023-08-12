
// Given an integer array coins[ ] of size N representing different denominations of currency and an integer sum, find the number of ways you can make sum by using different combinations from coins[ ].  
// Note: Assume that you have an infinite supply of each type of coin. 
class CoinChangeProblem {
    public static void main(String[] args) {
        int[] count = { 1, 2 };
        int sum = 3;
        System.out.print(ways(count, sum,0));

    }

    static int ways(int coins[],int sum,int index){
        if(sum == 0){
            return 1;
        }
        if(sum<0){
            return 0;
        }
        if(sum > 0 && index == coins.length){
            return 0;
        }

        return ways(coins, sum-coins[index],index) + ways(coins,sum,index+1);
    }
}