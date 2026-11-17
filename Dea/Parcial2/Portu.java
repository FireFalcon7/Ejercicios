import java.util.Queue;
import java.util.Stack;

public class Portu {
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
        nasak = (Stack<String>[]) new Stack[nasaKop];
        for(int i=0;i< nasaKop; i++){nasak[i] = new Stack<String>();}
        while(!ontziak.isEmpty()){
            if(ontziak.peek().mota == 0){
                int kontadore = 0;
                while (!ontziak.peek().eskaerak.isEmpty()&&kontadore<maxEskaera) {
                    int nasaKarga = ontziak.peek().eskaerak.peek().nasa;
                    nasak[nasaKarga].push(ontziak.peek().eskaerak.remove().kontainerKode);
                    kontadore++;
                }
                if (!ontziak.peek().eskaerak.isEmpty()) {
                    ontziak.add(ontziak.remove());
                }else{
                    ontziak.remove();
                }
            }else{
                while (!ontziak.peek().eskaerak.isEmpty()){
                    int nasaKarga = ontziak.peek().eskaerak.peek().nasa;
                    while (!nasak[nasaKarga].isEmpty()&&!(ontziak.peek().eskaerak.peek().kontainerKode.equals(nasak[nasaKarga].peek()))) {
                        nasak[0].push(nasak[nasaKarga].pop());
                    }
                    if(!nasak[nasaKarga].isEmpty()){
                        nasak[nasaKarga].pop();
                    }
                    ontziak.peek().eskaerak.remove();
                    while (!nasak[0].isEmpty()){
                        nasak[nasaKarga].push(nasak[0].pop());
                    }
                }
                ontziak.remove();
            }
        }
    }
    //Aurre: maxEskaera deskargako ontzi batek txanda batean kudeatu ditzakeen
    //eskaera kopurua da (>=1)
    //Aurre: nasaKop portuaren nasa kopurua da (>=2). 0. nasa berezia da.
    //Post: portuaren jarduera simulatu da, ontzien eskaerak betez.
    //Nasak sortu...
    //Portuaren jarduera simulatu...
    
}
