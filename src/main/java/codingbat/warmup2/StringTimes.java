package codingbat.warmup2;

public class StringTimes {
    public static void main(String[] args) {
        StringTimes obj = new StringTimes();
        System.out.println(obj.stringTimes("Hello", 2));
    }
    public String stringTimes(String str, int n) {
        String str2 = "";
        for (int i = 0; i < n; i++){
            str2 += str;
        } return str2;
    }
}
