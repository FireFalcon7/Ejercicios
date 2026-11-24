import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class DorrearenJokoa {
    Queue<Integer>[] eskuak;
    Stack<Integer>[] zigorrak;
    Stack<Integer> dorrea;

    public int jokatu(int jokalariKop, Queue<Integer> blokeSorta) {
        // Aurre: jokalariKop >= 2, eta blokeSorta 1..6 arteko zenbakiekin beteta dago
        // Post: partida jokatu da eta zigor-pilan bloke gutxien dituen jokalaria bueltatzen da
        eskuak = (Queue<Integer>[]) new Queue[jokalariKop];
        zigorrak = (Stack<Integer>[]) new Stack[jokalariKop];
        dorrea = new  Stack<Integer>();
        for(int i = 0; i< jokalariKop;i++){
            eskuak[i]= new LinkedList<Integer>();
            zigorrak[i]= new Stack<Integer>();
        }
        
        return 0;
    }
}