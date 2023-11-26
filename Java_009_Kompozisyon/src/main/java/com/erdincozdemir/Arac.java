package com.erdincozdemir;

public class Arac {
    public Arac() {
        System.out.println("Arac");
    }

    private Yakit yakit = new Yakit();//sınıf tipinin varsayılan değeri "null"//;
    private Ayna ayna = new Ayna();
    private Direksiyon direksiyon = new Direksiyon();

    private Koltuk koltuk = new Koltuk();

    private Depo depo = new Depo();

    public void hareketEt() {

        if (yakit.yakitDurumKontrol()) {
            System.out.println("Harekete geçildi");
        } else {
            System.out.println("Yakıt yok");
        }
    }
}
