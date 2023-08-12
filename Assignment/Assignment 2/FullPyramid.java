//    *
//   ***
//  *****
// *******
//  *****
//   ***
//    *
public class FullPyramid {
    public static void main(String[] args) {         
        int rows = 4;        
        int col = 0;         
        int n = rows;         
        printLine(rows, col, n); 
    } 
    static void space(int s) {       
        if (s == 0){             
            return; 
        } 
        System.out.print(" ");         
        space(s - 1); 
    } 
    static void print(int star) { 
        // base case         
        if (star == 0){             
            return; 
        } 
        System.out.print("*");         
        print(star - 1); 
    }  
    static void printLine(int rows, int col, int n) { 
        // base case         
        if(rows == 0){             
            return;         
        }         
        space(rows - 1);         
        print(2 * col + 1);        
        System.out.println();         
        printLine(rows - 1, col + 1, n);         
        if(rows == n){             
            return;         
        }         
        space(rows);         
        print(2*col-1); 
        System.out.println(); 
    }
}
