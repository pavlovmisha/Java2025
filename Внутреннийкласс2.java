public class Outer {
    private String privateField = "Private field";
    protected String protectedField = "Protected field";
    public String publicField = "Public field";
    String packagePrivateField = "Package-private field";

    // Методы с разными уровнями доступа
    private void privateMethod() {
        System.out.println("Outer privateMethod");
    }

    protected void protectedMethod() {
        System.out.println("Outer protectedMethod");
    }

    public void publicMethod() {
        System.out.println("Outer publicMethod");
    }

    void packagePrivateMethod() {
        System.out.println("Outer package-privateMethod");
    }

    // Внутренний класс внутри Outer
    public class Inner {
        public void accessOuterMembers() {
            // Обращение к полям
            System.out.println(privateField);        // доступ к приватному полю
            System.out.println(protectedField);      // доступ к защищённому полю
            System.out.println(publicField);         // доступ к публичному полю
            System.out.println(packagePrivateField); // доступ к package-private полю

            // Вызов методов
            privateMethod();        // к приватному методу
            protectedMethod();      // к защищённому методу
            publicMethod();         // к публичному методу
            packagePrivateMethod(); // к package-private методу
        }
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        Inner inner = outer.new Inner();
        inner.accessOuterMembers();
    }
}