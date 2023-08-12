// * * * * * 
// *       * 
// *       * 
// *       * 
// * * * * * 

public class HollowSquare {
    public static void main(String[] args) {
        int len=5;
        int square = len;
        printLine(len,len,square);
    }
    static void printLine(int rows,int col,int square){
        if(rows == 0){
            return;
        }
        printStar(rows,col,square);
        System.out.println();
        printLine(rows-1,col,square);
    }

    static void printStar(int row, int col,int square){
        if(col == 0){
            return;
        }
        if(row == 1 || row == square || col == 1 || col == square){
            System.out.print("* ");
        }
        else{
            System.out.print("  ");
        }
        printStar(row,col-1,square);
    }
}
