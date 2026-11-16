import java.util.ArrayList;

public class Joko {
    
    protected class Ordainketa {
        int ordaintzailea;
        int kobratzailea;
        int kopurua;
    }
    public int jokatu(int jokalariKop,int hasierakoBilleteKop,ArrayList<Ordainketa> ordainketak){
        // Aurrebaldintza: 2 <= jokalariKop <= 20
        // hasierakoBilleteKop >= 1
        // “ordainketak” zerrendako ordainketa guztiak zuzenak dira,
        // hau da, jokalari batek beti izango ditu nahiko billete
        // ordainketa egiteko
        // Postbaldintza: emaitza, partida amaitzean 0garren jokalariaren billete
        // onen kopurua izango da
        ArrayList<Integer> billeteak = new ArrayList<>();
        for (int i = 0; i < jokalariKop; i++) {
            billeteak.add(hasierakoBilleteKop);
        }

        for (Ordainketa ordainketa : ordainketak) {
            billeteak.set(
                ordainketa.ordaintzailea,
                billeteak.get(ordainketa.ordaintzailea) - ordainketa.kopurua);
            billeteak.set(ordainketa.kobratzailea,billeteak.get(ordainketa.kobratzailea) + ordainketa.kopurua);
        }

        return billeteak.get(0);
    }
}
