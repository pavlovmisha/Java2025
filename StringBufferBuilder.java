public class StringBufferBuilder {
    public static void main(String[] args) {
        // Создаем объект StringBuffer
        StringBuffer buffer = new StringBuffer("Начало");
        // Создаем объект StringBuilder
        StringBuilder builder = new StringBuilder("Старт");

        // 1. append() - добавляет строку или другой тип данных к текущему объекту
        buffer.append(" - дополнение Buffer");
        builder.append(" - дополнение Builder");
        System.out.println("После append:");
        System.out.println("StringBuffer: " + buffer);
        System.out.println("StringBuilder: " + builder);

        // 2. insert() - вставляет строку или другой тип данных в указанную позицию
        buffer.insert(7, " вставлено");
        builder.insert(7, " вставлено");
        System.out.println("\nПосле insert:");
        System.out.println("StringBuffer: " + buffer);
        System.out.println("StringBuilder: " + builder);

        // 3. delete() - удаляет символы в диапазоне
        buffer.delete(0, 7); // удаляет символы с 0 по 6 включительно
        builder.delete(0, 7);
        System.out.println("\nПосле delete:");
        System.out.println("StringBuffer: " + buffer);
        System.out.println("StringBuilder: " + builder);

        // 4. replace() - заменяет диапазон символов на другую строку
        buffer.replace(0, 7, "Заменено");
        builder.replace(0, 9, "Заменено");
        System.out.println("\nПосле replace:");
        System.out.println("StringBuffer: " + buffer);
        System.out.println("StringBuilder: " + builder);

        // 5. reverse() - разворот строки
        buffer.reverse();
        builder.reverse();
        System.out.println("\nПосле reverse:");
        System.out.println("StringBuffer: " + buffer);
        System.out.println("StringBuilder: " + builder);

        // 6. setLength() - установка длины строки
        buffer.setLength(10);
        builder.setLength(10);
        System.out.println("\nПосле setLength(10):");
        System.out.println("StringBuffer: " + buffer);
        System.out.println("StringBuilder: " + builder);

        // 7. charAt() - получение символа по индексу
        char cBuffer = buffer.charAt(2);
        char cBuilder = builder.charAt(2);
        System.out.println("\nЗначение charAt(2):");
        System.out.println("StringBuffer: " + cBuffer);
        System.out.println("StringBuilder: " + cBuilder);

        // 8. indexOf() - поиск подстроки
        int indexBuffer = buffer.indexOf("Заменено");
        int indexBuilder = builder.indexOf("Заменено");
        System.out.println("\nindexOf(\"Заменено\"):");
        System.out.println("StringBuffer: " + indexBuffer);
        System.out.println("StringBuilder: " + indexBuilder);

        // 9. length() - возвращает текущую длину строки
        int lengthBuffer = buffer.length();
        int lengthBuilder = builder.length();
        System.out.println("\nДлина:");
        System.out.println("StringBuffer: " + lengthBuffer);
        System.out.println("StringBuilder: " + lengthBuilder);

        // 10. toString() - преобразование в String
        String strBuffer = buffer.toString();
        String strBuilder = builder.toString();
        System.out.println("\nПреобразование в String:");
        System.out.println("StringBuffer: " + strBuffer);
        System.out.println("StringBuilder: " + strBuilder);
    }
}