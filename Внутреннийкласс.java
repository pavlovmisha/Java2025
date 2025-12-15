public class Outer {

    // public внутренний класс - доступен из любого другого кода
    public class InnerPublic {
        public void display() {
            System.out.println("Public Inner Class");
        }
    }

    // package-private внутренний класс (по умолчанию)
    class InnerDefault {
        void display() {
            System.out.println("Default (package-private) Inner Class");
        }
    }

    // private внутренний класс - доступен только внутри Outer
    private class InnerPrivate {
        void display() {
            System.out.println("Private Inner Class");
        }
    }

    // protected внутренний класс - доступен внутри пакета и подклассам
    protected class InnerProtected {
        void display() {
            System.out.println("Protected Inner Class");
        }
    }

    // Метод, демонстрирующий создание экземпляров внутренних классов
    public void demonstrate() {
        InnerPublic publicInner = new InnerPublic();
        publicInner.display();

        InnerDefault defaultInner = new InnerDefault();
        defaultInner.display();

        InnerPrivate privateInner = new InnerPrivate();
        privateInner.display();

        InnerProtected protectedInner = new InnerProtected();
        protectedInner.display();

        // Также можно создавать внутренние классы внутри методов этого же класса
        createLocalInner();
    }

    // Пример локального внутреннего класса
    private void createLocalInner() {
        class LocalInner {
            void display() {
                System.out.println("Local Inner Class");
            }
        }
        LocalInner localInner = new LocalInner();
        localInner.display();
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.demonstrate();

        // Создание экземпляра публичного внутреннего класса извне
        Outer.InnerPublic innerPublic = outer.new InnerPublic();
        innerPublic.display();

        // Создать экземпляр InnerDefault (в рамках того же пакета, тут всё в одном файле)
        Outer.InnerDefault innerDefault = outer.new InnerDefault();
        innerDefault.display();

        // Создание экземпляров InnerProtected, доступных в подклассах
        SubOuter sub = new SubOuter();
        sub.test();
    }
}

// Подкласс External, показывающий доступ к protected классу
class SubOuter extends Outer {
    public void test() {
        InnerProtected inner = new InnerProtected();
        inner.display();
    }
}