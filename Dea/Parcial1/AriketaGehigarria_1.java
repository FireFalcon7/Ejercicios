//Enuntziatua
public class DoubleNode<T> {
 T data;
 DoubleNode<T> next;
 DoubleNode<T> prev;
}
public class DoubleLinkedList<T> {
 DoubleNode<T> first;
 public T azkenaLortu(int jauzia){
    int i = 0;
    while (i<jauzia){
        first.prev.next = first.next;
        first.next.prev = first.prev;
        first= first.prev;
        i++;
    }
 }
 // aurre: listak gutxienez elementu bat du
 // post: elementu bakarreko lista bueltatuko du, zerrendatik pausu
 // bakoitzean elementu bat kenduz, unekotik jauzi elementu pasatuz
 // (erlojuko orratzen norabidean) elementu bakarra g
}
