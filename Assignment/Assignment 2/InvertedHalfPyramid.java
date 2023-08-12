// *****
// ****
// ***
// **
// *

public class InvertedHalfPyramid {
    public static void main(String[] args) {
        int len =5;
        printLine(len);
    }

    static void printLine(int row){
        if(row == 0){
            return;
        }
        printStar(row);
        System.out.println();
        printLine(row-1);
    }

    static void printStar(int star){
        if(star == 0){
            return;
        }
        System.out.print("*");
        printStar(star-1);
    }
}
