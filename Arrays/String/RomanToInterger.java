import java.util.HashMap;

public class RomanToInterger {
    static int romanToInt(String s){
        HashMap<String, Integer> map = new HashMap<>();
        map.put("I",1);
        map.put("V",5);
        map.put("X",10);
        map.put("L",50);
        map.put("C",100);
        map.put("D",500);
        map.put("M",1000);

        int sum=0;
        int i=0;

        while(i<s.length()){
            char singleChar = s.charAt(i);
            String currentSymbol = String.valueOf(singleChar);
            int currentValue = map.get(currentSymbol);
            int nextValue = 0;
            if(i+1<s.length()){
            char nextChar = s.charAt(i+1);
            String nextSymbol = String.valueOf(nextChar);
            nextValue = map.get(nextSymbol); 
            }

            

            if(currentValue >= nextValue){
                sum += currentValue;
                i+=1;
            }
            else{
                sum += (nextValue - currentValue);
                i+=2; 
            }
        }


        return sum;
    }

    public static void main(String[] args) {
        String s = "LXIII";
        System.out.println(romanToInt(s));
    }
}
