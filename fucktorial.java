/**
 * Created by Rost on 20.10.2016.
 */
import java.math.*;

public class fucktorial {
    public static void main(String[] args) {
        int fuck = 6;
        BigInteger a = BigInteger.ONE;
        for (int i=1; i<=fuck; i++) a = a.multiply(BigInteger.valueOf(i));
        System.out.println(a);
    }
}
