package codingbat.string1;

public class TwoChar {
    public static void main(String[] args) {
        TwoChar obj = new TwoChar();
        System.out.println(obj.twoChar("Hello", 3));
    }
    public String twoChar(String str, int index) {
        if(index <=0 || index >= str.length() - 1){
            return str.substring(0, 2);
        } return str.substring(index, index + 2);
    }
}
