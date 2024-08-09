package codingbat.string1;

public class WithoutEnd {
    public static void main(String[] args) {
        WithoutEnd obj = new WithoutEnd();
        System.out.println(obj.withoutEnd("Hello"));
    }
    public String withoutEnd(String str) {
        if(str.length() > 0){
            return str.substring(1, str.length()-1);
        }
        return str;
    }
    //return str.substring(1, str.length() -1)
}
