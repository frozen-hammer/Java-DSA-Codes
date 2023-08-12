public class KMPAlgo {
     static int[] computeWeight(String pattern){
        int [] weigthArray = new int[pattern.length()];
        int length = 0;
        int j = 1;

        weigthArray[0] = 0;
        while(j<pattern.length()){
            if(pattern.charAt(j) == pattern.charAt(length)){
                length++;
                weigthArray[j] = length;
                j++;
            }
            else{
                if(length != 0){
                    length = weigthArray[length - 1];
                }
                else{
                    weigthArray[j] = 0;
                    j++;
                }
            }
        }
        return weigthArray;
    }

    static int searchPattern(String text, String pattern, int []weightArray){
        int i=0;
        int j=0;
        while(i<text.length()){
            if(text.charAt(i) == pattern.charAt(j)){
                i++;
                j++;
                if(j==pattern.length()){
                    return i-j;
                }
            }
            else{
                if(j!=0){
                    j = weightArray[j-1];
                }
                else{
                    i++;
                }
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        String text = "ABABDABACDABAB";
        String pattern ="ABACD";
        int []wArray = computeWeight(pattern);
        int findIndex = searchPattern(text, pattern, wArray);
        System.out.println(findIndex);
    }
}
