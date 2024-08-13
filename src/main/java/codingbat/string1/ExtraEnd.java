package codingbat.string1;

public class ExtraEnd {
    public static void main(String[] args) {
        ExtraEnd obj = new ExtraEnd();
        System.out.println(obj.extraEnd("Hello"));
    }
    public String extraEnd(String str) {
        if(str.length() > 2){
            return str.substring(str.length() -2, str.length()) + str.substring(str.length() -2, str.length()) + str.substring(str.length() -2, str.length());
        } else{
            return str+str+str;
        }
    }
}
