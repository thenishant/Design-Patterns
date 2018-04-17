package adaptorPattern;

public class SocketObjectAdaptor implements SocketAdaptor {

    Socket socket = new Socket();

    @Override
    public Volt get12Volts() {
        return socket.getVolt();

    }

    @Override
    public Volt get120Volts() {
        Volt v = socket.getVolt();
        return convertVolts(v, 10);
    }

    @Override
    public Volt get3Volts() {
        Volt v = socket.getVolt();
        return convertVolts(v, 5);
    }

    @Override
    public Volt get1Volt() {
        return socket.getVolt();
    }

    public Volt convertVolts(Volt v, int i) {
        return new Volt(v.getVolts() / i);
    }
}
