package Kartak;

public class KartaSorta {
    private Karta[] kartak = new Array();
    public KartaSorta (){

    } // eraikitzailea
    // post: 40 karta daude ausaz
    public Iterator<Karta> iteradore(){

    }
    // kartak aztertzeko iteradorea bueltatzen du
    public Karta[] getKartak() {
        return kartak;
    }
    public void setKartak(Karta[] kartak) {
        this.kartak = kartak;
    }
} 
