/**
 * Created by Rost on 21.10.2016.
 */
//import com.sun.deploy.util.ArrayUtil;
import java.util.Arrays;

public class StepikArray {
    public static void main(String[] args) {
        int[] a1 = {0, 2, 2};
        int[] a2 = {1, 3};
        int[] a3 = new int[a1.length + a2.length];
        System.arraycopy(a1, 0, a3, 0, a1.length);
        System.arraycopy(a2, 0, a3, a1.length, a2.length);
        for (int i = 0; i < a3.length; i++) {

            int min = a3[i];
            int imin = i; 

            for (int j = i + 1; j < a3.length; j++) {

                if (a3[j] < min) {
                    min = a3[j];
                    imin = j;
                }
            }

            if (i != imin) {
                int temp = a3[i];
                a3[i] = a3[imin];
                a3[imin] = temp;
            }
        }
        System.out.println(Arrays.toString(a3));
    }
}
