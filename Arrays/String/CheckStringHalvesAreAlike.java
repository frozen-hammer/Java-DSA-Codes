public class CheckStringHalvesAreAlike {
    static boolean halvesAreAlike(String s) {
        int half = s.length()/2;
        String first = s.substring(0,half);
        String second = s.substring(half);
        int c1=0;
        int c2=0;
        if(s.length()%2 != 0){
            return false;
        }
        
        for(int i=0; i<half; i++){
            switch(first.charAt(i)){
            case 'a': c1+=1;break;
            case 'e': c1+=1;break;
            case 'i': c1+=1;break;
            case 'o': c1+=1;break;
            case 'u': c1+=1;break;
            case 'A': c1+=1;break;
            case 'E': c1+=1;break;
            case 'I': c1+=1;break;
            case 'O': c1+=1;break;
            case 'U': c1+=1;break;
            }
            
            switch(second.charAt(i)){
            case 'a': c2+=1;break;
            case 'e': c2+=1;break;
            case 'i': c2+=1;break;
            case 'o': c2+=1;break;
            case 'u': c2+=1;break;
            case 'A': c2+=1;break;
            case 'E': c2+=1;break;
            case 'I': c2+=1;break;
            case 'O': c2+=1;break;
            case 'U': c2+=1;break;
            }

        }
        if(c1==c2){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String s = "book";
        System.out.println(halvesAreAlike(s));
    }
}

