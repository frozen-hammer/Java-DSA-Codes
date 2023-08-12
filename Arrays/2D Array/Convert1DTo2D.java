class Convert1DTo2D{
    static int[][] convert2D(int [] ar,int n,int m){
        int [][] res = new int[n][m];
        if(m*n != ar.length){
            return new int[0][0];
        }
        int row=0;
        int col=0;
        for(int i=0;i<ar.length;i++){
            res[row][col] = ar[i];
            col++;
            if(col == m){
                row++;
                col=0;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int [] ar = {2,3,4,5,6,7};
        int n = 2;
        int m = 3;
        int ans[][] = convert2D(ar, n, m);
        for(int a[]: ans){
            for(int ele:a){
                System.out.print(ele+" ");
            }
            System.out.println();
        }
    }
}