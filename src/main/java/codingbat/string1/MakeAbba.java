package codingbat.string1;

public class MakeAbba {
    public static void main(String[] args) {
        MakeAbba obj = new MakeAbba();
        System.out.println(obj.makeAbba("Hello", "world!"));
    }
    public String makeAbba(String a, String b) {
        return a + b + b + a;
    }
}
