package com.erdincozdemir;

public class AppMain {
    public static void main(String[] args) {

        boolean medeniDurumu1 = true; //1 yes YES TRUE ( farklı syntax lar)
        boolean medeniDurumu2 = false;//0 no NO FALSE

        int sayi0;
        byte yasi1 = 13;
        short yasi2 = 32767;
        int sonuc = yasi1 + yasi2;
        System.out.println(sonuc);

        int deneme1 = 2147483647;
        int deneme2 = 10;
        long sonuc2 = (long) deneme2 + deneme1;
        System.out.println(sonuc2);


        float piSayisi = (float) 3.14; //3.14f; //3.14F

        double bankaHesabiBilgisi = 123456789;

        long hesapBilgisi = 100_000_000; //_ sadece sayı arasına girer.

        float sayimiz1 = 1.0; //. olduğunda f unutma
        double sayimiz2 = 2.0; //double d koymasanızda problem yok
        double sonucumuz = sayimiz1 + sayimiz2;
        System.out.println(sonucumuz);





    }
}
