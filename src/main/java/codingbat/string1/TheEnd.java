package codingbat.string1;

public class TheEnd {
    public static void main(String[] args) {
        TheEnd obj = new TheEnd();
        System.out.println(obj.theEnd("Hello", true));
    }
    public String theEnd(String str, boolean front) {
        if(front == !false){
            return str.substring(0,1);
        } else{
            return str.substring(str.length() -1);
        }

    }
// String str1 = str.substring(0,1);
//   String str2 = str.substring(str.length() - 1);
//   return front ? str1 : str2;
}
