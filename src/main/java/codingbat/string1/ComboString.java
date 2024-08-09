package codingbat.string1;

public class ComboString {
    public static void main(String[] args) {
        ComboString obj = new ComboString();
        System.out.println(obj.comboString("Hello", "World"));
    }
    public String comboString(String a, String b) {
        if(a.length() > b.length()){
            return b+a+b;
        } return a+b+a;
    }
}
// return (a.length() > b.length()) ? b + a + b : a + b + a;
