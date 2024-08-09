package codingbat.string1;

public class SeeColor {
    public static void main(String[] args) {
        SeeColor obj = new SeeColor();
        System.out.println(obj.seeColor("redxx"));
    }
    public String seeColor(String str) {
        if(str.startsWith("red")){
            return "red";
        }else if (str.startsWith("blue")) {
            return "blue";
        }
        return "";
    }
}
