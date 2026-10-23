//enuntziatua
public class Node {
    int balioa;
    int errenkada;
    int zutabea;
    Node<T> next;
}
public class Matrize {
    Node first;
    public Matrize batura(Matrize m1, Matrize m2) {
        // aurre:
        // post: emaitza m1 eta m2 matrizeen batura da
        Matrize batura= new Matrize();
        Node oraingoa= batura.first;
        mat1=m1.first;
        mat2=m2.first;
        while(mat1.next!=null || mat2.next!= null){
            Node elementua= new Node();
            if((mat1.errenkada==mat2.errenkada)&&(mat2.zutabea==mat1.zutabea)){//guztiak berdinak
                elementua.balioa= mat1.balioa+mat2.balioa;
                elementua.zutabea= mat1.zutabea;
                elementua.errenkada=mat1.errenkada;
                if(batura.first==null){
                    first=elementua;
                    oraingoa=elementua;
                }else{
                    oraingoa.next=elementua;
                }
                mat1=mat1.next;
                mat2=mat2.next;

            }else if((mat1.errenkada<mat2.errenkada)&&(mat1.zutabea<mat2.zutabea)){//1. matrizeko elementua fila berdinean baina zutabe atzeragoan
                elementua.balioa= mat1.balioa;
                elementua.zutabea= mat1.zutabea;
                elementua.errenkada=mat1.errenkada;
                 if(batura.first==null){
                    first=elementua;
                    oraingoa=elementua;
                }else{
                    oraingoa.next=elementua;
                }
                mat1=mat1.next;
            }else if((mat1.errenkada>mat2.errenkada)&&(mat1.zutabea>mat2.zutabea)){
                 elementua.balioa= mat2.balioa;
                elementua.zutabea= mat2.zutabea;
                elementua.errenkada=mat2.errenkada;
                 if(batura.first==null){
                    first=elementua;
                    oraingoa=elementua;
                }else{
                    oraingoa.next=elementua;
                }
                mat2=mat2.next;
            }
        }
        return batura;
    }
}

