package src;

public class b_Matrize {
    Node first;

    protected class Node<T> {
        Integer balioa;
        Integer errenkada;
        Integer zutabea;
        Node<T> next;

        public Node(){
            this.balioa=null;
            this.errenkada= null;
            this.zutabea= null;
            this.next=null;
        }

        public Node(Integer balioa, Integer errenkada, Integer zutabea, Node next) {
            Node node = new Node();
            node.balioa = balioa;
            node.errenkada=errenkada;
            node.zutabea=zutabea;
            node.next=next;
        }
    }

    public b_Matrize batura(b_Matrize m1, b_Matrize m2){
        b_Matrize emaitza = new b_Matrize();
        Node p1 = m1.first;
        Node p2 = m2.first;
        Node current = null;
        Node berria = null;
        while (p1!=null || p2!=null){
            if(p1.errenkada<p2.errenkada || p1.errenkada.equals(p2.errenkada) && p1.zutabea<p2.zutabea){
                berria = new Node(p1.balioa,p1.errenkada,p2.zutabea,null);
                p1=p1.next;
            }
            else if(p2.errenkada<p1.errenkada || p2.errenkada.equals(p1.errenkada) && p2.zutabea<p1.zutabea){
                berria = new Node(p2.balioa,p2.errenkada,p2.zutabea,null);
                p2=p2.next;
            }
            else{
                int gei = p1.balioa+ p2.balioa;
                if (gei!=0) {
                    berria = new Node(gei, p1.errenkada, p1.zutabea, null);
                }
                p1=p1.next;
                p2=p2.next;
            }
            if (berria!=null){
                if (emaitza.first==null){
                    emaitza.first = berria;
                    current = berria;
                }
                else{
                    current.next=berria;
                    current = current.next;
                }
            }
        }
        return emaitza;
    }
}
