// *   *
//  * * 
//   *  
//  * * 
// *   *

public class CrossDiagonalLinePattern {
    public static void main(String[] args) {
        int len = 5;
        printLine(len,len,len);
    }
    static void printLine(int row,int col,int maxLen){
        if(row == 0){
            return;
        }
        printStar(row,col,maxLen);
        System.out.println();
        printLine(row-1, col, maxLen);
    }
    static void printStar(int row,int col,int maxLen){
        if(col == 0){
            return;
        }
        if(row==col||(row+col) == maxLen +1){
            System.out.print("*");
        }else{
            System.out.print(" ");
        }
        printStar(row,col-1, maxLen);
    }
}
