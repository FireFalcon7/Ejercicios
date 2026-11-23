import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class j_Jokoa {
    Queue<Integer>[] jokalariak;
    // Fitxen koloreak balio osokoen bidez adierazten dira: beltzak 0 eta
// beste jokalarien kolorea bere posizioarekin bat etorriko da (hau da,
// 1 jokalariak 1 kolorea, ...)
    Stack<Integer> mahaia;
    public class Jokaldi {
        int dado1;
        int dado2;
    }
    public int jokoa(int n, ArrayList<Jokaldi> jokaldiak) {
        jokalariak = new Queue[6];
        for (int i = 0; i < jokalariak.length; i++) {
            jokalariak[i] = new LinkedList<>();
            for (int j = 0; j < n; j++) {
                jokalariak[i].add(i);
            }
        }
        mahaia = new Stack<>();
        for(Jokaldi j: jokaldiak){
            if (j.dado1 == 6){
                break;
            }
            else if(j.dado1%2==0){
               mahaia.push(jokalariak[j.dado2].remove());
            }
            else {
                jokalariak[j.dado2].add(mahaia.pop());
            }
        }
        int irabazle = -1;
        int handiena = -1;
        for (int i = 1; i < jokalariak.length; i++) {
            int beltzKop = 0;
            for (Integer fitxa : jokalariak[i]) {
                if (fitxa == 0) {
                    beltzKop++;
                }
            }
            if (beltzKop > handiena) {
                handiena = beltzKop;
                irabazle = i;
            }
        }
        return irabazle;
    }
        // aurre: n jokalari bakoitzaren hasierako fitxa-kopurua da
// “jokaldiak” zerrendak partida bateko jokaldiak ditu
// post: emaitza irabazlearen zenbakia da
}