package codingbat.string1;

public class WithouEnd2 {
    public static void main(String[] args) {
        WithouEnd2 obj = new WithouEnd2();
        System.out.println(obj.withouEnd2("Hello"));
    }
    public String withouEnd2(String str) {
        if(str.length() <= 2){
            return "";
        } else{
            return str.substring(1, str.length() - 1);
        }
    }
//String ch1= str.substring(1, str.length() -1);
    // return (str.length() <= 2) ? "" : str.substring(1, str.length() -1);
}
