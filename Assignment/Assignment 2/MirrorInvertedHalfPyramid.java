// *****
//  ****
//   ***
//    **
//     *

public class MirrorInvertedHalfPyramid {
    public static void main(String[] args) {
        int len =5;
        printLine(len,1);
    }

    static void printLine(int row,int spaces){
        if(row == 0){
            return;
        }
        printSpace(spaces-1);
        printStar(row);
        System.out.println();
        printLine(row-1,spaces+1);
    }

    static void printSpace(int spaces){
        if(spaces == 0){
            return;
        }
        System.out.print(" ");
        printSpace(spaces-1);
    }

    static void printStar(int star){
        if(star == 0){
            return;
        }
        System.out.print("*");
        printStar(star-1);
    }
}
