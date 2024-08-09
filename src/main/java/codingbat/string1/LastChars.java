package codingbat.string1;

public class LastChars {
    public static void main(String[] args) {
        LastChars obj = new LastChars();
        System.out.println(obj.lastChars("Hello", "World"));
    }
    public String lastChars(String a, String b) {
        if (a.length() == 0) {
            a = "@";

        } if (b.length()==0) {
            b = "@";
        }
        return a.substring (0,1) + b.substring (b.length() - 1);
    }
}
