package codingbat.warmup1;

public class Makes10 {
    public static void main(String[] args) {
        Makes10 obj = new Makes10();
        System.out.println(obj.makes10(8, 2));
    }
    public boolean makes10(int a, int b) {
        if ((a == 10 || b == 10) || (a+b) == 10) {
            return true;
        }
        return false;
    }
}
