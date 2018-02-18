package factoryPattern;

public class MumbaiHamburgerStore extends HamburgerStore {

    @Override
    public Hamburger createHamburger(String type) {
        switch (type) {
            case "cheese":
                return new MumbaiCheeseBurger();
            case "veggie":
                return new MumbaiVeggieBurger();
            default:
                return null;
        }
    }
}
