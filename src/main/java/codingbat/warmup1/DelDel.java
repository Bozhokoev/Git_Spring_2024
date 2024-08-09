package codingbat.warmup1;

public class DelDel {
    public static void main(String[] args) {
        DelDel obj = new DelDel();
        System.out.println(obj.delDel("adelbc"));
    }
    public String delDel(String str) {
        if (str.length() >= 4 && str.substring(1, 4).equals("del")) {
            return str.charAt(0) + str.substring(4);
        } else {
            return str;
        }
    }
}
