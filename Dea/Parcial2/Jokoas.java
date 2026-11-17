import java.util.Stack;

public class Jokoas {
    protected class Bloke {
        int puntuak;
        int jauzia; // 0 eta 6 arteko balioa
        String norabidea; // ‘l’ -> ezkerra, ‘r’ -> eskuina
    }
    Stack<Bloke>[] taula; // pilen array-a
    public static int ZUTABEKOP = 7;
    public Jokoas() { // eraikitzailea
        taula = (Stack<Bloke>[]) new Stack[ZUTABEKOP];
        for (int i = 0; i <= ZUTABEKOP - 1; i++) {
        taula[i] = new Stack<Bloke>();
        }
    }

    public int jokatu() {
        int punteroa = ZUTABEKOP / 2;
        int puntuKontadore = 0;
        boolean amaitu = false;
        while (punteroa >= 0 && punteroa < ZUTABEKOP && !amaitu){
            if (taula[punteroa].isEmpty()) {
                amaitu = true;
            }
            Bloke blokeOrain = taula[punteroa].pop();
            puntuKontadore= puntuKontadore + blokeOrain.puntuak;
            if(blokeOrain.norabidea.equals("l")){
                punteroa = punteroa - blokeOrain.jauzia;
            }else{
                punteroa = punteroa + blokeOrain.jauzia;
            }
        }
        if(!amaitu){
            return -1;
        }else{
            return puntuKontadore;
        }
    }
 // Aurre: jokoa hasieratua izan da (hasierako blokeak sortu dira)
 // Post: partida bat jokatu da. Bola erdiko zutabean hasten da.
 // Emaitza lortutako puntu-kopurua izango da, jokoa gainditu
 // baldin bada, eta -1 bestela
} 
