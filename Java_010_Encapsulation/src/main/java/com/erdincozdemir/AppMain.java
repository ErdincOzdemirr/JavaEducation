package com.erdincozdemir;

public class AppMain {
    public static void main(String[] args) {
        Musteri musteri = new Musteri("Erdinc", "Özdemir" , "12345" , 1263456789l, 128796123D);

        System.out.println(musteri);
        System.out.println(musteri.getAdi());
        System.out.println(musteri.getSoyadi());
        System.out.println(musteri.getIban());
        System.out.println(musteri.getHesapNo());
        System.out.println(musteri.getHesapCüzdani());

        musteri.setAdi("Erdinç");
        musteri.getSoyadi("Ozdemir");


    }
}
