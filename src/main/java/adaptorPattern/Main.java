package adaptorPattern;

public class Main {
    public static void main(String[] args) {

        testingObject();
        testingObject1();

    }

    public static void testingObject1() {
        SocketAdaptor socketAdaptor = new SocketObjectAdaptor();
        Volt v12 = converVolts(socketAdaptor, 12);
        Volt v3 = converVolts(socketAdaptor, 3);
        Volt v120 = converVolts(socketAdaptor, 120);
        System.out.println("V5 is using " + v3.getVolts());
        System.out.println("V12 is using " + v12.getVolts());
        System.out.println("V120 is using " + v120.getVolts());


    }

    public static void testingObject() {
        SocketAdaptor socketAdaptor = new SocketAdaptorImpentation();
        Volt v12 = converVolts(socketAdaptor, 12);
        Volt v3 = converVolts(socketAdaptor, 3);
        Volt v120 = converVolts(socketAdaptor, 120);
        System.out.println("V5 is using " + v3.getVolts());
        System.out.println("V12 is using " + v12.getVolts());
        System.out.println("V120 is using " + v120.getVolts());


    }

    public static Volt converVolts(SocketAdaptor s, int i) {
        switch (i) {
            case 3:
                return s.get3Volts();
            case 12:
                return s.get12Volts();
            case 120:
                return s.get120Volts();
            default:
                return s.get120Volts();
        }
    }


}
