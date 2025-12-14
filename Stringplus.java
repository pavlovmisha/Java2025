public class StringPlusExample {
    public static void main(String[] args) {
        String str = "Результат: ";
        int num = 42;                   
        double pi = 3.14;               
        boolean flag = true;            
        Object obj = new Object();      
        
        String message = str + num + ", " + pi + ", " + flag;
        System.out.println(message);
        String objectInfo = str + obj;
        System.out.println(objectInfo);
    }
}