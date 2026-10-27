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
        Node mat1=m1.first;
        Node mat2=m2.first;
        while(mat1!=null && mat2!= null){
            if((mat1.errenkada==mat2.errenkada)&&(mat2.zutabea==mat1.zutabea)){//guztiak berdinak
                if(mat1.balioa+mat2.balioa!=0){
                Node elementua= new Node();
                elementua.balioa= mat1.balioa+mat2.balioa;
                elementua.zutabea= mat1.zutabea;
                elementua.errenkada=mat1.errenkada;
                if(batura.first==null){
                    batura.first=elementua;
                    oraingoa=elementua;
                }else{
                    oraingoa.next=elementua;
                }
                }
                mat1=mat1.next;
                mat2=mat2.next;
                

            }else if((mat1.errenkada==mat2.errenkada)&&(mat1.zutabea<mat2.zutabea)){//1. matrizeko elementua fila berdinean baina zutabe atzeragoan
                Node elementua= new Node();
                elementua.balioa= mat1.balioa;
                elementua.zutabea= mat1.zutabea;
                elementua.errenkada=mat1.errenkada;
                 if(batura.first==null){
                    batura.first=elementua;
                    oraingoa=elementua;
                }else{
                    oraingoa.next=elementua;
                }
                mat1=mat1.next;
            }else if((mat1.errenkada==mat2.errenkada)&&(mat1.zutabea>mat2.zutabea)){
                Node elementua= new Node();
                elementua.balioa= mat2.balioa;
                elementua.zutabea= mat2.zutabea;
                elementua.errenkada=mat2.errenkada;
                 if(batura.first==null){
                    batura.first=elementua;
                    oraingoa=elementua;
                }else{
                    oraingoa.next=elementua;
                    oraingoa=elementua;
                }
                mat2=mat2.next;
            }else if(mat1.errenkada<mat2.errenkada){
                Node elementua= new Node();
                elementua.balioa= mat1.balioa;
                elementua.zutabea= mat1.zutabea;
                elementua.errenkada=mat1.errenkada;
                 if(batura.first==null){
                    batura.first=elementua;
                    oraingoa=elementua;
                }else{
                    oraingoa.next=elementua;
                    oraingoa=elementua;
                }
                mat1=mat1.next;
            }else if(mat2.errenkada< mat1.errenkada){
                Node elementua= new Node();
                elementua.balioa= mat2.balioa;
                elementua.zutabea= mat2.zutabea;
                elementua.errenkada=mat2.errenkada;
                 if(batura.first==null){
                    batura.first=elementua;
                    oraingoa=elementua;
                }else{
                    oraingoa.next=elementua;
                    oraingoa=elementua;
                }
                mat2=mat2.next;
            }
        }
        if(mat1!=null){
            while(mat1!=null){
                Node elementua= new Node();
                elementua.balioa= mat1.balioa;
                elementua.zutabea= mat1.zutabea;
                elementua.errenkada=mat1.errenkada;
                 if(batura.first==null){
                    batura.first=elementua;
                    oraingoa=elementua;
                }else{
                    oraingoa.next=elementua;
                    oraingoa=elementua;
                }
                mat1=mat1.next;
            }
        }else{
            while(mat2!=null){
                Node elementua= new Node();
                elementua.balioa= mat2.balioa;
                elementua.zutabea= mat2.zutabea;
                elementua.errenkada=mat2.errenkada;
                 if(batura.first==null){
                    batura.first=elementua;
                    oraingoa=elementua;
                }else{
                    oraingoa.next=elementua;
                    oraingoa=elementua;
                }
                mat2=mat2.next;   
            }
        }
        return batura;
    }
}//kostua: O(n+m), non n m1-en elementuak dira eta m m2-k dituen elementu diferentzia(edo aldrebes). adibidez m1 5 ditu eta m2 7, n=5 eta m=2 izango dira

