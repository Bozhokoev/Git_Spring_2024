package codingbat.string1;

public class StartWord {
    public static void main(String[] args) {
        StartWord obj = new StartWord();
        System.out.println(obj.startWord("hippo", "hi"));
    }
    public String startWord(String str, String word) {
        if(str.length() > 0 && str.substring(1).startsWith(word.substring(1))){
            return str.substring(0, word.length());
        } else{
            return "";
        }
    }
}
