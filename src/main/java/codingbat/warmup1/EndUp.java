package codingbat.warmup1;

public class EndUp {
    public static void main(String[] args) {
        EndUp obj = new EndUp();
        System.out.println(obj.endUp("Hello"));
    }
    public String endUp(String str) {
        if(str.length()>3){
            return str.substring(0, str.length() - 3) + str.substring(str.length()-3).toUpperCase();
        }
        return str.toUpperCase();
    }
}
