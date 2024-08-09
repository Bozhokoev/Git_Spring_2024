package codingbat.warmup1;

public class Max1020 {
    public static void main(String[] args) {
        Max1020 obj = new Max1020();
        System.out.println(obj.max1020(11, 19));
    }
    public int max1020(int a, int b) {
        // Проверяем, находится ли число 'a' в диапазоне от 10 до 20
        boolean aInRange = (a >= 10 && a <= 20);
        // Проверяем, находится ли число 'b' в диапазоне от 10 до 20
        boolean bInRange = (b >= 10 && b <= 20);

        // Если оба числа находятся в диапазоне от 10 до 20, возвращаем большее из них
        if (aInRange && bInRange) {
            return Math.max(a, b);
        }
        // Если только 'a' находится в диапазоне от 10 до 20, возвращаем его
        else if (aInRange) {
            return a;
        }
        // Если только 'b' находится в диапазоне от 10 до 20, возвращаем его
        else if (bInRange) {
            return b;
        }
        // Если ни одно из чисел не находится в диапазоне от 10 до 20, возвращаем 0
        else {
            return 0;
        }
    }
}
