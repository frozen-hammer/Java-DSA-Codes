//     * 
//    * * 
//   * * * 
//  * * * * 
// * * * * * 

public class PatternPyramid {
    public static void main(String[] args) {
        int len = 5;
        int star = 1;
        int spaces = len-1;
        printLine(len,spaces,star);
    }
    static void printLine(int row,int spaces,int star){
        if(row == 0){
            return;
        }
        printSpaces(spaces);
        printStar(star);
        System.out.println();
        printLine(row-1, spaces-1,star+1);
    }
    static void printSpaces(int spaces){
        if(spaces == 0){
            return;
        }
        System.out.print(" ");
        printSpaces(spaces-1);
    }
    static void printStar(int star){
        if(star == 0){
            return;
        }
        System.out.print("* ");
        printStar(star-1);
    }
}
