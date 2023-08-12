class SubSequenceWithoutUsingArrayList{
    public static void main(String[] args) {
        printSubSequence("abc","");
    }

    static void printSubSequence(String str,String result){
        if(str.length()==0){
            System.out.println(result);
            return;
        }

            char firstChar = str.charAt(0);
            printSubSequence(str.substring(1), result); //Not include in Result
            printSubSequence(str.substring(1), result+firstChar); // Include in Result
    }
}