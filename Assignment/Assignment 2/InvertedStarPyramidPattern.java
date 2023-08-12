// *********
//  *******
//   *****
//    ***
//     *

public class InvertedStarPyramidPattern {
    public static void main(String[] args) {
        int len = 5;
        int maxLen = len;
        int spaces = 0;
        int star = 1;
        printLine(len,maxLen,spaces,star);
    }
    static void printLine(int row,int maxLen,int spaces,int star){
        if(row == 0) return;

        printSpaces(spaces);
        printStar((maxLen*2)-(2*star-1));
        System.out.println();
        printLine(row-1,maxLen,spaces+1,star+1);
    }
    static void printSpaces(int spaces){
        if(spaces == 0) return;

        System.out.print(" ");
        printSpaces(spaces-1);
    }

    static void printStar(int star){
        if(star == 0) return;

        System.out.print("*");
        printStar(star-1);
    }
}
