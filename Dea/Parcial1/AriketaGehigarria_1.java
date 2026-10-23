//Enuntziatua
public class DoubleNode<T> {
 T data;
 DoubleNode<T> next;
 DoubleNode<T> prev;
}
public class DoubleLinkedList<T> { //0(n+m), izan ere n aldiz egingo du lehenengo begizta, 2 elementu geratu arte, eta gero m aldiz egingo du hurrengoa, elem 1 geratu arte
 DoubleNode<T> first;
 //a
 public T azkenaLortu(int jauzia){
     // aurre: listak gutxienez elementu bat du
    // post: elementu bakarreko lista bueltatuko du, zerrendatik pausu
    // bakoitzean elementu bat kenduz, unekotik jauzi elementu pasatuz
    // (erlojuko orratzen norabidean) elementu bakarra g
    DoubleNode<T> unekoa=first;
    DoubleNode<T> aurrekoa= first.prev;
    int i=jauzia;
    while(unekoa.next!=first){
        if(jauzia>0){
            aurrekoa= unekoa;
            unekoa= unekoa.next;
            i--;
        }else{
            if(unekoa.equals(first)){
                first=aurrekoa;
            }
            aurrekoa= unekoa.next;
            unekoa.next.prev=aurrekoa;
            i=jauzia;

        }
    }
    while{jauzia<0}{
        aurrekoa=unekoa;
        unekoa=unekoa.next;
    }
    first=aurrekoa;
    aurrekoa.next=null;
    aurrekoa.prev=null;
    return aurrekoa.data

 }