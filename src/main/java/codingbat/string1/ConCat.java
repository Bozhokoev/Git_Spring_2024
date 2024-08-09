package codingbat.string1;

public class ConCat {
    public static void main(String[] args) {
        ConCat obj = new ConCat();
        System.out.println(obj.conCat("Hello", "Cat"));
    }
    public String conCat(String a, String b) {
        int l1 = a.length ();
        int l2 = b.length ();
        if (l1 >=1  && l2 >=1) {
            if (a.charAt (l1 - 1) == b.charAt(0)){
                return a + b.substring(1);
            }

        }
        return a + b;
    }
}
