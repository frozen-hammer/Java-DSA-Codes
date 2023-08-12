class NaiveApproachPatternMatching{

    static int naiveApproach(String text , String pattern){
        int n = text.length();
        int m = pattern.length();

        for(int i=0; i<=n-m; i++){
            int j = 0;
            while(j< m && text.charAt(i+j) == pattern.charAt(j)){
                j++;
            }

            if(j == m){
               return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String text = "abccbac";
        String pattern = "ccba";
        int res = naiveApproach(text, pattern);
        if(res == -1){
            System.out.println("NOT FOUND");
        }else{
            System.out.println("FOUND AT INDEX: "+res);
        }
    }
}