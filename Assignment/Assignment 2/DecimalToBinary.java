public class DecimalToBinary {
    public static void main(String[] args) { 
        System.out.println(decimalToBinary(7)); 
    } 
    static int decimalToBinary(int num){ 
        if(num == 0){ 
            return 0; 
        }       
        int remainder = num % 2;         
        int result = 10*decimalToBinary(num / 2) + remainder;         
        return result; 
         
    } 
}
