public class ReverseAStatement {

    static String reverse(String str){
        int i = 0;
        int j= str.length()-1;
        char wordArray[] = str.toCharArray();
        char temp = '\0';
        while(i<j){
            temp = wordArray[i];
            wordArray[i] = wordArray[j];
            wordArray[j] = temp;
            i++;
            j--;
        }
        return String.valueOf(wordArray);
    }
    public static void main(String[] args) {
        String str = "The sky is blue";
        String WholeString= reverse(str);  // here we will get ----> "eulb si yks ehT" 
        String words[] = WholeString.split(" ");
        String sentence = "";
        for(String word : words){
            sentence += reverse(word) + " ";
        }
        System.out.println(sentence);
    }
}
