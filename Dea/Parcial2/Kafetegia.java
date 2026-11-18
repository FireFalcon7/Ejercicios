import java.util.LinkedList;
import java.util.Queue;
public class Kafetegia {
    Queue<Queue<Integer>> ilara = null; // ilaren ilara
    public void txertatu(Integer elem){
        if (ilara ==null){
            ilara = new LinkedList<Queue<Integer>>();
        }
        if (ilara.isEmpty()) {
            Queue<Integer> txertatu = new LinkedList<Integer>();
            txertatu.add(elem);
            ilara.add(txertatu);
        } else {
            for(int i=0; i<ilara.size()-1;i++){
                ilara.add(ilara.remove());
            }
            Queue<Integer> azkena = ilara.peek();
            ilara.add(ilara.remove());
            int j=0;
            boolean aurkitua = false;
            while(j<azkena.size()){
                if(taldeBera(elem, azkena.peek())&& !aurkitua){
                    azkena.add(azkena.remove());
                    azkena.add(elem);
                    aurkitua = true;
                }else{
                    azkena.add(azkena.remove());
                }
                j++;
            }
            ilara.add(azkena);
        }
    }
    // Postbaldintza: “elem” gehitu da kafetegiko ilaran
    public Integer ezabatu(){
        return -1;
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