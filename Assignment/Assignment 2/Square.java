// * * * * * 
// * * * * * 
// * * * * * 
// * * * * * 
// * * * * * 

class Square{
    public static void main(String[] args) {
        int len =5;
        printLine(5,len);
    }

    static void printLine(int row,int square){
        if(row == 0){
            return;
        }
        printStar(square);
        System.out.println();
        printLine(row-1,square);
    }

    static void printStar(int star){
        if(star == 0){
            return;
        }
        System.out.print("* ");
        printStar(star-1);
    }
}