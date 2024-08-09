package codingbat.warmup1;

public class LastDigit {
    public static void main(String[] args) {
        LastDigit obj = new LastDigit();
        System.out.println(obj.lastDigit(7, 17));
    }
    public boolean lastDigit(int a, int b) {
        return a%10==b%10;
    }
}
