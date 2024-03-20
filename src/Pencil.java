public class Pencil extends SchoolSupplies {
    private boolean sharp;

    public Pencil(double price, double weight, boolean sharp) {
        super(price, weight);
        this.sharp = sharp;
    }

    public boolean isSharp() {
        return sharp;
    }

    public void setSharp(boolean sharp) {
        this.sharp = sharp;
    }
}
