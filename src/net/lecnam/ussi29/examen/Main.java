package net.lecnam.ussi29.examen;

public class Main {

    public static void main(String[] args) throws InterruptedException {


        Avion cessna150 = new Avion("F-BUBK", 100);
        Avion dr400 = new Avion("F-GKQA", 130);

        CarnetDeVol c = new CarnetDeVol();
        Vol v1 = new Vol(cessna150, 60, Utils.stringToLocalDate("10/11/2018"));
        Vol v2 = new VolDoubleCommande(dr400, 180, Utils.stringToLocalDate("11/11/2018"));
        Vol v3 = new Vol(cessna150, 30, Utils.stringToLocalDate("12/11/2018"));

        c.addVol(v1);
        c.addVol(v2);
        c.addVol(v3);

        c.afficheVols();

        System.out.println("-------------------------------");

        c.afficheTempsDeVol();

        c.afficheCoutTotal();


    }
}
