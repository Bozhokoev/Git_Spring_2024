package codingbat.warmup1;

public class MixStart {
    public static void main(String[] args) {
        MixStart obj = new MixStart();
        System.out.println(obj.mixStart("mix snacks"));
    }
    public boolean mixStart(String str) {
        return str.length() >= 3 && str.substring(1, 3).equals("ix");
    }
}
