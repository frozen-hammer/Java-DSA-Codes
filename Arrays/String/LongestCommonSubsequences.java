import java.util.*;

public class LongestCommonSubsequences {

    static List<String> generateSubsequences(String str) {
        ArrayList <String> subSeqList = new ArrayList<>();

        int n = str.length();
        for(int i = 0; i<n;i++){
            char firstChar = str.charAt(i);
            if(subSeqList.size() == 0){
                subSeqList.add("");
                subSeqList.add(""+firstChar);
                continue;
            }
            int subLen = subSeqList.size();
            for(int j = 0; j < subLen; j++){
                String temp = subSeqList.get(j) + firstChar;
                subSeqList.add(temp);
            }
        }
        return subSeqList;
    }

    static String lcs(String str1, String str2){
        List<String> subsequences1 = generateSubsequences(str1);
        List<String> subsequences2 = generateSubsequences(str2);

        String ans = "";
        for(String word1 : subsequences1){
            for(String word2 : subsequences2){
                if(word1.equals(word2) && word1.length()>ans.length()){
                    ans = word1;
                }
            }
        }
        return ans;

        }

        public static void main(String[] args) {
            String str1 = "abcd";
            String str2 = "aebyc";

            String ans = lcs(str1,str2);
            System.out.println("LCS: "+ ans);
        }
}
