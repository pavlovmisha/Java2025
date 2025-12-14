public class AutoBoxingNullExample {
    public static void main(String[] args) {
        Integer integerObject = null; // объект-оболочка равен null

        // Попытка неявно распаковать null в int
        int primitiveInt = integerObject; // здесь происходит автораспаковка
        // Это вызовет исключение NullPointerException
    }
}