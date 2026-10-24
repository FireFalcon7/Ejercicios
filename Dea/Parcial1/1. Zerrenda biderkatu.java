public class Node<T> {
    String data;
    Node<T> next;
    Node<T> prev;
}
public class Lista<T> {
    Node<T> first;
    public void biderkatu(Integer n) {
        // aurre: n >= 1
        // post: zerrenda aldatu da, eta hasierako zerrendako elementu
        // bakoitza n aldiz dau
      if (first == null || n <= 1) {
        return;
        }
        Node current= first;
        Node azkena= first.prev;
        boolean amaitua= false;
     while(!amaitua){
         if(current==azkena){
            amaitua=true;
        }
        Node hurrengoa= current.next;
      for(int i=n-1; i>0;i--){//nodo baten biderketa
        Node kopia= new Node(current.data);
        kopia.next= hurrengoa;
        kopia.prev=current;
        current.next=kopia;
        hurrengoa.prev=kopia;
        current=kopia;
        }
        current= hurrengoa;
    }
    }
}