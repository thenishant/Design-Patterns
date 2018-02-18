package factoryPattern;

public class DelhiHamburgerStore extends HamburgerStore {
    @Override
    public Hamburger createHamburger(String type) {
        switch (type) {
            case "cheese":
                return new DelhiCheeseBurger();
            case "veggie":
                return new DelhiVeggieBurger();
            default:
                return null;
        }
    }
}
