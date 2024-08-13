package codingbat.string1;

public class HasBad {
    public static void main(String[] args) {
        HasBad obj = new HasBad();
        System.out.println(obj.middleThree("Hello"));
    }
    public String middleThree(String str) {
        int middle = str.length() / 2 - 1;
        return str.substring(middle, middle+3);
    }
}
