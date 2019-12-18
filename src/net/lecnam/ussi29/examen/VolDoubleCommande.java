package net.lecnam.ussi29.examen;

import java.time.LocalDate;

public class VolDoubleCommande extends Vol {

    private final double COEFFICIENT_MAJORATION = 1.15;


    public VolDoubleCommande(Avion avion, int duree, LocalDate date) {
        super(avion, duree, date);
    }


    @Override
    protected String getTypeVol(){
        return "Double Commande";
    }

    @Override
    protected double getCout(){
        return this.avion.getCoutHoraire()/60 * getDuree() * COEFFICIENT_MAJORATION;
    }
}
