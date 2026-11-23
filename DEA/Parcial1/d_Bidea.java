
import java.util.ArrayList;

public class d_Bidea {
    Node first;
    protected class Node<T>{
        String koord;
        Node<T> next;
        Node<T> left;
        Node<T> right;
    }
    protected class CircularLinkedList<T>{
        NodeCircularLinkedList<T> last;
        public void gehitu(T data) {
            NodeCircularLinkedList<T> newNode = new NodeCircularLinkedList<>();
            newNode.data = data;

            if (last == null) {
                last = newNode;
                last.next = last; // Apunta a sí mismo cerrando el círculo
            } else {
                newNode.next = last.next;
                last.next = newNode;
                last = newNode; // Actualizamos la referencia al último nodo
            }
        }
    }
    protected class NodeCircularLinkedList<T>{
        T data;
        NodeCircularLinkedList<T> next;
    }
    public CircularLinkedList<String> lortuKoordenatuak(ArrayList<String> ekintzak){
        Node current = first;
        CircularLinkedList<String> emaitza= new CircularLinkedList<>();
        emaitza.gehitu(current.koord);
        for(String s:ekintzak){
            if (s.equals("ezkerra")){
                current= current.left;
            }
            else if (s.equals("eskuma")) {
                current= current.right;
            }
            else if(s.equals("aurrera")){
                current= current.next;
            }
            emaitza.gehitu(current.koord);
        }
        return emaitza;
    }
}
