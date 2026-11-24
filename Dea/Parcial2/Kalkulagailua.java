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
            zatitua.add(esp.substring(i, i+1));
        }
        for (String orain : zatitua) {
            if (orain.equals("(")) {
                //ez egin ezer
            } else if (orain.equals("+") || orain.equals("-") || orain.equals("*") || orain.equals("/")) {
                eragileak.push(orain);
            } else if (orain.equals(")")) {
                String eragilea = eragileak.pop();
                double balio2 = balioak.pop();
                double balio1 = balioak.pop();
                if (eragilea.equals("+")) {
                    balioak.push(balio1 + balio2);
                } else if (eragilea.equals("-")) {
                    balioak.push(balio1 - balio2);
                } else if (eragilea.equals("*")) {
                    balioak.push(balio1 * balio2);
                } else if (eragilea.equals("/")) {
                    balioak.push(balio1 / balio2);
                }
            } else {
                balioak.push(parse(orain));
            }
        }
        return balioak.pop();
    }
    public Double parse(String s) {
        return Double.parseDouble(s);
    }
}