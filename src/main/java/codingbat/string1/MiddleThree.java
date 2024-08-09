package codingbat.string1;

public class MiddleThree {
    public static void main(String[] args) {
        MiddleThree obj = new MiddleThree();
        System.out.println(obj.middleThree("Hello"));
    }
    public String middleThree(String str) {
        int middle = str.length() / 2 - 1;
        return str.substring(middle, middle+3);
    }
}
