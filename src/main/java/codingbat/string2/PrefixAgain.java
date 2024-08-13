package codingbat.string2;

public class PrefixAgain {
    public static void main(String[] args) {
        PrefixAgain obj = new PrefixAgain();
        System.out.println(obj.prefixAgain("abXYabc", 1));
    }
    public boolean prefixAgain(String str, int n) {
        String prefix = str.substring(0, n); // Получаем предполагаемый префикс строки
        for(int i = n; i <= str.length()-n; i++){
            if(prefix.equals(str.substring(i, n + i))){
                return true;
            }
        } return false;
    }
}
