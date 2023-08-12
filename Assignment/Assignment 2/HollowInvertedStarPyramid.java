// *********
//  *     *
//   *   *
//    * *
//     *

public class HollowInvertedStarPyramid {
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
        printStar(row,(maxLen*2)-(2*star-1),maxLen,star);
        System.out.println();
        printLine(row-1,maxLen,spaces+1,star+1);
    }
    static void printSpaces(int spaces){
        if(spaces == 0) return;

        System.out.print(" ");
        printSpaces(spaces-1);
    }

    static void printStar(int row,int star,int maxLen,int col){
        if(star == 0) return;
        
        if(row == maxLen || row == 1 || star == 1|| star == (maxLen*2)-(2*col-1)){
            System.out.print("*");
        }else{
            System.out.print(" ");
        }
        printStar(row,star-1,maxLen,col-1);
    }
}
