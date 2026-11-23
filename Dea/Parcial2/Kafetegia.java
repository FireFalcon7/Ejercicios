import java.util.LinkedList;
import java.util.Queue;
public class Kafetegia {
    Queue<Queue<Integer>> ilara = null; // ilaren ilara
    public void txertatu(Integer elem){
        if (ilara ==null){
            ilara = new LinkedList<Queue<Integer>>();
            Queue<Integer> subIlara  = new LinkedList<Integer>();
            subIlara.add(elem);
        } else {
            boolean amaitu = false;
            boolean gehitua = false;
            Queue<Integer> lehenengoa = ilara.peek();
            while (!amaitu) {
               if(taldeBera(ilara.peek().peek(), elem)){
                    ilara.peek().add(elem);
                    gehitua = true;
                    amaitu = true;
               } 
               ilara.add(ilara.remove());
               if (lehenengoa.equals(ilara.peek())) {
                    amaitu = true;
               }
            }
            if (!gehitua) {
                Queue<Integer> berria  = new LinkedList<Integer>();
                berria.add(elem);
                ilara.add(berria);
            }
        }
    }
    // Postbaldintza: “elem” gehitu da kafetegiko ilaran
    public Integer ezabatu(){
        int kendua =ilara.peek().remove();
        if(ilara.peek().isEmpty()){
            ilara.remove();
        }
        return kendua;
    }
    // Precondición: gutxienez pertsona bat dago ilaran
    // Postbaldintza: ilarako lehen elementua kendu da eta bere balioa bueltatu da
    public boolean taldeBera(int p1, int p2){
        return zerTalde(p1) == zerTalde(p2) && zerTalde(p1)!= 0;
    }
    public int zerTalde(int p){
        if(p == 1 || p == 5 || p == 7){
            return 1;
        }else if (p == 2 || p == 4 || p == 8 || p == 10){
            return 2;
        } else if(p == 3 || p == 6 || p == 11){
            return 3;
        }else{
            return 0;
        }
    }
    // Postbaldintza: true baldin p1 eta p2 talde berekoak badira eta false bestela
    // EZ DA METODO HAU INPLEMENTATU BEHAR
} // Kafetegia