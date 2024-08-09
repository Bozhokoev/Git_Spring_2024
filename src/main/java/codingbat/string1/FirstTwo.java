package codingbat.string1;

public class FirstTwo {
    public static void main(String[] args) {
        FirstTwo obj = new FirstTwo();
        System.out.println(obj.firstTwo("Hello"));
    }
    public String firstTwo(String str) {
        if(str.length()>=2){
            return str.substring(0,2);
        }
        return str;
    }
}
