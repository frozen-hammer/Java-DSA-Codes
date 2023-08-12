public class ComputeWeightArray {
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

    public static void main(String[] args) {
        String str = "abcabecabd";
        int [] res = computeWeight(str);
        for(int ele : res){
            System.out.print(ele+" ");
        }
    }
}
