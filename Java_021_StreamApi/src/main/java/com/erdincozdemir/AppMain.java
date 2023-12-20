package com.erdincozdemir;

import java.util.List;
import java.util.stream.Stream;

public class AppMain {
    public static void main(String[] args) {

        Stream <String> boskayit = Stream.empty();
        System.out.println("boskayit bilgisi: "+boskayit);

        Stream <String> tekKayit = Stream.of("Erdinç");
        System.out.println("Tek Kayit Bilgisi : "+tekKayit);

        Stream <String> cokluKayit = Stream.of("Erdinç", "Hava", "Ezgi", "Hacer", "ismail");
        System.out.println("Coklu Kayit Bilgisi : "+cokluKayit);

        List<String> ogrenciListesi = List.of("Erdinç", "Hava", "Ezgi", "Hacer", "ismail");
        //ogrenciListesi.add("Sakarya");
        System.out.println("ogrenciListesi Kayit Bilgisi : "+ogrenciListesi);

        System.out.println("-------------------------------------------------------");

        Stream<String> ogrenciStream = ogrenciListesi.stream();
        //Elimdeki listeyi stream e çevirdim.
                            //parametre    return    sonuç
        ogrenciStream.forEach(ogrenci        ->      System.out.println(ogrenci));
        //stream i 2 defa dönemeyiz
       // ogrenciStream.forEach(System.out::println);

        System.out.println("-------------------------------------------------------");


    }
}