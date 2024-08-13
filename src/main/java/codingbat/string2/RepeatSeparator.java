package codingbat.string2;

public class RepeatSeparator {
    public static void main(String[] args) {
        RepeatSeparator obj = new RepeatSeparator();
        System.out.println(obj.repeatSeparator("Word", "x", 3));
    }
    public String repeatSeparator(String word, String sep, int count) {
        String str = "";
        for(int i = 0; i < count; i++){
            if(i < count - 1){
                str += word + sep;
            } else{
                str += word;
            }
        }return str;
    }
}
