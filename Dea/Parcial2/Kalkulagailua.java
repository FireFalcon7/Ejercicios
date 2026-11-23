import java.util.Queue;
import java.util.Stack;
import java.util.ArrayList;

public class Kalkulagailua {

    public double ebaluatu(String esp) {
        // Aurre: "espresioa" guztiz parentizatutako espresio aritmetiko zuzena da
        // Post: espresioaren emaitza numerikoa bueltatzen da

        Stack<String> eragileak = new Stack<String>();
        Stack<Double> balioak = new Stack<Double>();
        ArrayList<String> zatitua = new ArrayList<String>();
        int luzera = esp.length();
        for(int i = 0; i< luzera; i++){
            zatitua.add(esp.substring(i, i + 1));
        }
        return -1;
    }
    public Double parse(String s) {
        return Double.parseDouble(s);
    }
}