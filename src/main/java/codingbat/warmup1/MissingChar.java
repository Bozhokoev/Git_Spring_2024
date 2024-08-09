package codingbat.warmup1;

public class MissingChar {
    public static void main(String[] args) {
        MissingChar obj = new MissingChar();
        System.out.println(obj.missingChar("kitten", 1));
    }
    public String missingChar(String str, int n) {
        StringBuilder sb = new StringBuilder (str);
        return sb.deleteCharAt(n).toString();
    }
}
