public class StringMethods {
    public static void main(String[] args) {
        // Исходная строка для демонстрации
        String str = "  Hello, OpenAI! How are you?  ";

        // 1. length() — возвращает длину строки
        System.out.println("Длина строки: " + str.length());

        // 2. trim() — удаляет начальные и конечные пробелы
        String trimmedStr = str.trim();
        System.out.println("После trim(): " + "'" + trimmedStr + "'");

        // 3. toUpperCase() — преобразует строку в верхний регистр
        String upperStr = trimmedStr.toUpperCase();
        System.out.println("В верхнем регистре: " + upperStr);

        // 4. toLowerCase() — преобразует строку в нижний регистр
        String lowerStr = trimmedStr.toLowerCase();
        System.out.println("В нижнем регистре: " + lowerStr);

        // 5. startsWith() — проверяет, начинается ли строка с указанной подстроки
        System.out.println("Начинается с 'Hello': " + trimmedStr.startsWith("Hello"));

        // 6. endsWith() — проверяет, заканчивается ли строка на указанную подстроку
        System.out.println("Заканчивается на '!': " + trimmedStr.endsWith("!"));

        // 7. contains() — проверяет, содержит ли строка указанную подстроку
        System.out.println("Содержит 'OpenAI': " + trimmedStr.contains("OpenAI"));

        // 8. replace() — заменяет все вхождения одной подстроки на другую
        String replacedStr = trimmedStr.replace("OpenAI", "ChatGPT");
        System.out.println("После replace(): " + replacedStr);

        // 9. substring() — возвращает часть строки, начиная с указанного индекса
        String subStr = trimmedStr.substring(7, 13); // символы с 7 по 12 (13 не включительно)
        System.out.println("Подстрока: " + subStr);

        // 10. indexOf() — возвращает индекс первого вхождения подстроки
        int index = trimmedStr.indexOf("How");
        System.out.println("Индекс 'How': " + index);
    }
}