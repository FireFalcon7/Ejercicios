public class Matrize {
    protected  class Node {
    int balioa;
    int errenkada;
    int zutabea;
    Node next;
    }
    Node first;
    public Matrize batura(Matrize m1, Matrize m2) {
        // aurre:
        // post: emaitza m1 eta m2 matrizeen batura da
        Matrize batura = new Matrize();
        Node currentBatura = batura.first;
        Node currentM1 =m1.first;
        Node currentM2 =m2.first;
        while(currentM1.next != null && currentM2.next != null){
            if((currentM1.zutabea < currentM2.zutabea && currentM1.errenkada == currentM2.errenkada)||currentM1.errenkada < currentM2.errenkada){
                currentBatura.balioa =currentM1.balioa;
                currentBatura.errenkada = currentM1.errenkada;
                currentBatura.zutabea =  currentM1.zutabea;
                currentM1 = currentM1.next;
                currentBatura = currentBatura.next;
            }else if((currentM1.zutabea > currentM2.zutabea && currentM1.errenkada == currentM2.errenkada)||currentM1.errenkada > currentM2.errenkada){
                currentBatura.balioa =currentM2.balioa;
                currentBatura.errenkada = currentM2.errenkada;
                currentBatura.zutabea =  currentM2.zutabea;
                currentM2 = currentM2.next;
                currentBatura = currentBatura.next;
            }else if(currentM1.zutabea == currentM2.zutabea && currentM1.errenkada == currentM2.errenkada){
                currentBatura.balioa =currentM1.balioa+currentM2.balioa;
                currentBatura.errenkada = currentM1.errenkada;
                currentBatura.zutabea =  currentM1.zutabea;
                currentM1 = currentM1.next;
                currentM2 = currentM2.next;
                currentBatura = currentBatura.next;
            }
        }
        return batura;
    }
}
