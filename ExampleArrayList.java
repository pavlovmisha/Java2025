import java.util.ArrayList;
import java.util.Collections;

public class ExampleArrayList {
    public static void main(String[] args) {
        // Создаем два списка
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(40);
        list1.add(10);
        list1.add(30);
        list1.add(20);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(20);
        list2.add(10);
        list2.add(30);
        list2.add(40);
        
        // 1. Выводим списки через toString()
        System.out.println("Исходный list1: " + list1.toString());
        System.out.println("Исходный list2: " + list2.toString());
        
        // 2. Сравниваем списки через equals()
        System.out.println("list1 равен списку2? " + list1.equals(list2));
        
        // 3. Сортируем первый список
        Collections.sort(list1);
        System.out.println("Отсортированный list1: " + list1.toString());
        
        // 4. Используем binarySearch() для поиска элемента 20
        int index = Collections.binarySearch(list1, 20);
        System.out.println("Индекс элемента 20 в отсортированном list1: " + index);
    }
}