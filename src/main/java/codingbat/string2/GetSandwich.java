package codingbat.string2;

public class GetSandwich {
    public static void main(String[] args) {
        GetSandwich obj = new GetSandwich();
        System.out.println(obj.getSandwich("breadjambread"));
    }
    public String getSandwich(String str) {
        int last = -1;
        int first = -1;
        for (int i = 0; i < str.length()-5; i++){
            if(str.substring(i, i+5).equals("bread")){
                first = i;
                break;
            }
        }
        for(int i = str.length() - 5; i >=0; i--){
            if(str.substring(i, i+5).equals("bread")){
                last = i;
                break;
            }
        }
        if (first != -1 && last != -1 && first != last)
            return str.substring(first+5, last);
        return "";
    }
}
