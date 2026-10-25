public class Ezabatu_azpilista {
    protected  class DoubleNode<T> {
        T data;
        DoubleNode<T> next;
        DoubleNode<T> prev;
        
    }
        DoubleNode first;
    public void ezabatuLista(Ezabatu_azpilista azpilista){
        DoubleNode currentAzpi = azpilista.first;
        DoubleNode current = first;
        DoubleNode hasiera = current;
        boolean amaiera = false;
        while(!amaiera){
            if((first.equals(currentAzpi))){
                first = first.next;
                current.next.prev = current.prev;
                current.prev.next = current.next;
                current = current.next;
                currentAzpi = currentAzpi.next;
            }else if(current.equals(currentAzpi)){
                current.next.prev = current.prev;
                current.prev.next = current.next;
                current = current.next;
                currentAzpi = currentAzpi.next;
            }else if(current.next.equals(hasiera)){
                amaiera = true;
            }else{
               current = current.next; 
            }
        }

    // Aurrebaldintza: “azpilista” uneko listaren zati bat da
    // “azpilista” zerrendako elementuak ordena berean daude lista nagusian
    // Postbaldintza: “azpilista” osoa kendu egin da zerrendatik
    }
}
