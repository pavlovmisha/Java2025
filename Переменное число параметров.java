public class Example {

    // Метод с переменным числом параметров типа int
    public void process(int... numbers) {
        System.out.println("Обработка массива int:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Перегрузка метода с переменными параметрами типа String
    public void process(String... texts) {
        System.out.println("Обработка массива String:");
        for (String text : texts) {
            System.out.println(text);
        }
    }

    // Перегрузка метода с фиксированным параметром и переменными
    public void process(String prefix, int... numbers) {
        System.out.println("Обработка с префиксом и массивом int:");
        System.out.println(prefix);
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Example example = new Example();

        
        example.process(1, 2, 3, 4);                   // вызывает process(int...)
        example.process("Hello", "World");            // вызывает process(String...)
        example.process("Numbers:", 10, 20, 30);      // вызывает process(String, int...)
    }
}