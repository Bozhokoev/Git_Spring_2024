package codingbat.warmup1;

public class MonkeyTrouble {
    public static void main(String[] args) {
        MonkeyTrouble obj = new MonkeyTrouble();
        System.out.println(obj.monkeyTrouble(true, true));

    }
    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if ((aSmile == true && bSmile == true) || (aSmile==false && bSmile==false)){
            return true;
        } return false;
    }
}
