class Node{
    Node childrens [] = new Node[26];
    boolean EOW = false;

    public Node(){

    }

    boolean containsKey(char ch){
        return (childrens[ch-'a']!=null);
    }
    Node get(char ch){
        return childrens[ch-'a'];
    }

    void put(char ch, Node node){
        childrens[ch-'a'] = node;
    }

    void setEnd(){
        EOW = true;
    }

    boolean isEnd(){
        return EOW;
    }
};

public class Trie{
    private static Node root;

    Trie(){
        root = new Node();
    }

    public static void insert(String word){
        Node curr = root;
        for(int i = 0; i < word.length(); i++){
            char ch = word.charAt(i);
            if(!curr.containsKey(ch)){
                curr.put(ch, new Node());
            }
            curr = curr.get(word.charAt(i));

        }
        curr.setEnd();
    }

    public static boolean search(String word){
        Node curr = root;
        for(int i =0; i < word.length(); i++){
            char ch = word.charAt(i);
            if(!curr.containsKey(ch)){
                return false;
            }
            curr = curr.get(word.charAt(i));
        }
        if(curr.isEnd()){
            return true;
        }
    return false;
    }

    public static boolean startswith(String prefix){
        Node curr = root;
        for(int i = 0; i < prefix.length(); i++){
            char ch = prefix.charAt(i);
            if(!curr.containsKey(ch)){
                return false;
            }
        curr = curr.get(prefix.charAt(i));
        }
    return true;
    }

    public static void main(String[] args) {
        int n = 5;
        int type[] = {1, 1, 2, 3, 2};
        String value[] = {"hello", "help", "help", "hel", "hel"};
        Trie trie = new Trie();
        for(int i =0 ; i < n; i++){
            if (type[i] == 1) {
                trie.insert(value[i]);
            }
            else if (type[i] == 2) {
                if (trie.search(value[i])) {
                    System.out.println( "true" );
                }
                else {
                    System.out.println("false");
                }
            }
            else {
                if (trie.startswith(value[i])) {
                    System.out.println("true" );
                }
                else {
                    System.out.println("false");
                }
            }

        }
    }
}