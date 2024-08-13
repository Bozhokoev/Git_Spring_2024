package codingbat.string1;

public class FirstHalf {
    public static void main(String[] args) {
        FirstHalf obj = new FirstHalf();
        System.out.println(obj.firstHalf("Hello"));
    }
    public String firstHalf(String str) {
        if(str.length() % 2 == 0) {
            return str.substring(0, str.length()/2);
        }
        return str;
    }
}
