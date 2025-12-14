public class Operator {
    public static void main(String[] args) {
        // 1. Присваивание и арифметические операторы
        int a = 5;
        System.out.println("Изначальное a: " + a);
        a += 3; 
        System.out.println("После a += 3: " + a);
        a -= 2; 
        System.out.println("После a -= 2: " + a);
        a *= 4; 
        System.out.println("После a *= 4: " + a);
        a /= 6; 
        System.out.println("После a /= 6: " + a);
        a %= 3;
        System.out.println("После a %= 3: " + a);

        String s = "Hello";
        s += " World";
        System.out.println("Конкатенация строки: " + s);

        // 2. Тернарный оператор
        int x = 10;
        String result = (x > 5) ? "Больше 5" : "Меньше или равно 5";
        System.out.println("Тернарный оператор: " + result);

        // 3. Логические операторы
        boolean boolA = true;
        boolean boolB = false;
        System.out.println("boolA || boolB: " + (boolA || boolB));
        System.out.println("boolA && boolB: " + (boolA && boolB));
        System.out.println("!boolA: " + (!boolA));

        // 4. Побитовые операторы
        int num1 = 6;  
        int num2 = 3;  
        System.out.println("num1 | num2: " + (num1 | num2)); 
        System.out.println("num1 ^ num2: " + (num1 ^ num2)); 
        System.out.println("num1 & num2: " + (num1 & num2)); 
        System.out.println("~num1: " + (~num1)); 

        // 5. Операторы сравнения
        int compA = 5;
        int compB = 10;
        System.out.println("compA == compB: " + (compA == compB)); 
        System.out.println("compB > compA: " + (compB > compA));   
        System.out.println("compB >= compA: " + (compB >= compA)); 
        System.out.println("compA < compB: " + (compA < compB));   
        System.out.println("compA <= 5: " + (compA <= 5));         

        String str1 = "abc";
        String str2 = "abc";
        System.out.println("str1.equals(str2): " + str1.equals(str2));
        System.out.println("str1 == str2: " + (str1 == str2)); 

        // 6. Сдвиговые операторы
        int shiftNum = 16;
        System.out.println("shiftNum >> 2: " + (shiftNum >> 2));   
        System.out.println("shiftNum >>> 2: " + (shiftNum >>> 2)); 
        System.out.println("shiftNum << 1: " + (shiftNum << 1));   

        int negNum = -16;
        System.out.println("negNum >> 2: " + (negNum >> 2));
        System.out.println("negNum >>> 2: " + (negNum >>> 2));

        // 7. Арифметические операторы
        int a1 = 10;
        int b1 = 3;
        System.out.println("a + b: " + (a1 + b1));
        System.out.println("a - b: " + (a1 - b1));
        System.out.println("a * b: " + (a1 * b1));
        System.out.println("a / b: " + (a1 / b1));
        System.out.println("a % b: " + (a1 % b1));

        String concatStr = "Java" + " " + "Language";
        System.out.println("Конкатенация строк: " + concatStr);

        // 8. Инкремент и декремент
        int incDecVar = 5;

        
        System.out.println("Постфиксный инкремент: " + incDecVar++); 
        System.out.println("После постфиксного ++: " + incDecVar);
        
        System.out.println("Префиксный инкремент: " + ++incDecVar); 
        System.out.println("После префиксного ++: " + incDecVar);

        
        int decVar = 10;
        System.out.println("Постфиксный декремент: " + decVar--); 
        System.out.println("После постфиксного --: " + decVar);
        
        System.out.println("Префиксный декремент: " + --decVar); 
        System.out.println("После префиксного --: " + decVar);

        // 9. Побочное NOT ~
        int value = 5; 
        System.out.println(" ~value: " + (~value)); 

        // 10. Логическое отрицание !
        boolean flag = false;
        System.out.println("flag: " + flag);
        System.out.println("!flag: " + !flag);

        // 11. Скобки и массивы
        int b = 10;
        int grouped = (a + b) * 2;
        System.out.println("Группировка (a + b) * 2: " + grouped);

        int[] array = {1, 2, 3};
        System.out.println("Первый элемент массива: " + array[0]);
    }
}


