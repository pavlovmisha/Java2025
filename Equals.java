public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        // Проверка, что объект ссылается на тот же экземпляр
        if (this == obj) {
            return true;
        }

        // Проверка, что объект не равен null и принадлежит тому же классу
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        // Приведение типа и сравнение полей
        Person other = (Person) obj;
        return age == other.age && 
               (name != null ? name.equals(other.name) : other.name == null);
    }
}