public class TypeofSwitch {
    public static void main(String[] args) {
        byte b = 2;
        switch (b) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            default:
                System.out.println("Default");
        }
        
        Integer num = 10;
        switch (num) {
            case 5:
                System.out.println("Five");
            break;
            case 10:
                System.out.println("Ten");
                break;
         default:
                System.out.println("Other");
        }
        
        String day = "Monday";
        switch (day) {
            case "Monday":
                System.out.println("Start of week");
                break;
            case "Friday":
            System.out.println("Almost weekend");
                break;
            default:
                System.out.println("Other day");
        }
        
        enum Color { RED, GREEN, BLUE }

        Color c = Color.GREEN;
        switch (c) {
            case RED:
                System.out.println("Red color");
                break;
            case GREEN:
                System.out.println("Green color");
                break;
            case BLUE:
                System.out.println("Blue color");
                break;
        }
    }
}