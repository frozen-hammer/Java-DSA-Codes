// *
// **
// ***
// ****
// *****

public class MirrorLeftPyramid {
    public static void main(String[] args) {
        int len =5;
        int star =1;
        printLine(len, star);
    }

    static void printLine(int row,int star){
        if(row == 0){
            return;
        }
        printSpace(row-1);
        printStar(star);
        System.out.println();
        printLine(row-1,star+1);
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
