package codingbat.warmup1;

public class NearHundred {
    public static void main(String[] args) {
        NearHundred obj = new NearHundred();
        System.out.println(obj.nearHundred(99));
    }
    public boolean nearHundred(int n) {
        if (Math.abs(200 - n) <= 10 || Math.abs(100 - n) <= 10) {
            return true;
        }
        else {
            return false;
        }
    }
}
