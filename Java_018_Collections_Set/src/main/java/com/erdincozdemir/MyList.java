package com.erdincozdemir;

import java.util.*;

public class MyList {

    public static void main(String[] args) {

        LinkedHashSet<String> sayiList4 = new LinkedHashSet<>();
        TreeSet<String> sayiList3 = new TreeSet<>();
        HashSet sayiList2 = new HashSet();
        ArrayList<Integer> sayiList1 = new ArrayList();

        for (int i = 0; i < 100; i++) {
            sayiList1.add(i);
        }
        System.out.println("Liste1 : "+sayiList1);

        for (Integer sayi : sayiList1) {

            if (sayi == 4){
                System.out.println("SayıDeğeri " + sayi);
                break;
            }

            System.out.println("Sayı Devam "+sayi);

        }
    }
}
