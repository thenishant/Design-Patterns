package builderPattern;

public class Main {
    public static void main(String[] args) {
        Person person = new Person.Builder()
                .firstname("Nishant")
                .age(23)
                .build();

        System.out.println(person.getAge());
    }
}
