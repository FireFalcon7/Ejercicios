package i_Bilara;

import java.util.Iterator;

public class KartaSorta{
    public Karta[] kartak;
    public KartaSorta (){
        this.kartak = new Karta[40];
        Karta berria;
        int znbk= 1;
        for(int i = 0; i<40; i++){
            if(znbk>10){znbk=1;}
            if(i<10){
                berria = new Karta("Oro",znbk);
                kartak[i]= berria;
            }
            else if(i<20){
                berria = new Karta("Basto",znbk);
                kartak[i]= berria;}
            else if(i<30){
                berria = new Karta("Espada",znbk);
                kartak[i]= berria;
            }
            else{
                berria = new Karta("Copa",znbk);
                kartak[i]= berria;
            }
            znbk++;
        }
    } // eraikitzailea
// post: 40 karta daude ausaz
    public Iterator<Karta> iteradore(){
        Iterator<Karta> iteradore = new Iterator<Karta>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                // Comprueba si el índice está dentro del array y la carta no es nula
                return index < kartak.length && kartak[index] != null;
            }

            @Override
            public Karta next() {
                if (!hasNext()) {
                    throw new java.util.NoSuchElementException();
                }
                return kartak[index++];
            }

        };
        return iteradore;
    }
// kartak aztertzeko iteradorea bueltatzen du{
}
