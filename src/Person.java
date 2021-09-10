public class Person {
    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    String surname;
    int age;


    Person(String surname, int age) {
        this.surname = surname;
        this.age = age;
    }
}

