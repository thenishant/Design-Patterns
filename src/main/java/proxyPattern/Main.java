package proxyPattern;

public class Main {
    public static void main(String[] args) {
        ProxyBank proxyBank = new ProxyBank();

        try {
            proxyBank.withdraw("David");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
