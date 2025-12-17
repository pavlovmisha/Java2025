public class ReadFile {
    public static void main(String[] args) {
        
        String filename = "example.txt";
        try (FileInputStream fis = new FileInputStream(filename)) {
            int byteRead;
            while ((byteRead = fis.read()) != -1) {
                char ch = (char) byteRead;
                System.out.print(ch);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}