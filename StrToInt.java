/**
 * Created by Rost on 27.10.2016.
 */
import java.util.*;
import java.io.*;
import java.math.*;
import java.util.stream.Stream;


public class StrToInt {
    public static void main(String[] args) {
        String temps = "2 -3 15 10 8";

        int[] array = Stream.of(temps.split(" ")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(array);



        System.out.println(Arrays.toString(array));
    }
}
