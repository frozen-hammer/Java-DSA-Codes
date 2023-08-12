//     *
//    *
//   *
//  *
// *

public class DiagonalLinePattern {
    public static void main(String[] args) {
        int len = 5;
        int spaces =len-1;
        printLine(len , spaces);
    }

    static void printLine(int row,int spaces){
        if(row == 0){
            return;
        }
        printSpaces(spaces);
        System.out.print("*");
        System.out.println();
        printLine(row-1, spaces-1);
    }
    static void printSpaces(int spaces){
        if(spaces == 0){
            return;
        }
        System.out.print(" ");
        printSpaces(spaces-1);
    }

}
