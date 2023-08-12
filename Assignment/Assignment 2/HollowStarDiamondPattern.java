// **********
// ****  ****
// ***    ***
// **      **
// *        *
// *        *
// **      **
// ***    ***
// ****  ****
// **********

public class HollowStarDiamondPattern {
    public static void main(String[] args) {         
        printLine(5, 5); 
    }
        static void printStar(int star) 
        {         
        if (star == 0) {             
            return; 
        } 
        System.out.print("*");         
        printStar(star - 1); 
    }  

    static void printSpace(int space){         
        if (space == 0){             
            return; 
        } 
        System.out.print(" ");         
        printSpace(space - 1); 
    }  

    static void printLine(int rows, int n){         
        if (rows == 0) {             
            return;         }        
            printStar(rows);         
            printSpace(2 * (n - rows));         
            printStar(rows);         
            System.out.println();         
            printLine(rows - 1, n);         
            printStar(rows);         
            printSpace(2 * (n - rows));         
            printStar(rows);        
            System.out.println(); 
        } 
} 
