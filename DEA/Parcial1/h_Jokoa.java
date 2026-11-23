import java.util.Stack;

public class h_Jokoa {
    protected class Bloke{
        int puntuak;
        int jauzia; // 0 eta 6 arteko balioa
        String norabidea; // ‘l’ -> ezkerra, ‘r’ -> eskuina
    }
    Stack<Bloke>[] taula; // pilen array-a
    public static int ZUTABEKOP = 7;
    public h_Jokoa() { // eraikitzailea
        taula = (Stack<Bloke>[]) new Stack[ZUTABEKOP];
        for (int i = 0; i <= ZUTABEKOP - 1; i++) {
            taula[i] = new Stack<Bloke>();
        }
        // blokeen pilak gausaz betetzeko kodea
    }
    public int jokatu() {
        // Aurre: jokoa hasieratua izan da (hasierako blokeak sortu dira)
        // Post: partida bat jokatu da. Bola erdiko zutabean hasten da.
        // Emaitza lortutako puntu-kopurua izango da, jokoa gainditu
        // baldin bada, eta -1 bestela
        return 1;
    }
    }
