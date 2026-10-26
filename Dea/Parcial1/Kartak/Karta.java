package Kartak;

public class Karta {
    private String palo; // urrea, kopa, ezpata, bastoia
    private int balioa; // 1 eta 10 arteko balioa
    public Karta(){

    }
    public Karta(String palo,int balioa){
        this.palo = palo;
        this.balioa =balioa;
    }
    public String getPalo() {
        return palo;
    }
    public int getBalioa() {
        return balioa;
    }
    public void setPalo(String palo) {
        this.palo = palo;
    }
    public void setBalioa(int balioa) {
        this.balioa = balioa;
    }
} 

