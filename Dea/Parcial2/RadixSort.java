import java.util.LinkedList;
import java.util.Queue;

public class RadixSort {

    public void ordenatu(int[] a, int digituKop) {
        // Aurre: "a" zenbaki oso positiboen array-a da, eta "digituKop" zenbaki handienaren digitu kopurua
        // Post: "a" txikienetik handienera ordenatuta dago
        Queue<Integer>[] kutxak = (Queue<Integer>[]) new Queue[10];
        for (int i = 0; i < 10; i++) {
            kutxak[i] = new LinkedList<Integer>();
        }
        int digiKopOrain = 1;
        int rest = 1;
        while(digiKopOrain<=digituKop){
            int i = 0;
            for (int orain : a) {
                kutxak[((orain / rest) % 10)].add(orain);
            }
            for (Queue<Integer> queue : kutxak) {
                while (!queue.isEmpty()) {
                    a[i]= queue.remove();
                    i++;
                }
            }
            rest = rest*10;
            digiKopOrain++;
        }
    }
}