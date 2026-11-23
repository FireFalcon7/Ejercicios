import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class jorkoa {
    Queue<Integer>[] jokalariak;
    Stack<Integer> mahaia;

    public class Jokaldi {
        int dado1;
        int dado2;
    }

    public int jokoa(int n, ArrayList<Jokaldi> jokaldiak) {
        jokalariak = new LinkedList[n];
        mahaia = new Stack<>();
        for(int i = 0; i<n;i++){
            Queue<Integer> jokalaria = new LinkedList<Integer>();
            jokalariak[i]=jokalaria;
            for(int j=0; j<n; j++){
                jokalaria.add(i);
            }
        }
        for (Jokaldi jokaldi : jokaldiak) {
            if (jokaldi.dado1 == 6) {
                return norIrabazi(jokalariak);
            } else if (jokaldi.dado1 % 2==0) {
                int jokalariOrain = jokaldi.dado2;
                mahaia.push(jokalariak[jokalariOrain].remove());
            }else{
                int jokalariOrain = jokaldi.dado2;
                if (!mahaia.isEmpty()) {
                    jokalariak[jokalariOrain].add(mahaia.pull());
                }
            }
        }
        return norIrabazi(jokalariak);
        // aurre: n jokalari bakoitzaren hasierako fitxa-kopurua da
        //        "jokaldiak" zerrendak partida bateko jokaldiak ditu
        // post: emaitza irabazlearen zenbakia da

        // 1. Inicializar jokalariak (tamaño 6) con n fichas cada uno y mahaia vacía
        
        // 2. Recorrer jokaldiak aplicando las reglas de dado1 y dado2 (parando si dado1 == 6)
        
        // 3. Contar fichas negras (0) en los jugadores 1..5 y devolver el ganador
    }
    public int norIrabazi(Queue<Integer>[] jokalariak){
        int kont = 0;
        int beltzKopIra = -1;
        int irabazleTemp = 0;
        for (Queue<Integer> jokalari : jokalariak){
            if (kont== 0) {
            } else {
                int beltzKop = 0;
                while(!jokalari.isEmpty()){
                    if (jokalari.peek()==0) {
                        beltzKop++;
                    }
                    jokalari.remove();
                }
                if(beltzKopIra < beltzKop){
                    beltzKopIra = beltzKop;
                    irabazleTemp = kont;
                }
            }
            kont++;
        }
        return irabazleTemp;
    }
}