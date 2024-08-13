package codingbat.warmup1;

public class BackAround {
    public static void main(String[] args) {
        BackAround obj = new BackAround();
        System.out.println(obj.backAround("Hello"));
    }
    public String backAround(String str) {
        String sb = str.substring(str.length() - 1);
        return sb+str+sb;
    }
}
