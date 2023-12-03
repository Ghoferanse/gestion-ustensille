package tn.poo.gestiondecuisine;

public  class AssietteRonde extends Assiette {
    private double rayon;

    public AssietteRonde(int anneeFab, double rayon) {
        super(anneeFab);
        this.rayon = rayon;




    }

    public double getRayon() {
        return rayon;
    }

    public void setRayon(double rayon) {
        this.rayon = rayon;
    }



    @Override
    public double calculSurface()
    {

        return 3.14*rayon*rayon;
    }






}
