import java.util.LinkedList;
import java.util.Queue;;
public class Cafeteria {
    Queue<Queue<Integer>> ilara = null; // una cola de colas
    public void txertatu(Integer elem) {
        // Post: elem kafetegiko ilaran gehitu da
        if (ilara == null) ilara = new LinkedList<Queue<Integer>>();
        boolean kokatuta = false;
        int taldeKopurua = ilara.size();
        for (int i = 0; i < taldeKopurua; i++) {
            Queue<Integer> taldea = ilara.remove();
            if (!kokatuta && taldeBera(taldea.peek(), elem)) {
                taldea.add(elem); // bere taldearen amaieran
                kokatuta = true;
            }
            ilara.add(taldea); // taldea ilarara itzultzen da
        }
        if (!kokatuta) { // bere taldekorik ez: ilararen amaieran
            Queue<Integer> berria = new LinkedList<Integer>();
            berria.add(elem);
            ilara.add(berria);
        }
        }
    // Postcondición: se ha añadido “elem” en la cola de la cafetería
    public Integer ezabatu() {
        Queue<Integer> lehenTaldea = ilara.peek();
        Integer x = lehenTaldea.remove();
        if (lehenTaldea.isEmpty())
            ilara.remove(); // ez da talde hutsik gertauko ilaran
        return x;
    }
    // Precondición: gutxienez pertsona bat dago ilaran
    // Postbaldintza: ilarako lehen elementua kendu da eta bere balioa bueltatu da
    public boolean taldeBera(int p1, int p2){
        int taldea1 = taldeZenbakia(p1);
        return taldea1 != 0 && taldea1 == taldeZenbakia(p2);
    }

    private int taldeZenbakia(int pertsona) {
        if (pertsona == 1 || pertsona == 5 || pertsona == 7) return 1;
        if (pertsona == 2 || pertsona == 4 || pertsona == 8 || pertsona == 10) return 2;
        if (pertsona == 3 || pertsona == 6 || pertsona == 11) return 3;
        return 0;
    }
    // Postbaldintza: true baldin p1 eta p2 talde berekoak badira eta false bestela

} // Cafeteria