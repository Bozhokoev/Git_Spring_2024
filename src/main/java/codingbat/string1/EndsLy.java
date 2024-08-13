package codingbat.string1;

public class EndsLy {
    public static void main(String[] args) {
        EndsLy obj = new EndsLy();
        System.out.println(obj.endsLy("oddly"));
    }
    public boolean endsLy(String str) {
        if(str.length() >=2){
            return str.substring(str.length()-2).equals("ly");
        }
        return false;
    }
//return str.endsWith ("ly");
}
