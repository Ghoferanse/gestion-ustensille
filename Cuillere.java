package tn.poo.gestiondecuisine;

public class Cuillere extends Ustensile {
    private double longer;


    public Cuillere(int anneeFab, double longer) {
        super(anneeFab);
        this.longer = longer;
    }

    public double getLonger() {
        return longer;
    }

    public void setLonger(double longer) {
        this.longer = longer;
    }

}
