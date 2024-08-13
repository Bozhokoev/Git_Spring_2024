package codingbat.warmup1;

public class SumDouble {
    public static void main(String[] args) {
        SumDouble obj = new SumDouble();
        System.out.println(obj.sumDouble(3 , 6));
    }
    public int sumDouble(int a, int b) {
        return (a == b) ? (a + b) *2 : (a + b);
    }
}
