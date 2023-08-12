public class DiceProblemV2 {
    public static void main(String[] args) {
        diceProblem(0,10,"");
    }

    static void diceProblem(int currValue, int endValue,String result){
        //Termination Case with 2 Options
        //1. Positive Case
        if(currValue == endValue){
            System.out.println(result);
            return;
        }

        //2. Negative Case
        if(currValue > endValue){
            return;
        }

        //Roll the dice
        for(int dice=1; dice<=6; dice++){
            int newValue = currValue + dice;
            diceProblem(newValue,endValue,result+dice);
        }
    }
}
