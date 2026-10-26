public class DoubleLinkedListe {
    public class PertsonenZerrenda {
     String[] pertsonak;
     String[][] erosketak;
    }
    public class Node {
    String data;
    Node next;
    }
    public class DoubleNode {
    String data;
    DoubleNode prev;
    DoubleNode next;
    Node erosketak; // Zerrenda zirkularra
    }
    // Bi norabideko esteka, zerrenda ez zirkularra
    DoubleNode first;
    public void zerrendaLortu(PertsonenZerrenda l){
    // Aurre:
    int i =0;
    int j =0;
    DoubleNode currentPertsona = first;
    Node currentErosketa = currentPertsona.erosketak;
    boolean amaitu = false;
    while (!amaitu) {
        currentPertsona.data= l.pertsonak[i];
        if ()
    }
    // Post: l-ko balioekin zerrenda sortu da.
    // Zerrenda estekadura bikoitzekoa da, ez zirkularra
    // Pertsona bakoitzak bere erosketen zerrenda zirkularra izango du
    }
}
