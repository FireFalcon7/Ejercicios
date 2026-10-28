public class e_DoubleLinkedList<T> {
    protected class DoubleNode<T> {
        T data;
        DoubleNode<T> next;
        DoubleNode<T> prev;
    }
    DoubleNode<T> first;
    public void ezabatuLista(e_DoubleLinkedList<T> azpilista){
        DoubleNode<T> lehena = first;
        DoubleNode<T> current= first;
        DoubleNode<T> azpi = azpilista.first;
        do {
            if(azpi.equals(current)){
                if (current == lehena){
                    current.next.prev = current.prev;
                    current.prev.next = current.next;
                    first = first.next;
                    lehena = first.next;
                    current= current.next;
                }
                else{
                    current.next.prev = current.prev;
                    current.prev.next = current.next;
                    current = current.next;
                }
            }
        }
        while (current!=lehena);
    }
}