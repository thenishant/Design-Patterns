package singletonPattern;

public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getUniqueSingleton();
        Singleton singleton1 = Singleton.getUniqueSingleton();
        System.out.println(singleton);
        System.out.println(singleton1);
    }
}
