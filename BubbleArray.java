/**
 * Created by Rost on 21.10.2016.
 */
//import com.sun.deploy.util.ArrayUtil;
//Bubble method

import java.util.Arrays;

public class BubbleArray {
    public static void main(String[] args) {
        int[] a1 = {0, 2, 2};
        int[] a2 = {1, 3};
        int[] a3 = new int[a1.length + a2.length];
        System.arraycopy(a1, 0, a3, 0, a1.length);
        System.arraycopy(a2, 0, a3, a1.length, a2.length);
        //Arrays.sort(a3);
        for (int i=a3.length-1;i>0;i--){ //Зменьшуєму довжину массиву зовнішнім циклом
            for(int j = 0 ; j < i ; j++){ //Внутрішнім циклом ставимо найбільший елемент в кінець масиву
                if( a3[j] > a3[j+1] ) { // Зрівнюємо попарно найбільший елемент та ставимо його за наймаеньший
                    int tmp = a3[j];  //tmp це тимчасова змінна для збереження раезультату якщо а3[j] дісно більше
                    a3[j] = a3[j + 1];
                    a3[j + 1] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(a3));
    }
}
