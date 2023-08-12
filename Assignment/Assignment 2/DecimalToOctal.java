public class DecimalToOctal {
    public static void main(String[] args) { 
        System.out.println(decimalToOctal(123)); 
    } 

    static int decimalToOctal(int num){         
        if(num == 0){ 
            return 0; 
        } 
      
        int remainder = num % 8;         
        int result = 10*decimalToOctal(num / 8) + remainder; 
        return result; 
         
    } 

}
