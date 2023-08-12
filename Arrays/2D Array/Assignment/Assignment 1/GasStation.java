public class GasStation {

    public static void canCompleteCircuit(int[] gas, int[] cost) {
        int startingPoint = 0;
        int surplus = 0;
        int deficit = 0;
        for(int i = 0; i<gas.length; i++){
            surplus += gas[i] - cost[i];
            if(surplus<0){
                deficit+=surplus;
                surplus =0; // Surplus set to 0
                startingPoint = i+1; // Move to the Next Station
            }
        }
        // Check is it Complete the Circuit
        if((deficit+surplus)>=0){
            System.out.println(startingPoint);
        }
    }

    public static void main(String[] args) {
        int[] gas={1,2,3,4,5};
        int[] cost= {3,4,5,1,2};
        canCompleteCircuit(gas, cost);
    }


}
