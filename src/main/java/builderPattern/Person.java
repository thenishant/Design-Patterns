package builderPattern;

public class Person {
    String firstName;
    String lastName;
    int age;
    String city;
    String state;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    static class Builder extends Person{

        public Builder firstname(String firstname){
            this.firstName = firstname;
            return this;
        }

        public Builder lastName(String lastname){
            this.lastName = lastName;
            return this;
        }

        public Builder age(int age){
            this.age = age;
            return this;
        }

        public Builder city(String city){
            this.city = city;
            return this;
        }

        public Builder state(String state){
            this.state = state;
            return this;
        }

        public Person build(){
            Person person = new Person();
            person.age = this.age;
            person.firstName = this.firstName;
            person.city = this.city;
            return person;
        }

    }


}
