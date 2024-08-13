package codingbat.string1;

public class Left2 {
    public static void main(String[] args) {
        Left2 obj = new Left2();
        System.out.println(obj.left2("Hello"));
    }
    public String left2(String str) {
        if(str.length() > 2){
            return str.substring(2).concat(str.substring(0, 2));
        } return str;
    }
// String word1 = str.substring (0,2);
//   String word2 = str.substring (2);
//   return word2 + word1;
}
