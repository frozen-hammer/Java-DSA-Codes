// *
// **
// ***
// ****
// *****
// ****
// ***
// **
// *

public class RightPascalPattern {
    public static void main(String[] args) {
        int len = 9;
        int star = 1;
        printLine(len,star,len/2);
    }

    static void printLine(int row,int star,int mid){
        if(row == 0){
            return;
        }
        printStar(row,star);
        row = row-1;
        if(row > mid){
            star = star+1;
        }else{
            star = star-1;
        }
        System.out.println();
        printLine(row,star,mid);
    }
    static void printStar(int row, int star){
        if(star ==0){
            return;
        }
        System.out.print("*");
        printStar(row, star-1);
    }
}
