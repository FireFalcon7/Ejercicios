import java.io.FileNotFoundException;
import java.util.Stack;

public class i_eragiketak {
    public static void main(String[] args) throws FileNotFoundException {
       System.out.println(ebaluatu("(1+((2+3)*(4*5)))"));
    }
    public static double ebaluatu(String esp){
        Stack<Double> zenbakiak = new Stack<>();
        Stack<Character> eragile = new Stack<>();
        for(int i = 0; i < esp.length();i++) {
            char c = esp.charAt(i);
            if (c<='9' && c >='0'){
                zenbakiak.push((double)c - '0');
            } else if (c == '(') {}
            else if (c==')') {
                Double emaitza =0.0;
                    char era = eragile.pop();
                    Double znbk1 = zenbakiak.pop();
                    Double znbk2 = zenbakiak.pop();
                    if (era == '+'){
                        emaitza = znbk1 + znbk2;
                    }
                    else if(era == '*'){
                        emaitza = znbk1 * znbk2;
                    }
                    else if(era == '-'){
                        emaitza = znbk2 - znbk1;
                    } else if (era == '/') {
                        emaitza = znbk2 /znbk1;
                    }
                zenbakiak.push(emaitza);
            }
            else{
                eragile.push(c);
            }
        }
        return zenbakiak.pop();
    }
// Aurrebaldintza: Espresio aritmetikoa zuzena da.
    // Adierazpena GUZTIZ parentizatuta dago, hau da,
    // Eragile bakoitzeko, parentesiak daude
    // Eragile guztiak bitarrak dira (“X ERAGILE Y” motakoak)
    // Postbaldintza: emaitza adier
}
