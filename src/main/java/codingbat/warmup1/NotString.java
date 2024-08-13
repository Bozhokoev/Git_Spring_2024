package codingbat.warmup1;

public class NotString {
    public static void main(String[] args) {
        NotString obj = new NotString();
        System.out.println(obj.notString("candy"));
    }
    public String notString(String str) {
        if (str.startsWith("not")) {
            return str;
        }
        else {
            return "not " + str;
        }
    }
}
