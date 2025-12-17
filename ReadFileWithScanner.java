import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFileWithScanner {
    public static void main(String[] args) {
        String filename = "example.txt";

        try (Scanner scanner = new Scanner(new File(filename))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден: " + filename);
            e.printStackTrace();
        }
    }
}