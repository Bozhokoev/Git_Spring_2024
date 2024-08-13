package codingbat.string2;

public class RepeatEnd {
    public static void main(String[] args) {
        RepeatEnd obj = new RepeatEnd();
        System.out.println(obj.repeatEnd("Hello", 3));
    }
    public String repeatEnd(String str, int n) {
        int len = str.length();
        String word = str.substring(len - n);
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++){
            result.append(word);
        }
        return result.toString();
    }
}
