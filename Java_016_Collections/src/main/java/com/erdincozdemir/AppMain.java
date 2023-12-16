package com.erdincozdemir;

import java.util.ArrayList;
import java.util.List;

public class AppMain {
    public static void main(String[] args) {
        int sayi = 10;
        int sayi2 = 11;

        int[] sayilar = new int[10];

        List myListe1 = new ArrayList();
        myListe1.add("Erdinç");
        myListe1.add("31");

        List<Long> myliste2 = new ArrayList();  // Corrected variable name
        myliste2.add(100L);

        System.out.println("Liste1 : " + myListe1);
        System.out.println("Liste1 isEmpty : " + !myListe1.isEmpty());
        System.out.println("Liste2 : " + myliste2);  // Corrected variable name*/
        System.out.println("Liste 1 contains Erdinç " + myListe1.contains("Erdinç"));


        myListe1.remove(0);
        myListe1.add(1, "Erdinç");
        myListe1.add(2,"OLMUYOR");
        System.out.println("Liste1 : " + myListe1);

        ArrayList myList3 = new ArrayList<>();
        myList3.add("Özdemir");
        System.out.println(myList3);




    }
}
