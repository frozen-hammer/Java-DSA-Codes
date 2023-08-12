// 1        1
// 12      21
// 123    321
// 1234  4321
// 1234554321

public class NumberRightAndLeftStarPattern {
    public static void main(String[] args) {         
        printLine(1, 5); 
    } 
         static int printSpaces(int space) {         
            if (space == 0) {             
            return -1; 
        } 
        System.out.print(" ");         
        return printSpaces(space - 1); 
    }  
    static int printNumbers(int col, int rows) {         
        if (col == rows+1) {             
        return -1; 
        } 
        System.out.print(col); 
        return printNumbers(col + 1, rows); 
    } 
    static int printNumbersRight(int col) {         
        if (col == 0) {             
        return -1; 
        } 
        System.out.print(col);         
        return printNumbersRight(col - 1); 
    }  
    static void printLine(int rows, int n) {         
        if (rows > n) {             
        return;         } 
        printNumbers(1, rows);         
        printSpaces(2 * (n - rows));         
        printNumbersRight(rows-1+1);         
        System.out.println();         
        printLine(rows + 1, n); 
    } 
    
} 
