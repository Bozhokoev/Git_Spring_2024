package codingbat.string2;

public class SameStarChar {
    public static void main(String[] args) {
        SameStarChar obj = new SameStarChar();
        System.out.println(obj.sameStarChar("xy*yzz"));
    }
    public boolean sameStarChar(String str) {
        int count = 1;
        while(count < str.length() - 1){
            if(str.charAt(count) == '*' && str.charAt(count -1) != str.charAt(count+1)){
                return false;
            } count++;
        } return true;
    }
}
