package codingbat.warmup1;

public class In3050 {
    public static void main(String[] args) {
        In3050 obj = new In3050();
        System.out.println(obj.in3050(30, 31));
    }
    public boolean in3050(int a, int b) {
        return a >= 30 && a<=40 && b >= 30 && b<=40 || a >= 40 && a<=50 && b >= 40 && b<=50? true : false;

    }
}
