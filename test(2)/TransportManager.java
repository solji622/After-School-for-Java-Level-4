public class TransportManager <T extends Movable>{
    private T transport;

    public T getTransport() {
        return transport;
    }

    public void setTransport(T transport) {
        this.transport = transport;
    }

    public void moveTransport(double distance) {
        transport.move(distance);
    }
}
