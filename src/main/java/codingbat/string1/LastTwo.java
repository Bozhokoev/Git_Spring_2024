package codingbat.string1;

public class LastTwo {
    public static void main(String[] args) {
        LastTwo obj = new LastTwo();
        System.out.println(obj.lastTwo("coding"));
    }
    public String lastTwo(String str) {
        if (str.length() == 2) {
            return str.substring(1) + str.substring(0,1);
        } else if (str.length() > 2) {
            return str.substring(0, str.length() -2) + str.substring(str.length() - 1) + str.substring(str.length ()-2, str.length() -1);
        }
        return str;
    }
}
