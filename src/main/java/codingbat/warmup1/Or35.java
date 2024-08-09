package codingbat.warmup1;

public class Or35 {
    public static void main(String[] args) {
        Or35 obj = new Or35();
        System.out.println(obj.or35(3));
    }
    public boolean or35(int n) {
        if (n % 3 == 0 || n % 5 == 0) {
            return true;
        }
        return false;
    }
}
