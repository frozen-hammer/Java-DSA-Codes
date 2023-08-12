public class RunningLengthEncoding {

    static String calculateRLE(String str){
        StringBuilder sb = new StringBuilder("");
        for(int i=0; i<str.length()-1;i++){
            int count = 1;
            while((i<str.length()-1) && str.charAt(i) == str.charAt(i+1)){
                i++;
                count++;
            }
            sb.append(str.charAt(i)+""+count+" ");
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str = "aaaabbbcccddddd";
        System.out.println(calculateRLE(str));
    }
}
