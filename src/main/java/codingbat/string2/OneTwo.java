package codingbat.string2;

public class OneTwo {
    public static void main(String[] args) {
        OneTwo obj = new OneTwo();
        System.out.println(obj.oneTwo("abc"));
    }
    public String oneTwo(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i + 2 < str.length(); i += 3) {
            result.append(str.charAt(i + 1));
            result.append(str.charAt(i + 2));
            result.append(str.charAt(i));
        }
        return result.toString();
    }
}
