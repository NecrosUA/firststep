/**
 * Created by Ростислав on 19.10.2016.
 */
import java.lang.StringBuilder;
import java.lang.String;

public class polindrome {
    public static void main(String[] args) {
        String txt = "ded";
        String text = "DE_d&  ..";
        String rep = text.replaceAll("[^a-zA-Z0-9]","");
        String rev = new StringBuilder(rep).reverse().toString();
        String low = rev.toLowerCase();
        if (txt.equals(low)){
            System.out.println(txt+ " Дане слово поліндром!");
        }
        else{
            System.out.println("Слово " +txt+ " не є поліндромом!");
        }

    }
}
