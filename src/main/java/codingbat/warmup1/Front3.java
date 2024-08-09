package codingbat.warmup1;

public class Front3 {
    public static void main(String[] args) {
        Front3 obj = new Front3();
        System.out.println(obj.front3("Java"));
    }
    public String front3(String str) {
        if (str.length() >= 3){
            String sb = str.substring (0,3);
            return sb + sb + sb;
        } else if (str.length () < 3) {
            return str + str + str;
        }
        return str;
    }
}
