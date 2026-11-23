public class g_DoubleCircularLinkedList<T> {
    public class DoubleNode<T> {
        T data;
        DoubleNode<T> prev;
        DoubleNode<T> next;
    }
    DoubleNode<String> first;
    public void sekuentziakFusionatu(String[] s){
        DoubleNode<String> current = first;

        boolean amaiera = false;
        int i = 0;
        while (!amaiera) {
            if(current.data.compareTo(s[i])<=0){
                DoubleNode<String> berria = new DoubleNode<>();
                if(current.equals(first)){
                    first = berria;
                }
                berria.data = s[i];
                berria.prev = current.prev;
                berria.next = current;
                current.prev.next = berria;
                current.prev= berria;
                if(s.length>i){
                    i++;
                }
            }else if (current.next.equals(first)) {
                if (current.data.compareTo(s[i])>=0) {
                    DoubleNode<String> berria = new DoubleNode<>();
                    berria.data = s[i];
                    berria.prev = current;
                    berria.next = current.next;
                    current.next.prev = berria;
                    current.next= berria;
                    if(s.length>i){
                        i++;
                    }
                }else{
                    amaiera = true;
                }
            }else{
                current = current.next;
            }
        }
    }
}