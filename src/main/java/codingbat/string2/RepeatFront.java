package codingbat.string2;

public class RepeatFront {
    public static void main(String[] args) {
        RepeatFront obj = new RepeatFront();
        System.out.println(obj.repeatFront("Chocolate", 4));
    }
    public String repeatFront(String str, int n) {
        String word = "";
        for (int i = n; i > 0; i--){
            word += str.substring(0, i);
        }
        return word;
    }
}
