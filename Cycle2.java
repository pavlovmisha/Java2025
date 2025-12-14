public class Cycle2 {
    public static void main(String[] args) {
        
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                break; // прерываем цикл, когда i равно 5
            }
            System.out.println(i);
        }
        
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue; // пропускаем четные числа
            }
            System.out.println(i);
        }
    }
}