package codingbat.warmup1;

public class Front22 {
    public static void main(String[] args) {
        Front22 obj = new Front22();
        System.out.println(obj.front22("kitten"));
    }
    public String front22(String str) {
        if(str.length() < 2) {
            return str + str + str;
        }
        return str.substring (0,2) + str + str.substring (0,2);
    }
}
