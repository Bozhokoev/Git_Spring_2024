package codingbat.string2;

public class EndOther {
    public static void main(String[] args) {
        EndOther obj = new EndOther();
        System.out.println(obj.endOther("Hiabc", "abc"));
    }
    public boolean endOther(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();
        return a.endsWith(b) || b.endsWith(a);
    }
}
