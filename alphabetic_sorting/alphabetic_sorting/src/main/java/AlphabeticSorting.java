import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

public class AlphabeticSorting {
    public static void sorting(String[] words){

        String temp;

        for (int i = 0; i < words.length; i++) {


            for (int j = i + 1; j < words.length; j++) {


                if (words[j].toLowerCase().compareTo(words[i].toLowerCase())<0) {

                    temp = words[i];
                   words[i] = words[j];
                    words[j] = temp;
                }
            }

        }
        for(int i=0; i< words.length;i++){
        System.out.println(words[i]);}
}}

