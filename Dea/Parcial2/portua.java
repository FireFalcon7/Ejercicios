import java.util.Stack;
import java.util.Queue;
public class portua {
    protected  class Eskaera {
        String kontainerKode;
        int nasa;
    }
    protected class Ontzia {
        int mota; //0 (deskarga), 1 (karga)
        String izena;
        Queue<Eskaera> eskaerak;
    }
    Stack<String> nasak[];
    public void portuaSimulatu(Queue<Ontzia> ontziak, int maxEskaera, int nasaKop){
        //Aurre: maxEskaera deskargako ontzi batek txanda batean kudeatu ditzakeen
        //eskaera kopurua da (>=1)
        //Aurre: nasaKop portuaren nasa kopurua da (>=2). 0. nasa berezia da.
        while(!ontziak.isEmpty()){
            if(ontziak.size() == 0){
            }else if(ontziak.peek().mota == 0){
                ontziCurrent = ontziak.peek();
                for(ontziCurrent.eskaerak: Eskaera eskaeraOrain){
                    if(nasak[eskaeraOrdain.nasa].size() < maxEskaera){
                        nasak[eskaeraOrdain.nasa].push(eskaeraOrdain.kontainerKode);
                    }else{
                        //eskaria ez da bete, nasa beteta dago
                    }
                    
                }
            }
        }
        //Post: portuaren jarduera simulatu da, ontzien eskaerak betez.
        //Nasak sortu...
        //Portuaren jarduera simulatu...
    }
}