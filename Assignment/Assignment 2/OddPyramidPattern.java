//     *
//    ***
//   *****
//  *******
// *********

public class OddPyramidPattern {
    public static void main(String[] args) {
        int len = 5;
        int star = 1;
        int spaces = len-1;
        printLine(len,star,spaces);
    }

    static void printLine(int row,int star,int spaces){
        if(row == 0){
            return;
        }
        printSpaces(spaces);
        printRightStar(row,star);
        printLeftStar(row,star-1);
        System.out.println();
        printLine(row-1,star+1,spaces-1);
    }

    static void printRightStar(int spaces,int star){
        if(star == 0){
            return;
        }
        System.out.print("*");
        printRightStar(spaces, star-1);
    }

    static void printSpaces(int spaces){
        if(spaces == 0){
            return;
        }
        System.out.print(" ");
        printSpaces(spaces-1);
    }

    static void printLeftStar(int row, int star){
        if(star == 0){
            return;
        }
        System.out.print("*");
        printLeftStar(row, star-1);
    }
}
