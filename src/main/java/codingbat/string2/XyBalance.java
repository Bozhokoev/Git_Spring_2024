package codingbat.string2;

public class XyBalance {
    public static void main(String[] args) {
        XyBalance obj = new XyBalance();
        System.out.println(obj.xyBalance("aaxbby"));
    }
    public boolean xyBalance(String str) {
        boolean foundX = false;
        for(int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'x') {
                foundX = true;
            } else if (str.charAt(i) == 'y' && foundX) {
                foundX = false;
            }
        }
        return !foundX;
    }
}
