package codingbat.string1;

public class NTwice {
    public static void main(String[] args) {
        NTwice obj = new NTwice();
        System.out.println(obj.nTwice("Hello", 2));
    }
    public String nTwice(String str, int n) {
        String word = str.substring(0, n);
        String word2 = str.substring(str.length() - n);
        return word + word2;
    }
}
