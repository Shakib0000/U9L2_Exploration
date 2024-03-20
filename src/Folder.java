public class Folder extends SchoolSupplies {
    private boolean closed;

    public Folder(double price, double weight, boolean closed) {
        super(price, weight);
        this.closed = closed;
    }

    public boolean isClosed() {
        return closed;
    }

    public void setClosed(boolean closed) {
        this.closed = closed;
    }
}
