package codingbat.string1;

public class MiddleTwo {
    public static void main(String[] args) {
        MiddleTwo obj = new MiddleTwo();
        System.out.println(obj.middleTwo("Hello"));
    }
    public String middleTwo(String str) {
        if(str.length()%2 == 0){
            int middle = str.length() / 2 - 1;
            return str.substring(middle, middle + 2);
        } return str;
    }
// int middle = str.length() / 2 - 1;
//   return str.substring(middle, middle+2);
}
