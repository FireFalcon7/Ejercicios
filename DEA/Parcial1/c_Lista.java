public class c_Lista {
    protected class Node<T>{
      String data;
      Node<T> next;
      Node<T> prev;
    }
    protected Node first;

    public void biderkatu(int n){
        Node current = first;
        Node azkena = first;
        Node lehena = first;
        boolean hasi = true;
        while (hasi|| current!= lehena){
            hasi= false;
            for (int i = 0; i<n-1;i++){
                Node berria = new Node();
                berria.data = current.data;
                berria.prev = azkena;
                berria.next = azkena.next;
                azkena.next.prev= berria;
                azkena.next=berria;
            }
            current= azkena.next;
        }
    }
}
//0(n*m)