import java.util.Stack;;
public class Jokoa {
    protected class Bloke {
     int puntuak;
     int jauzia; // 0 eta 6 arteko balioa
     String norabidea; // ‘l’ -> ezkerra, ‘r’ -> eskuina
    }
    Stack<Bloke>[] taula; // pilen array-a
    public static int ZUTABEKOP = 7;
    public Jokoa() { // eraikitzailea
        taula = (Stack<Bloke>[]) new Stack[ZUTABEKOP];
        for (int i = 0; i <= ZUTABEKOP - 1; i++) {
        taula[i] = new Stack<Bloke>();
        }
    }
    // blokeen pilak ausaz betetzeko kodea
    protected int jokatu() {
        int punteroa = ZUTABEKOP / 2;
        int puntuKontadore = 0;
        boolean amaitu = false;

        while (punteroa >= 0 && punteroa < ZUTABEKOP && !amaitu) {
            if (taula[punteroa].isEmpty()) {
                amaitu = true;
            } else {
                Bloke b = taula[punteroa].pop();
                puntuKontadore = puntuKontadore + b.puntuak;
                if ("l".equals(b.norabidea)) {
                    punteroa = punteroa - b.jauzia;
                } else {
                    punteroa = punteroa + b.jauzia;
                }
            }
        }

        if (!amaitu) { // Ezin izan da amaitu zutabeetatik kanpo erori delako
            return -1;
        } else {
            return puntuKontadore;
        }
    }
 }