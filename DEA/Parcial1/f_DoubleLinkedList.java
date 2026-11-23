import java.util.ArrayList;

public class f_DoubleLinkedList<T>{
    protected class DoubleNode<T> {
        T data;
        DoubleNode<T> next;
        DoubleNode<T> prev;
    }
    DoubleNode<T> first;
    public void gehitu(T elem, ArrayList<T> berriak){
        DoubleNode<T> current = first;
        while (current.data!=elem){
            current=current.next;
        }
        for (T elentu: berriak){
            DoubleNode<T> berria = new DoubleNode<T>();
            berria.data=  elentu;
            berria.prev= current;
            berria.next= current.next;
            current.next.prev = berria;
            current.next = berria;
            current = current.next;
        }
    }
}
