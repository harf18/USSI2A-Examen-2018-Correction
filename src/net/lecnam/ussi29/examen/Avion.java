package net.lecnam.ussi29.examen;

public class Avion {

    private String immatriculation;
    private double coutHoraire;

    public Avion(String immatriculation, double coutHoraire) {
        this.immatriculation = immatriculation;
        this.coutHoraire = coutHoraire;
    }

    public String getImmatriculation() {
        return immatriculation;
    }

    public void setImmatriculation(String immatriculation) {
        this.immatriculation = immatriculation;
    }

    public double getCoutHoraire() {
        return coutHoraire;
    }

    public void setCoutHoraire(double coutHoraire) {
        this.coutHoraire = coutHoraire;
    }
}
