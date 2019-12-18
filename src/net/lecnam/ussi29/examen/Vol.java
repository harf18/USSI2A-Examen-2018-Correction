package net.lecnam.ussi29.examen;

import java.time.LocalDate;

public class Vol {

    protected Avion avion;
    private int duree;
    private LocalDate date;

    public Vol(Avion avion, int duree, LocalDate date) {
        this.avion = avion;
        this.duree = duree;
        this.date = date;
    }

    public Avion getAvion() {
        return avion;
    }

    public void setAvion(Avion avion) {
        this.avion = avion;
    }

    public int getDuree() {
        return duree;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }


    public String getDateFormatFrancais() {
        return Utils.localDateToString(getDate());
    }


    @Override
    public String toString() {
        return "date " + getDateFormatFrancais ()
                + " | durée : " + getDuree() + " min"
                + " | " + getTypeVol()
                + " | " + getAvion().getImmatriculation()
                + " | " + getCout() + " €";
    }


    protected String getTypeVol(){
        return "Commandant de Bord";
    }

    protected double getCout(){
        return (this.avion.getCoutHoraire()/60) * getDuree();
    }

}
