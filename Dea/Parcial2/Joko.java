import java.util.ArrayList;
import java.util.Stack;

public class Joko {
    
    protected class Ordainketa {
        int ordaintzailea;
        int kobratzailea;
        int kopurua;
    }

    protected  int jokatu(int jokalariKopurua, int hasierakoBilleteKopurua, ArrayList<Ordainketa> ordainketak) {
        Stack<Boolean>[] dirua = (Stack<Boolean>[]) new Stack[jokalariKopurua];
        for (int i = 0; i < dirua.length; i++) { // N*K
            dirua[i] = new Stack<Boolean>();
        for (int j = 1; j <= hasierakoBilleteKopurua; j++)
            dirua[i].push(i != 0); // 0 jokalaria → faltsuak
        }
        for (Ordainketa ordainketa : ordainketak) // T
        for (int k = 1; k <= ordainketa.kopurua; k++){
            dirua[ordainketa.kobratzailea].push(dirua[ordainketa.ordaintzailea].pop());
        }
        int benetakoBilleteak = 0;
        while (!dirua[0].isEmpty()){
            if (dirua[0].pop()) {benetakoBilleteak++;}
        } // S gehienez ~NK
        return benetakoBilleteak;
    }

    // Aurrebaldintza: 2 <= jokalariKop <= 20
    // hasierakoBilleteKop >= 1
    // “ordainketak” zerrendako ordainketa guztiak zuzenak dira,
    // hau da, jokalari batek beti izango ditu nahiko billete
    // ordainketa egiteko
    // Postbaldintza: emaitza, partida amaitzean 0garren jokalariaren billete
    
}
