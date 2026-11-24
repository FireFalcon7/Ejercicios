import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class HegazkinPortua {
    public class Hegazkina {
        String kodea;
        int bidaiariak;
    }

    public class Gertaera {
        int mota; // 0: iritsi, 1: lurreratu, 2: matxura hangarrera, 3: konpondu hangarretik
        Hegazkina hegazkina; // mota == 0 denean
        int pistaZenb; // mota == 1 edo 2 denean
        int kopurua; // mota == 3 denean
    }

    Queue<Hegazkina>[] pistak;
    Stack<Hegazkina> hangarra;

    public int simulatu(int pistaKop, Queue<Gertaera> gertaerak) {
        // Aurre: pistaKop >= 1
        // Post: gertaera guztiak prozesatu dira eta lurreratu diren bidaiari totalak bueltatzen dira
        int bidaiariTotalak = 0;
        pistak = (Queue<Hegazkina>[]) new  Queue[pistaKop];
        hangarra = new Stack<Hegazkina>();
        for(int i = 0; i <pistaKop; i++){
            pistak[i] = new LinkedList<Hegazkina>();
        }
        while (!gertaerak.isEmpty()) {
            if(gertaerak.peek().mota == 0){
                hoberenaJoan(pistak, gertaerak.peek().hegazkina);
            }else if(gertaerak.peek().mota == 1){
                if(!pistak[gertaerak.peek().pistaZenb].isEmpty()){
                    bidaiariTotalak = bidaiariTotalak + pistak[gertaerak.peek().pistaZenb].remove().bidaiariak;
                }
            }else if(gertaerak.peek().mota == 2){
                if(!pistak[gertaerak.peek().pistaZenb].isEmpty()){
                    hangarra.push(pistak[gertaerak.peek().pistaZenb].remove());
                }
            }else{
                int zenbat = 0;
                int max = gertaerak.peek().kopurua;
                while (!hangarra.isEmpty() && zenbat < max) {
                    hoberenaJoan(pistak, hangarra.pop());
                    zenbat++;
                }
            }
            gertaerak.remove();
        }

        return bidaiariTotalak;
    }
    private void hoberenaJoan(Queue<Hegazkina>[] pistak, Hegazkina hegazkina){

        int luzeraMin = Integer.MAX_VALUE;
        int kont = 0;
        int pistaHoberena = -1;
        for (Queue<Hegazkina> pista : pistak) {
            int luzeraOrain = pista.size();
            if(luzeraMin> luzeraOrain){
                luzeraMin = luzeraOrain;
                pistaHoberena = kont;
            }
            kont++;
        }
        pistak[pistaHoberena].add(hegazkina);
    }
}