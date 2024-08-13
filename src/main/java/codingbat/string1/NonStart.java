package codingbat.string1;

public class NonStart {
    public static void main(String[] args) {
        NonStart obj = new NonStart();
        System.out.println(obj.nonStart("Return", "World"));
    }
    public String nonStart(String a, String b) {
        return a.substring(1).concat(b.substring(1));
    }
// String num1 = a.substring(1);
// String num2 = b.substring(1);
//  return num1.concat(num2);
}
