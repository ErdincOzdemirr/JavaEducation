package com.erdincozdemir;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class AppMain {
    public static void main(String[] args) {

        System.out.println("------------TreeMap--------------");

        Map<String, Integer> plakaListe = new TreeMap();
        plakaListe.put("Ankara", 06);
        plakaListe.put("Sakarya", 54);
        plakaListe.put("Eskişehir", 26);
        plakaListe.put("İzmir", 35);
        plakaListe.put("Düzce", 81);
        plakaListe.put("Bursa", null);
        //key tarafına value girilmez. value tarafına girilebilir.
        System.out.println(plakaListe);

        for (String anahtarKey : plakaListe.keySet()) {
            System.out.println("Plaka Bilgisi:  "+ anahtarKey +  " " + plakaListe.get(anahtarKey));
        };

        System.out.println("------------LinkedHashMap--------------");

        Map<String, Integer> plakaListe2 = new LinkedHashMap<>();
        plakaListe2.put("Ankara", 06);
        plakaListe2.put("Sakarya", 54);
        plakaListe2.put("Eskişehir", 26);
        plakaListe2.put("İzmir", 35);
        plakaListe2.put("Düzce", 81);
        plakaListe2.put("Bursa", null);
        plakaListe2.put(null, null);
        //key tarafına value girilmez. value tarafına girilebilir.
        System.out.println(plakaListe2);

        for (String anahtarKey : plakaListe2.keySet()) {
            System.out.println("Plaka Bilgisi:  "+ anahtarKey +  " " + plakaListe2.get(anahtarKey));
        };

        System.out.println("------------HashMap--------------");

        Map<String, Integer> plakaListe3 = new HashMap<>();
        plakaListe3.put("Ankara", 06);
        plakaListe3.put("Sakarya", 54);
        plakaListe3.put("Eskişehir", 26);
        plakaListe3.put("İzmir", 35);
        plakaListe3.put("Düzce", 81);
        plakaListe3.put("Bursa", null);
        plakaListe3.put(null, null);
        //key tarafına value girilmez. value tarafına girilebilir.
        System.out.println(plakaListe3);

        for (String anahtarKey : plakaListe3.keySet()) {
            System.out.println("Plaka Bilgisi:  "+ anahtarKey +  " " + plakaListe3.get(anahtarKey));

        }



    }
}
