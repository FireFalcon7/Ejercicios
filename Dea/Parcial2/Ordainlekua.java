import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Ordainlekua {
    public class Autoa {
        String matrikula;
        double ordainduBeharrekoa;
    }
    
    public class Gertaera {
        int mota; // 0: autoa iritsi, 1: kobratu, 2: kabina itxi
        Autoa autoa; // mota == 0 denean bakarrik erabiltzen da
        int kabinaZenb; // mota == 1 edo 2 denean erabiltzen da
    }
    Queue<Autoa>[] kabinak;
    boolean[] irekita;

    public double simulatu(int kabinaKop, Queue<Gertaera> gertaerak) {
        // Aurre: kabinaKop >= 2, eta gutxienez kabina bat irekita mantenduko da beti
        // Post: gertaera guztiak prozesatu dira eta bildutako diru totala bueltatzen da
        kabinak = (Queue<Autoa>[]) new Queue[kabinaKop];
        irekita = new boolean[kabinaKop];
        for(int i = 0; i< kabinaKop; i++){
            kabinak[i] = new LinkedList<Autoa>();
            irekita[i] = true; 
        }
        double ordaintutakoDirua = 0;
        while(!gertaerak.isEmpty()){
            if(gertaerak.peek().mota == 0){
                hoberenaJoan(kabinak, gertaerak.peek().autoa,irekita);
                gertaerak.remove();
            }else if (gertaerak.peek().mota == 1) {
                if (kabinak[gertaerak.peek().kabinaZenb].isEmpty()) {
                }else{
                    ordaintutakoDirua = kabinak[gertaerak.peek().kabinaZenb].remove().ordainduBeharrekoa + ordaintutakoDirua;
                }
                gertaerak.remove();
            } else {
                Stack<Autoa> kamporatu = new Stack<Autoa>();
                while (!kabinak[gertaerak.peek().kabinaZenb].isEmpty()) {
                    kamporatu.push(kabinak[gertaerak.peek().kabinaZenb].remove());
                }
                irekita[gertaerak.peek().kabinaZenb]=false;
                while(!kamporatu.isEmpty()){
                    hoberenaJoan(kabinak, kamporatu.pop(),irekita);
                }
                gertaerak.remove();
            }
        }

        return ordaintutakoDirua;
    }
    private void hoberenaJoan(Queue<Autoa>[] kabinak, Autoa autoa, boolean[] irekita) {
        int luzera = Integer.MAX_VALUE;
        int non = 0;
        int kont = 0;
        for (Queue<Autoa> a : kabinak) {
            int luzeraOrain = a.size();
            if (irekita[kont] && luzera > luzeraOrain) {
                luzera = luzeraOrain;
                non = kont;
            }
            kont++;
        }
        kabinak[non].add(autoa);
    }
    
}