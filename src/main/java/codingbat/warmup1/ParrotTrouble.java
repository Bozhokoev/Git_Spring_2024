package codingbat.warmup1;

public class ParrotTrouble {
    public static void main(String[] args) {
        ParrotTrouble obj = new ParrotTrouble();
        System.out.println(obj.parrotTrouble(true, 6));
    }
    public boolean parrotTrouble(boolean talking, int hour) {
        if ((hour > 20) || (hour >=0 && hour <7)) {
            return talking;
        } else {
            return false;
        }
    }
}
