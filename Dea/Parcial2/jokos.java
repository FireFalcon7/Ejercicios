import java.util.ArrayList;
import java.util.Stack;
public class jokos {
    protected  class Ordainketa {
        int ordaintzailea;
        int kobratzailea;
    }
    public int jokatu(int jokalariKop,int hasierakoBilleteKop,ArrayList<Ordainketa> ordainketak){
        Stack<Boolean>[] dirua = (Stack<Boolean>[]) new Stack[jokalariKop];
        return 1;
    }
    // Aurrebaldintza: 2 <= jokalariKop <= 20
    // hasierakoBilleteKop >= 1
    // “ordainketak” zerrendako ordainketa guztiak zuzenak dira,
    // hau da, jokalari batek beti izango ditu nahiko billete
    // ordainketa egiteko
    // Postbaldintza: emaitza, partida amaitzean 0garren jokalariaren billete
    // onen kopurua izango da
}