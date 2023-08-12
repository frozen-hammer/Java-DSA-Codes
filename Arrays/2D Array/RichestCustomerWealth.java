public class RichestCustomerWealth {
    static void maxWealth(int [][] cust_acc){
        int max = Integer.MIN_VALUE;
        for(int [] acc : cust_acc){
            int sum = 0;
            for(int amt : acc){
                sum += amt;
            }
            max = Math.max(max,sum);
        }
        System.out.println("Max Customer Wealth: "+ max);
    }

    public static void main(String[] args) {
        int [][] cust_acc = {
            {4,5,6}, // Wealths of customer 1
            {5,8,9}, // Wealths of customer 2
            {2,4,9} // Wealths of customer 3
        };
        maxWealth(cust_acc);
    }
}
