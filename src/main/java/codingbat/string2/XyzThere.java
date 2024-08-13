package codingbat.string2;

public class XyzThere {
    public static void main(String[] args) {
        XyzThere obj = new XyzThere();
        System.out.println(obj.xyzThere("abcxyz"));
    }
    public boolean xyzThere(String str) {
        if (str.length() < 3){
            return false;
        }
        if(str.indexOf("xyz") == 0) {
            return true;
        }
        for ( int i = 1; i < str.length() - 2; i++){
            String word = str.substring(i, i+3);
            if(word.equals("xyz") && str.charAt(i-1) != '.')
                return true;
        }
        return false;
    }
}
