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
    public void portuaSimulatu(Queue<Ontzia> ontziak, int maxEskaera, int nasaKop) {
        nasak = (Stack<String>[]) new Stack[nasaKop];
        for (int i = 0; i < nasaKop; i++) { nasak[i] = new Stack<String>();} //hasieratu
        while (!ontziak.isEmpty()) {
            Ontzia ontzia = ontziak.remove();
            if (ontzia.mota == 0) {
                int kop = 0;
                while (kop < maxEskaera && !ontzia.eskaerak.isEmpty()) {
                    Eskaera eskaera = ontzia.eskaerak.remove();
                    nasak[eskaera.nasa].push(eskaera.kontainerKode);
                    kop++;
                }
                if (!ontzia.eskaerak.isEmpty()) { // Eskaerak geratzen bazaizkio, beste txanda baten zain geratu.
                    ontziak.add(ontzia);
                }
            } else {
                while (!ontzia.eskaerak.isEmpty()) { // Kargako ontziak eskaera guztiak betetzen ditu txanda berean.
                    Eskaera eskaera = ontzia.eskaerak.peek();
                    Stack<String> nasa = nasak[eskaera.nasa];
                    while (!nasa.isEmpty()&& !eskaera.kontainerKode.equals(nasa.peek())) { // Bilatutako kontainerraren gainekoak 0. nasara eraman.
                        nasak[0].push(nasa.pop());
                    }
                    boolean aurkitua = !nasa.isEmpty();
                    if (aurkitua) { nasa.pop(); }
                    while (!nasak[0].isEmpty()) { // Gainerako kontainerrak jatorrizko ordenan.
                        nasa.push(nasak[0].pop());
                    }
                    if (!aurkitua) { System.out.println("Kontainerra ez dago adierazitako nasan!");}
                    ontzia.eskaerak.remove();
                }
            }
        }
    }
}