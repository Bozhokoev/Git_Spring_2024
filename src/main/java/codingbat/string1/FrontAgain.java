package codingbat.string1;

public class FrontAgain {
    public static void main(String[] args) {
        FrontAgain obj = new FrontAgain();
        System.out.println(obj.frontAgain("edited"));
    }
    public boolean frontAgain(String str) {
        if ((str.length() >=2) && (str.substring (0,2).equals(str.substring(str.length() - 2)))){
            return true;
        }
        return false;
    }
}
