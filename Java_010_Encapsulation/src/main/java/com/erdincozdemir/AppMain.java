package com.erdincozdemir;

public class AppMain {
    public static void main(String[] args) {

        Musteri musteri = new Musteri("Erdinç",
                                    "Özdemir",
                                      "12345",
                                    12345789L,
                                300.15);
        System.out.println(musteri);

        musteri.setAdi("Hava");
        musteri.setSoyadi("Sevgili");
        musteri.setHesapNo(99999l);
        System.out.println(musteri.getAdi());
        System.out.println(musteri.getSoyadi());
        System.out.println(musteri.getIban());
        System.out.println(musteri.getHesapNo());
        System.out.println(musteri.getHesapCuzdani());




    }
}
