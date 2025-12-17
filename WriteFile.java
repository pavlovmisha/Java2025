import java.io.FileOutputStream;
import java.io.IOException;

public class WriteFile {
    public static void main(String[] args) {
        String filename = "output.txt";

        try (FileOutputStream fos = new FileOutputStream(filename)) {
            fos.write('H');
            fos.write('e');
            fos.write('l');
            fos.write('l');
            fos.write('o');
            fos.write(' ');
            fos.write('W');
            fos.write('o');
            fos.write('r');
            fos.write('l');
            fos.write('d');
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Данные записаны в файл " + filename);
    }
}