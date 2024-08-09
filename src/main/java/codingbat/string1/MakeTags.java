package codingbat.string1;

public class MakeTags {
    public static void main(String[] args) {
        MakeTags obj = new MakeTags();
        System.out.println(obj.makeTags("Hello", "world"));
    }
    public String makeTags(String tag, String word) {
        return "<"+ tag + ">" + word + '<' + '/' + tag + '>';
    }
}
