package CH2.UML_With_CLASS;

public class Barista {

    private EspressoMachine espressoMachine;

    public Barista() {
        super();
    }

    public void setEspressoMachine(EspressoMachine espressoMachine) {
        this.espressoMachine = espressoMachine;
    }

    public Espresso makeEspresso() {
        return espressoMachine.makeEspresso();
    }
}
