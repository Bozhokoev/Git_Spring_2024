package codingbat.warmup1;

public class IntMax {
    public static void main(String[] args) {
        IntMax obj = new IntMax();
        System.out.println(obj.intMax(1, 5, 8));
    }
    public int intMax(int a, int b, int c) {
        int max = a; // Предполагаем, что наибольшее значение - это a
        if (b > max) {
            max = b; // Если b больше, чем текущее максимальное значение, присваиваем max значение b
        }
        if (c > max) {
            max = c; // Если c больше, чем текущее максимальное значение, присваиваем max значение c
        }
        return max; // Возвращаем наибольшее значение
    }
}
