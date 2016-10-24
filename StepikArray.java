/**
 * Wrong! Need to fix.
 */
import java.lang.Object;

public class StepikArray {
    public static void main(String[] args) {
        int[] a1 = {0, 2, 2};
        int[] a2 = {1, 3};
        int[] a3 = new int[a1.length+ a2.length];
        for (int n=0; n<=a2.length;n++){
            if (a1[n] < a2[n]){
                a3[n] = a1[n];
            }
            else {
                a3[n] = a2[n];
            }
        }
        System.out.println(a3); // your implementation here
        }
}

