public class a_DobleLinkedList<T>{
    DoubleNode<T> first;
    protected class DoubleNode<T>{
        T data;
        DoubleNode<T> next;
        DoubleNode<T> prev;
    }
    public T azkenaLortu(Integer jauzia){
        if(first!= null){
            DoubleNode<T> current = first;
            while (current.next!=current){
                for (int i = 0; i<jauzia;i++){
                    current = current.next;
                }
                current.next.prev= current.prev;
                current.prev.next = current.next;
                if(current==first){
                    first=current.next;
                }
                current = current.next;
            }
            return current.data;
        }
        else {return null;}
    }
}

