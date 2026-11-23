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
        
        // aurre: n jokalari bakoitzaren hasierako fitxa-kopurua da
        //        "jokaldiak" zerrendak partida bateko jokaldiak ditu
        // post: emaitza irabazlearen zenbakia da

        // 1. Inicializar jokalariak (tamaño 6) con n fichas cada uno y mahaia vacía
        
        // 2. Recorrer jokaldiak aplicando las reglas de dado1 y dado2 (parando si dado1 == 6)
        
        // 3. Contar fichas negras (0) en los jugadores 1..5 y devolver el ganador
        return -1;
    }
    public boolean bakoitiaDa(int p){
        if(p==1||p==3||p==5){
            return true;
        }else{
            return false;
        }
    }
}