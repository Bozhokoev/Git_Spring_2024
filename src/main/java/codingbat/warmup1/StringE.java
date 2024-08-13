package codingbat.warmup1;

public class StringE {
    public static void main(String[] args) {
        StringE obj = new StringE();
        System.out.println(obj.stringE("Hello"));
    }
    public boolean stringE(String str) {
        int count = 0;
        int eCount = 0;
        while(count < str.length()){
            if(str.charAt(count) == 'e'){
                eCount++;
            }
            count++;
        }
        return eCount >= 1 && eCount <= 3;
    }
}
