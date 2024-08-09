package codingbat.warmup1;

public class StartHi {
    public static void main(String[] args) {
        StartHi obj = new StartHi();
        System.out.println(obj.startHi("hi there"));
    }
    public boolean startHi(String str) {
        if (str.startsWith("hi")){
            return true;
        }
        return false;
    }
}
