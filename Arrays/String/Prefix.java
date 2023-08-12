//Not Correct 
...
public class Prefix {
    static void findPrefix(String str){
        int n = str.length();
        String [] arr = new String[n];
        for(int i=0;i<n;i++){
            arr[i]=str.substring(0,i);
        }
        for(String ele: arr){
            System.out.println(ele);
        }
    }
    public static void main(String[] args) {
        String str = "apple";
        findPrefix(str);
    }
}
