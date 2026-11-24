import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class LapurrenJokoa {
    Queue<Integer>[] eskuak;
    Stack<Integer>[] puntuPilak;
    Queue<Integer> mahaia;

    public int jokatu(int jokalariKop, Queue<Integer> kartaSorta) {
        // Aurre: jokalariKop >= 2, eta kartaSorta 1..10 arteko zenbakiekin beteta dago
        // Post: kartak banan-banan banatu dira (0tik jokalariKop-1era ziklikoki),
        //       partida jokatu da eta karta gehien irabazi dituen jokalaria bueltatzen da

        eskuak = (Queue<Integer>[]) new Queue[jokalariKop];
        puntuPilak = (Stack<Integer>[]) new Stack[jokalariKop];
        mahaia = new LinkedList<Integer>();
        for (int i = 0; i < jokalariKop; i++) {
            eskuak[i] = new LinkedList<Integer>();
            puntuPilak[i] = new Stack<Integer>();
        }
        banatu(jokalariKop, kartaSorta, eskuak);

        int zerJokalari = 0;
        while (!denakHutsik(eskuak)) {
            if (!eskuak[zerJokalari].isEmpty()) {
                int k = eskuak[zerJokalari].remove();
                int norena = noriLapurtu(puntuPilak, zerJokalari, k);

                if (norena != -1) {
                    while (!puntuPilak[norena].isEmpty()) {
                        puntuPilak[zerJokalari].push(puntuPilak[norena].pop());
                    }
                    puntuPilak[zerJokalari].push(k);
                } else if (!mahaia.isEmpty() && mahaia.peek() == k) {
                    puntuPilak[zerJokalari].push(mahaia.remove());
                    puntuPilak[zerJokalari].push(k);
                } else {
                    mahaia.add(k);
                }
            }
            zerJokalari++;
            if (zerJokalari >= jokalariKop) {
                zerJokalari = 0;
            }
        }

        int irabazlea = 0;
        int maxKartak = puntuPilak[0].size();
        for (int i = 1; i < jokalariKop; i++) {
            if (puntuPilak[i].size() > maxKartak) {
                maxKartak = puntuPilak[i].size();
                irabazlea = i;
            }
        }

        return irabazlea;
    }

    private void banatu(int jokalariKop, Queue<Integer> kartaSorta, Queue<Integer>[] eskuak) {
        int zerJokalari = 0;
        while (!kartaSorta.isEmpty()) {
            eskuak[zerJokalari].add(kartaSorta.remove());
            zerJokalari++;
            if (zerJokalari >= jokalariKop) {
                zerJokalari = 0;
            }
        }
    }

    private boolean denakHutsik(Queue<Integer>[] eskuak) {
        for (Queue<Integer> eskua : eskuak) {
            if (!eskua.isEmpty()) {
                return false;
            }
        }
        return true;
    }

    private int noriLapurtu(Stack<Integer>[] puntuPilak, int unekoJokalari, int k) {
        for (int i = 0; i < puntuPilak.length; i++) {
            if (i != unekoJokalari && !puntuPilak[i].isEmpty() && puntuPilak[i].peek() == k) {
                return i;
            }
        }
        return -1;
    }
}