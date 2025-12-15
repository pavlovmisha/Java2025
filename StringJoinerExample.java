import java.util.StringJoiner;

public class StringJoinerExample {
    public static void main(String[] args) {
        // Создаем StringJoiner с запятой и пробелом в качестве разделителя
        StringJoiner joiner = new StringJoiner(", ");

        joiner.add("Java");
        joiner.add("Python");
        joiner.add("C++");
        joiner.add("JavaScript");

        System.out.println(joiner.toString()); 
    }
}