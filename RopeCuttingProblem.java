public class RopeCuttingProblem{
    public static void main(String[] args) {
        System.out.println("Max Pieces: "+ropeCut(9, 4,5,3));
    }
    static int ropeCut(int n , int a,int b, int c){
        if(n==0){
            return 0;
        }
        if(n<0){
            return -1;
        }
int cutFromA = ropeCut(n-a,a,b,c);
int cutFromB = ropeCut(n-b,a,b,c);
int cutFromC = ropeCut(n-c,a,b,c);

int pieces = Math.max(Math.max(cutFromA,cutFromB),cutFromC);

if(pieces == -1){
    return -1;
}
return pieces + 1;
    }
}