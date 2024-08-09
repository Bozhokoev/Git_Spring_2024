package codingbat.warmup1;

public class LoneTeen {
    public static void main(String[] args) {
        LoneTeen obj = new LoneTeen();
        System.out.println(obj.loneTeen(13, 99));
    }
    public boolean loneTeen(int a, int b) {
        if ((a >=13 && a <=19) && (b >=13 && b <=19)) {
            return false;
        } else if (a == b) {
            return false;
        }
        return true;
    }
}
