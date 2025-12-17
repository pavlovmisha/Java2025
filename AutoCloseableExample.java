class MyResource implements AutoCloseable {
    public MyResource() {
        System.out.println("Ресурс открыт");
    }

    public void doWork() {
        System.out.println("Работаю с ресурсом");
    }

    @Override
    public void close() {
        System.out.println("Ресурс закрыт");
    }
}

public class AutoCloseableExample {
    public static void main(String[] args) {
        try (MyResource res = new MyResource()) {
            res.doWork();
        }
        // После завершения блока try вызовется res.close()
    }
}