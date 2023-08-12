//     *
//    **
//   ***
//  ****
// *****
//  ****
//   ***
//    **
//     *

public class LeftPascalPatter {
    public static void main(String[] args) {
        int len = 9;
        int spaces = len-1;
        int star = 1;
        printLine(len,spaces/2,star,len/2);
    }

    static void printLine(int row, int spaces, int star,int mid){
        if(row == 0){
            return;
        }
        row = row-1;
        printSpaces(spaces);
        printStar(star);
        if(row>mid){
            star = star + 1;
            spaces = spaces - 1;
        }else{
            star = star - 1;
            spaces = spaces + 1;
        }

        System.out.println();
        printLine(row,spaces,star,mid);
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
        System.out.print("*");
        printStar(star-1);
    }
}
