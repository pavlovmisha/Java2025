public class StringConversionsExample {
    public static void main(String[] args) {
        // Исходный объект String
        String originalString = "Пример строки";

        // 1. String → StringBuffer и StringBuilder
        StringBuffer bufferFromString = new StringBuffer(originalString);
        StringBuilder builderFromString = new StringBuilder(originalString);

        System.out.println("Из String в StringBuffer: " + bufferFromString);
        System.out.println("Из String в StringBuilder: " + builderFromString);

        // Создаем объекты StringBuffer и StringBuilder
        StringBuffer buffer = new StringBuffer("Исходный Buffer");
        StringBuilder builder = new StringBuilder("Исходный Builder");

        // 2. StringBuffer и StringBuilder → String
        String stringFromBuffer = buffer.toString();
        String stringFromBuilder = builder.toString();

        System.out.println("\nИз StringBuffer в String: " + stringFromBuffer);
        System.out.println("Из StringBuilder в String: " + stringFromBuilder);

        // 3. StringBuffer ↔ StringBuilder
        StringBuilder builderFromBuffer = new StringBuilder(buffer);
        StringBuffer bufferFromBuilder = new StringBuffer(builder);

        System.out.println("\nИз StringBuffer в StringBuilder: " + builderFromBuffer);
        System.out.println("Из StringBuilder в StringBuffer: " + bufferFromBuilder);
    }
}