public class NumberCharPattern {
    public static void main(String[] args){        
        printLine(4, 1, 1); 
    } 

    static int print(int num, int col) { 
        if (col == 0){             
            return num; 
        } 
        System.out.print(num + "  ");         
        return print(num + 1, col - 1); 
    }  
    static void printLine(int rows, int num, int col) {      
        if (rows == 0){             
            return;         
        } 
        num = print(num, col);         
        System.out.println(); 
        printLine(rows - 1, num, col + 1); 
    }  
}
