package com.erdincozdemir;

import java.util.Optional;

public class AppMain {
    public static void main(String[] args) {

        Ogrenci ogrenci = new Ogrenci();
        System.out.println("id: "+ogrenci.getId());
        System.out.println("Adi: "+ogrenci.getAdi());
        System.out.println("SoyAdi: "+ogrenci.getSoyadi());

        System.out.println("-----------------------------");

        ogrenci = new Ogrenci("Erdinç");
        System.out.println("id: "+ogrenci.getId());
        System.out.println("Adi: "+ogrenci.getAdi());
        System.out.println("SoyAdi: "+ogrenci.getSoyadi());

        System.out.println("-----------------------------");

        ogrenci = new Ogrenci("Erdinç", "Ozdemir");
        System.out.println("id: "+ogrenci.getId());
        System.out.println("Adi: "+ogrenci.getAdi());
        System.out.println("SoyAdi: "+ogrenci.getSoyadi());

        System.out.println("-----------------------------");

        ogrenci = new Ogrenci(54,"Erdinç", "Ozdemir");
        System.out.println("id: "+ogrenci.getId());
        System.out.println("Adi: "+ogrenci.getAdi());
        System.out.println("SoyAdi: "+ogrenci.getSoyadi());

        System.out.println("-----------------------------");

        ogrenci = null;
        System.out.println(ogrenci);
/*
        System.out.println("id: "+ Optional.ofNullable(ogrenci.getId()));
        System.out.println("Adi: "+ogrenci.getAdi());
        System.out.println("SoyAdi: "+ogrenci.getSoyadi());
*/
        System.out.println("-----------------------------");

        Optional <Double> ortalama = ortalamaHesapla (50, 77, 35, 6, 3.2, 1);//);
        if(ortalama.isPresent()){
            System.out.println("Sınavların Ortalaması : "+ortalama.get());
        }else{
            System.out.println("Henüz Sınav Yapılmadı");
        }

    }

    private static Optional<Double> ortalamaHesapla(double... notlar ) {
        if ( notlar.length==0 )
            return Optional.empty();

        double toplamDegeri = 0.0;
        for (double not : notlar){
            toplamDegeri += not;
           // System.out.println(not);
        }
        double sonucOrtalama = toplamDegeri/notlar.length;

        return Optional.of(sonucOrtalama);
    }
}