package adaptorPattern;

public class SocketAdaptorImpentation extends Socket implements SocketAdaptor {
    @Override
    public Volt get12Volts() {
        Volt v = getVolt();
        return convertVolts(v, 10);
    }

    @Override
    public Volt get120Volts() {
        return getVolt();
    }

    @Override
    public Volt get3Volts() {
        Volt v = getVolt();
        return convertVolts(v, 40);
    }

    @Override
    public Volt get1Volt() {
        return get1Volt();
    }

    public Volt convertVolts(Volt v, int i) {
        return new Volt(v.getVolts() / i);
    }
}
