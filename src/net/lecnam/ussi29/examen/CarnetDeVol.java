package net.lecnam.ussi29.examen;

import java.util.ArrayList;
import java.util.List;

public class CarnetDeVol {

    private List<Vol> volList;

    CarnetDeVol() {
        volList = new ArrayList<>();
    }


    void addVol(Vol vol) {
        volList.add(vol);
    }


    void afficheCoutTotal() {
        double coutTotal = 0;
        for (Vol v : volList) {
            coutTotal += v.getCout();
        }
        System.out.println("Coût " + coutTotal + " €");
    }

    void afficheVols(){
        for (Vol v : volList) {
            System.out.println(v.toString());
        }
    }

    void afficheTempsDeVol(){
        int volDC = 0;
        int volCB = 0;

        for (Vol v : volList) {
            if (v instanceof VolDoubleCommande) {
                volDC += v.getDuree();
            } else {
                volCB += v.getDuree();
            }
        }

        System.out.println("Temps de vol comme commandant de Bord : " + volCB + " minutes");
        System.out.println("Temps de vol en double commandes : " + volDC + " minutes");
    }


}
