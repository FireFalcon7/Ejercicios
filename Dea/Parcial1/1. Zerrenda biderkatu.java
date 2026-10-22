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
        Node current = first;
        Node hasierakoNodoa = current;
        boolean amataitu = true;
        while (amataitu) {
            for(int i=0; i<n ;i++){
                
            }
        }
    }
}