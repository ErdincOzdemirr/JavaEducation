package com.erdincozdemir;

import java.util.*;

public class AppMain {

    public static void main(String[] args) {

        List<String> ogrenciList = new ArrayList();
        ogrenciList.add("Erdinç");
        ogrenciList.add("Ozdemir");
        ogrenciList.add("Sakarya");
        ogrenciList.add("Hava");
        ogrenciList.add("Sevgili");
        ogrenciList.add("Ankara");
        ogrenciList.add("Erdinç");
        ogrenciList.add("Oz");
        ogrenciList.add("Eskişehir");
        ogrenciList.add(null);
        System.out.println("ARRAY LIST Ogrenciler: "+ogrenciList);

        Set ogrenciList2 = new HashSet();
        ogrenciList2.add("Ezgi");
        ogrenciList2.add("Hacer");
        ogrenciList2.add("ismail");
        ogrenciList2.add("Oğuz");
        ogrenciList2.add("Esra");
        ogrenciList2.add("Ankara");
        ogrenciList2.add("Sakarya");
        ogrenciList2.add("Bursa");
        ogrenciList2.add("Eskişehir");
        ogrenciList2.add(null);
        System.out.println("Hash SEt Ogrenciler2: "+ogrenciList2);

        Set<String> ogrenciList3 = new TreeSet<>();
        ogrenciList3.add("Ezgi");
        ogrenciList3.add("Hacer");
        ogrenciList3.add("ismail");
        ogrenciList3.add("Oğuz");
        ogrenciList3.add("Esra");
        ogrenciList3.add("Ankara");
        ogrenciList3.add("Sakarya");
        ogrenciList3.add("Bursa");
        ogrenciList3.add("Eskişehir");
        //ogrenciList3.add(null);
        System.out.println("tree set Ogrenciler3: "+ogrenciList3);
        //Tree set e null değeri girilmez. ama hash set e null girilir.




        Set<String> ogrenciList4 = new LinkedHashSet<>();
        ogrenciList4.add("Ezgi");
        ogrenciList4.add("Hacer");
        ogrenciList4.add("ismail");
        ogrenciList4.add("Oğuz");
        ogrenciList4.add("Esra");
        ogrenciList4.add("Ankara");
        ogrenciList4.add("Ankara");
        ogrenciList4.add("Sakarya");
        ogrenciList4.add("Bursa");
        ogrenciList4.add("Eskişehir");
        ogrenciList4.add(null);
        System.out.println("lİNKEDHASH set Ogrenciler4: "+ogrenciList4);

        if (ogrenciList4.isEmpty()){
            System.out.println("Bu liste boştur.");
        }else {
            System.out.println("Liste dolu.");
        };

    }



}
