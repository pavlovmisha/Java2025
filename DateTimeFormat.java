import java.util.Date;

public class DateTimeFormat {
    public static void main(String[] args) {
        Date now = new Date();

        System.out.printf("Час (%%tH): %tH%n", now);       
        System.out.printf("Месяц (%%tB): %tB%n", now);    
        System.out.printf("День недели (%%tA): %tA%n", now); 
        System.out.printf("Год в 4 цифрах (%%tY): %tY%n", now); 
        System.out.printf("Минуты (%%tM): %tM%n", now);   
    }
}