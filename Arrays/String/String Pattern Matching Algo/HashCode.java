public class HashCode {
    static long HashValue(String pattern){
        long hashValue = 0;
        for(int i=0; i<pattern.length(); i++){
            hashValue += pattern.charAt(i) * Math.pow(10,i);
        }
        return hashValue;
    }
    public static void main(String[] args) {
        String pattern = "ab";
        System.out.println(HashValue(pattern));
    }
}
