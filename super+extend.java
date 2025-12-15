import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<? extends Number> list = Arrays.asList(1, 2.5, 3L);
        Number num = list.get(0); // безопасно
        // list.add(4); // ошибка компиляции, нельзя добавлять
        
        List<? super Integer> list2 = new ArrayList<>();
        list2.add(1); // допустимо
        Object obj = list2.get(0); // возвращает Object, потому что точный тип неизвестен
    }
}