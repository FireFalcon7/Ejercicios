package i_Bilara;


public class i_Bilara<T>{
    protected class DoubleNode<T>{
            T data;
            DoubleNode<T> next;
            DoubleNode<T> prev;
    }
    private DoubleNode<T> first;
    private DoubleNode<T> last;

    // Eraikitzailea: bilara hasieratzen du (hutsa)[cite: 7]
    public i_Bilara() {
        this.first = null;
        this.last = null;
    }

    // True B hutsa baldin bada eta false bestela[cite: 7]
    public boolean hutsaDa() {
        return this.first == null;
    }

    // E elementua ezkerretik gehitu dio[cite: 7]
    public void txertatuEzk(T elemento) {
        DoubleNode<T> newNode = new DoubleNode<>();
        newNode.data = elemento;
        if (hutsaDa()) {
            first = newNode;
            last = newNode;
        } else {
            newNode.next = first;
            first.prev = newNode;
            first = newNode;
        }
    }

    // E elementua eskuinetik gehitu dio[cite: 7]
    public void txertatuEsk(T elemento) {
        DoubleNode<T> newNode = new DoubleNode<>();
        newNode.data = elemento;
        if (hutsaDa()) {
            first = newNode;
            last = newNode;
        } else {
            newNode.prev = last;
            last.next = newNode;
            last = newNode;
        }
    }

    // Ezkerrean dagoen elementua ezabatu du[cite: 7]
    public void ezabatuEzk() {
        if (!hutsaDa()) {
            first = first.next;
            if (first == null) {
                last = null; // Si era el único elemento, la lista se queda vacía
            } else {
                first.prev = null;
            }
        }
    }

    // Eskuinean dagoen elementua ezabatu du[cite: 7]
    public void ezabatuEsk() {
        if (!hutsaDa()) {
            last = last.prev;
            if (last == null) {
                first = null; // Si era el único elemento, la lista se queda vacía
            } else {
                last.next = null;
            }
        }
    }

    // Ezkerrean dagoen elementua bueltatzen du[cite: 7]
    public T lortuEzk() {
        if (hutsaDa()) {
            return null;
        }
        return first.data;
    }

    // Eskuinean dagoen elementua bueltatzen du[cite: 7]
    public T lortuEsk() {
        if (hutsaDa()) {
            return null;
        }
        return last.data;
    }
}
