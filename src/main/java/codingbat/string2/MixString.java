package codingbat.string2;

public class MixString {
    public static void main(String[] args) {
        MixString obj = new MixString();
        System.out.println(obj.mixString("abc", "xyz"));
    }
    public String mixString(String a, String b) {
        int min = Math.min(a.length(), b.length());
        int x = 0;
        String total = "";
        while (x < min){
            String wordA = a.substring(x, x+1);
            String wordB = b.substring(x, x+1);
            total = total + wordA + wordB;
            x++;
        }
        return total + a.substring(x) + b.substring(x);
    }
}
