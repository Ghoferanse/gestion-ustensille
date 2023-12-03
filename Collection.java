package tn.poo.gestiondecuisine;

import javax.swing.*;
import java.sql.SQLOutput;

public class Collection {

    public static void main(String[] Args)
    {
        AssietteCarree a0=new AssietteCarree(1940,2.3);
        AssietteRonde a1=new AssietteRonde(1941,3.14);
        Cuillere a2=new Cuillere(1942,6.8);
        AssietteRonde a3=new AssietteRonde(1943,8.1);
        AssietteCarree a4=new AssietteCarree(1944,6.4);
        Ustensile[] tab=new Ustensile[5];

        tab [0]=a0;
        tab [1]=a1;
        tab [2]=a2;
        tab [3]=a3;
        tab[4]=a4;







    }
   public static void afficheCuillere(Ustensile[] tab)
   {
      int nb=0;
      for(int i=0;  i<tab.length;i++) {
          if (tab[i] instanceof Cuillere )
          {nb++ ;

          }

      }


      System.out.println("Il y a "+nb+"Cuilleres");}






       public static void afficheSurface(Ustensile[] tab) {
           double surface = 0;
           for (int i = 0; i < tab.length; i++) {
               if (tab[i] instanceof Assiette) {
                   surface = surface + ((Assiette) tab[i]).calculSurface();

               }
               System.out.println("surface totale des Assiette:" + surface);


           }


       }



    public static void affichevaleurtotale(Ustensile[] tab) {
        double somme = 0;
        for (int i = 0; i < tab.length; i++) {
                somme = somme + tab[i].calculerValeur(2023);

            }
            System.out.println("valeur totale des Assiette:" + somme);


        }



}
