package codingbat.string2;

public class XyzMiddle {
    public static void main(String[] args) {
        XyzMiddle obj = new XyzMiddle();
        System.out.println(obj.xyzMiddle("AAxyzBB"));
    }
    public boolean xyzMiddle(String str) {
        int len = str.length();
        if (len < 3) return false;
        int mid = len / 2;
        boolean even = (len % 2 == 0);
        if (even) {
            // Если длина строки четная, то возможны два варианта:
            // "xyz" в середине строки или слева от центра на одну позицию
            // Проверяем оба варианта:
            return str.substring(mid - 2, mid + 1).equals("xyz")
                    || str.substring(mid - 1, mid + 2).equals("xyz");
        } else {
            // Если длина строки нечетная, то "xyz" может быть ровно в центре
            return str.substring(mid - 1, mid + 2).equals("xyz");
        }
    }
}
