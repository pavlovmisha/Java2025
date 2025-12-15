public class Outer {
    class Inner {
        public int publicField = 1;
        protected int protectedField = 2;
        private int privateField = 3;
        int packagePrivateField = 4;

        public void publicMethod() {
            System.out.println("Inner publicMethod");
        }

        protected void protectedMethod() {
            System.out.println("Inner protectedMethod");
        }

        private void privateMethod() {
            System.out.println("Inner privateMethod");
        }

        void packagePrivateMethod() {
            System.out.println("Inner package-privateMethod");
        }

        public int getPrivateField() {
            return privateField; // публичный метод для доступа к приватному полю
        }
    }

    public void accessInnerMembers() {
        Inner inner = new Inner();

        // Внутри внешнего класса — есть доступ к любым членам внутреннего класса через экземпляр
        System.out.println("Доступ к публичному полю: " + inner.publicField);
        System.out.println("Доступ к защищённому полю: " + inner.protectedField);
        System.out.println("Доступ к приватному полю через публичный метод: " + inner.getPrivateField());
        System.out.println("Доступ к package-private полю: " + inner.packagePrivateField);

        inner.publicMethod();
        inner.protectedMethod();

        // Не получится к приватному методу напрямую
        // inner.privateMethod(); // Ошибка компиляции
        inner.getPrivateField(); // корректный вызов через публичный метод
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.accessInnerMembers();
    }
}