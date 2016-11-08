/**
 * Created by Rost on 08.11.2016.
 */
import java.util.*;
import java.lang.*;
import java.io.*;

public class StringFormat {
    public static void main(String[] args) {
        String[] roles = {"Городничий","Аммос Федорович", "Артемий Филиппович","Лука Лукич"};

        String[] textLines = {"Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.",
        "Аммос Федорович: Как ревизор?","Артемий Филиппович: Как ревизор?","Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.",
        "Аммос Федорович: Вот те на!","Артемий Филиппович: Вот не было заботы, так подай!","Лука Лукич: Господи боже! еще и с секретным предписаньем!"};

        for (int i = 0; i < roles.length; i++){ // Create loop for roles length
            System.out.println(roles[i] + ":"); // Print all roles with ":" symbol
                for (int j = 0; j < textLines.length; j++){ //Another one loop for textlines
                    if (textLines[j].startsWith(roles[i])){ //If text lines strats with role described in roles array true...
                        System.out.println((j+1)+") " +textLines[j].substring(roles[i].length()+2)); //...than print on display number of the line and tet line of specific role, without role and ":" symbol
                    }
                }

        }


    }
}
