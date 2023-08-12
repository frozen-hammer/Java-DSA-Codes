public class DeletionInTries {
    static class Node{
        Node[] children;
        boolean IsTerminal;

        public Node(){
            children = new Node[26];
            for(int i=0; i<26; i++){
                children[i] = null;
            }
            IsTerminal = false;
        }
    }

    static Node root = new Node();

    static void insert(String word){
        Node current = root;
        for(int i=0; i<word.length(); i++){
            int index = word.charAt(i) - 'a';
            if(current.children[index] == null){
                current.children[index] = new Node();
            }

            if(i == word.length()-1){
                current.children[index].IsTerminal = true;
                System.out.println("WORD INSERTED "+word);
            }
            current = current.children[index];
        }
    }

    static void delete(String word){
        Node current =root;
        for(int i=0; i<word.length(); i++){
            int index = word.charAt(i) - 'a';
        if(current.children[index] == null){
            System.out.println("THE WORD DOESN'T EXIST");
            return;
        }
        
        if(i == word.length()-1){
            if(current.children[index].IsTerminal = true){
                current.children[index].IsTerminal = false;
                System.out.println("WORD DELETED");
            }
        }
        current = current.children[index];
    }
}

    public static void main(String[] args) {
        insert("apple");
        delete("apple");
    }
}
