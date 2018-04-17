package singletonPattern;

public class Singleton {

    private Singleton() {

    }

    //Double checking lock creation
    private static volatile Singleton uniqueSingleton;

    public static Singleton getUniqueSingleton() {
        if (uniqueSingleton == null) {
            synchronized (Singleton.class) {
                if (uniqueSingleton == null)
                    uniqueSingleton = new Singleton();
            }
        }
        return uniqueSingleton;
    }

    /*//Eager initialization
    public static Singleton uniqueSingleton = new Singleton();


    public static Singleton getUniqueSingleton() {
        return uniqueSingleton;
    }*/

    /*// Lazy initialization
    public static Singleton uniqueSingleton = new Singleton();

    public static Singleton getUniqueSingleton() {
        if (uniqueSingleton == null) {
            uniqueSingleton = new Singleton();
        }
        return uniqueSingleton;
    }*/

    /*public synchronized static Singleton getUniqueSingleton() {
        //Adding synchronized makes our singleton thread safe
        if (uniqueSingleton == null) {
            uniqueSingleton = new Singleton();
        }
        return uniqueSingleton;
    }*/
}
