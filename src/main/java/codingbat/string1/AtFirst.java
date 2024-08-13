package codingbat.string1;

public class AtFirst {
    public static void main(String[] args) {
        AtFirst obj = new AtFirst();
        System.out.println(obj.atFirst("Hello"));
    }
    public String atFirst(String str) {
        if (str.length() ==1) {
            return str.substring(0,1) + "@";
        } else if (str.length() >=2) {
            return str.substring(0,2);
        }
        return "@@";
    }
}
