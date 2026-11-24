import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Parque {
    public static final int NUM_TAQUILLAS = 10;
    public static final int NUM_ATRACCIONES = 20;
    public class Evento {
        char tipo; // 'L' (Llegada), 'E' (Entrada) o 'U' (Uso)
        String identificador; // en caso de que el evento sea 'L'
        int taquilla; // en caso de que el evento sea 'L' o 'E'
        int atraccion; // en caso de que el evento sea 'U'
        Queue<Integer> atracciones; // en caso de que el evento sea 'L'
    }

    public class Cliente {
        String identificador;
        Queue<Integer> atracciones;

        public Cliente(String pId, Queue<Integer> pAtracciones) {
            identificador = pId;
            atracciones = pAtracciones;
        }
    }

    public ArrayList<String> simularParque(ArrayList<Evento> listaEventos) {
        // Pre: al comienzo, cada cliente tendrá al menos una atraccion en su lista
        //      y los números de taquilla de los eventos son correctos
        // Post: el resultado es la lista de los clientes que han conseguido montar
        //       en todas las atracciones que habían planificado
        Queue<Cliente>[] taquillas = (Queue<Cliente>[]) new Queue[NUM_TAQUILLAS];
        Queue<Cliente>[] atracciones= (Queue<Cliente>[]) new Queue[NUM_ATRACCIONES];
        ArrayList<String> completado = new ArrayList<String>();
        for(int i = 0; i< NUM_ATRACCIONES; i++){
            atracciones[i] = new LinkedList<Cliente>();
            if (i< NUM_TAQUILLAS) {
                taquillas[i] = new LinkedList<Cliente>();
            }
        }
        
        for (Evento evento : listaEventos) {
            if (evento.tipo == 'L') {
                Cliente entrante = new Cliente(evento.identificador, evento.atracciones);
                taquillas[evento.taquilla].add(entrante);
            } else if(evento.tipo == 'E'){
                if(!taquillas[evento.taquilla].isEmpty()){
                    atracciones[taquillas[evento.taquilla].peek().atracciones.peek()].add(taquillas[evento.taquilla].remove());
                }
            }else{
                while(!atracciones[evento.atraccion].isEmpty()){
                    Cliente cliente = atracciones[evento.atraccion].remove();
                    cliente.atracciones.remove();
                    if(cliente.atracciones.isEmpty()){
                        completado.add(cliente.identificador);
                    }else{
                        atracciones[cliente.atracciones.peek()].add(cliente);
                    }
                }
            }
        }
        return completado;
    }
}