package CH2.UML_With_CLASS;

public class EspressoMachine {
    private int price = 300000;

    public EspressoMachine() {
        super();
    }

    public Espresso makeEspresso() {
        return new Espresso();
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
