public class Lista<T> {
    Node<T> first;
    protected class Node<T> {
        String data;
        Node<T> next;
        Node<T> prev;
        public Node(String data){
            this.data = data;
        }
    }
    public void biderkatu(Integer n) {
        // aurre: n >= 1
        // post: zerrenda aldatu da, eta hasierako zerrendako elementu
        // bakoitza n aldiz dau
        Node current = first;
        Node hasierakoNodoa = current;
        boolean amataitu = true;
        while (amataitu) {
            for(int i=0; i<n ;i++){
                Node temp = new Node(current.data);
                temp.prev = current;
                temp.next = current.next;
                current.next.prev = temp;
                current.next=temp;
                current= current.next;
            }
            if(current.next.data == hasierakoNodoa.data){
                amataitu = false;
            }
        }
    }
}