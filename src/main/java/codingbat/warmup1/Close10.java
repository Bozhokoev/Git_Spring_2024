package codingbat.warmup1;

public class Close10 {
    public static void main(String[] args) {
        Close10 obj = new Close10();
        System.out.println(obj.close10(8, 13));
    }
    public int close10(int a, int b) {
        int diffA = Math.abs(a - 10); // Вычисляем абсолютную разность между a и 10
        int diffB = Math.abs(b - 10); // Вычисляем абсолютную разность между b и 10
        // Сравниваем абсолютные разности и возвращаем ближайшее к 10 число
        if (diffA < diffB) {
            return a;
        } else if (diffB < diffA) {
            return b;
        } else {
            return 0; // Возвращаем 0 в случае ничьей
        }
    }
}
