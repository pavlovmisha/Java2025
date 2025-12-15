class Calculator {
    int add(int a, int b) {
        return a + b;
    }
    
    int add(int a, int b, int c) {
        return a + b + c;
    }
    
    double add(double a, double b) {
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println(calc.add(5, 10));        // вызов метода add(int, int)
        System.out.println(calc.add(1, 2, 3));      // вызов метода add(int, int, int)
        System.out.println(calc.add(4.5, 3.2));     // вызов метода add(double, double)
    }
}