package tn.poo.gestiondecuisine;

public abstract class Ustensile {
    private int anneeFab;

    public Ustensile() {
    }



    public Ustensile(int anneeFab) {
        this.anneeFab = anneeFab;
    }


    public int getAnneeFab() {
        return anneeFab;
    }

    public void setAnneeFab(int anneeFab) {
        this.anneeFab = anneeFab;
    }

public int calculerValeur(int anneeActuelle)

{
    int age=anneeActuelle-anneeFab;
    if(age<50)
    {
        return 0;
    }else {return age-50;}






}


}
