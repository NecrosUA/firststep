/**
 * Created by Rost on 21.10.2016.
 */
//import com.sun.deploy.util.ArrayUtil;
import java.util.Arrays;

public class StepikArray2 {
    public static void main(String[] args) {
        int[] a1 = {0, 2, 2};
        int[] a2 = {1, 3};
        int[] a3 = new int[a1.length + a2.length];
        System.arraycopy(a1, 0, a3, 0, a1.length);
        System.arraycopy(a2, 0, a3, a1.length, a2.length);
        Arrays.sort(a3);
        System.out.println(Arrays.toString(a3));
    }
}
