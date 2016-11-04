/**
 * Created by Rost on 02.11.2016.
 */
import java.util.*;
import java.lang.*;

public class StringArray {
    public static void main(String[] args) {
        String filename = ("Probe.PsD.tXT");
        String[] ext = {".txt", ".psd", ".pdf"}; //Array "database" of file extention
        String test = filename.substring(filename.length()-4); // Take 4 last char from filename
        //String[] Split = filename.split("\\."); //Split file between dot"."
        //String part1 = Split[Split.length-1]; //Take last part of array which means file extention
        int count = 0;


        for (int i=0; i<ext.length; i++){
            boolean search = test.toLowerCase().contains(ext[i]); //Searching in "test", extention of file, which containing in "database" array
            if (search==true) { //If this extention is present in "database"....
                System.out.println("File extention is:  " +ext[i]);//...Than show mwssage +show extention of this file
                break; //Stop searching after find true
            }

            else count++; // else count +1

        }


        if (count == ext.length) { //if count = 3 failures...
            System.out.println("Can\'t find in database: " +filename);//Show message that this extenion is not present in databaase
        }
        //System.out.println(part1);
        //System.out.println(Arrays.toString(Split));
    }
}
