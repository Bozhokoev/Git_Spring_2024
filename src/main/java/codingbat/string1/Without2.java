package codingbat.string1;

public class Without2 {
    public static void main(String[] args) {
        Without2 obj = new Without2();
        System.out.println(obj.without2("HelloHe"));
    }
    public String without2(String str) {
        if (str.length() < 2){
            return str;
        } if (str.substring(0,2).equals(str.substring(str.length()-2))){
            return str.substring(2);
        }
        return str;
    }
}
