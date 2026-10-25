import java.util.ArrayList;

public class Gehitu_azpilista<T> {
    protected  class DoubleNode<T> {
        T data;
        DoubleNode<T> next;
        DoubleNode<T> prev;
    }
        DoubleNode<T> first;
    public void ezabatuLista(T elem, ArrayList<T> azpilista){
        DoubleNode<T> current = first;
        while(elem!=current.data){
            current = current.next;
        }
        for(T api: azpilista){
            DoubleNode<T> berria = new DoubleNode();
            berria.data = api;
            berria.next =current.next;
            berria.prev =current;
            current.next.prev = berria;
            current.next = berria;
            current = current.next;
        }
    // Aurrebaldintza: “azpilista” uneko listaren zati bat da
    // “azpilista” zerrendako elementuak ordena berean daude lista nagusian
    // Postbaldintza: “azpilista” osoa kendu egin da zerrendatik
    }
}
