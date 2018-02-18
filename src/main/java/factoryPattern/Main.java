package factoryPattern;

public class Main {
    public static void main(String[] args) {
        HamburgerStore delhiStore = new DelhiHamburgerStore();
        HamburgerStore mumbaiStore = new MumbaiHamburgerStore();
        Hamburger hamburger = delhiStore.orderHumburger("cheese");
        System.out.println("Ordered Delivered "+hamburger.getName() +"\n");
        hamburger = mumbaiStore.orderHumburger("veggie");
        System.out.println("Ordered Delivered "+hamburger.getName());
    }
}
