package codingbat.warmup1;

public class SleepIn {
    public static void main(String[] args) {
        SleepIn obj = new SleepIn();
        System.out.println(obj.sleepIn(true, true));

    }
    public boolean sleepIn(boolean weekday, boolean vacation) {
        if (!weekday || vacation){
            return true;
        } return false;
    }
}
