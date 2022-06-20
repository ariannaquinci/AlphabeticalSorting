package main;



public class AlphabeticSorting {
    private AlphabeticSorting(){
        //private constructor to hyde the default one
    }
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


}}

