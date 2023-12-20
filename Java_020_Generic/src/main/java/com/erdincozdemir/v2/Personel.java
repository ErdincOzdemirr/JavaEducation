package com.erdincozdemir.v2;

public class Personel {

    public  void ekranaYaz(){
        System.out.println("Ekrana yaz mesajı");
    };

    /*
    public void ekranaYaz(Integer numarasi, String adi) {

        System.out.println("No : "+ numarasi + " Adi : "+adi);
        System.out.println(numarasi.getClass());
        System.out.println(adi.getClass());

        System.out.println("-------------------------");
    }
    */

    public <GelenTip1, GelenTip2>void ekranaYaz(GelenTip1 numarasi, GelenTip2 adi) {

        System.out.println("No : "+ numarasi + " Adi : "+adi);
        System.out.println(numarasi.getClass());
        System.out.println(adi.getClass());

        System.out.println("-------------------------");

    }
    public <GelenTip1, GelenTip2, GelenTip3>void ekranaYaz(GelenTip1 numarasi, GelenTip2 adi, GelenTip3 soyadi) {

        System.out.println("No : "+ numarasi + " Adi : "+adi+" Soyadi : "+ soyadi);
        System.out.println(numarasi.getClass());
        System.out.println(adi.getClass());
        System.out.println(soyadi.getClass());
        System.out.println("-------------------------");

    }


}
