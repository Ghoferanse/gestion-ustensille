package tn.poo.gestiondecuisine;

public class AssietteCarree extends Assiette{
    private double cote;

    public AssietteCarree(int anneeFab, double coter) {
        super(anneeFab);
        this.cote = coter;
    }

    public double getCoter() {
        return cote;
    }

    public void setCote(double cote) {
        this.cote = cote;


    }
@Override

    public int calculerValeur(int anneeActuelle)
    {

        return 5 *super.calculerValeur(anneeActuelle);
    }
@Override
    public double calculSurface()
    {

        return cote*cote;
    }





}
