package com.erdincozdemir;

import com.erdincozdemir.departman.Mudur;
import com.erdincozdemir.departman.Muhasebeci;

public class AppMain {

    private static void  cizgiciz(){
        System.out.println("---------");
    }
    public static void main(String[] args) {
        Mudur mudur = new Mudur();
        mudur.setAdi("Erdinç");
        mudur.setSoyadi("Ozdemir");
        mudur.setPersonelNo(1);
        mudur.setKimlikNo("1");
        mudur.setHesapNo("9999");
        mudur.setDepartmani("Bilişim");
        mudur.setTelefonNo("532");
        mudur.setTahsilDurumu("Lisans");
        mudur.setTecrubeYili((byte) 5);

        /* System.out.println("Adı - Soyadi: "+mudur.getAdi() + " " + mudur.getSoyadi());
        System.out.println("Tahsil: "+ mudur.getTahsilDurumu()); */

        mudur.mudurBilgisiniYaz(mudur);

        cizgiciz();

        mudur.setAdi("Hava");
        mudur.setSoyadi("Sevgili");
        mudur.setPersonelNo(2);
        mudur.setKimlikNo("2");
        mudur.setHesapNo("9999");
        mudur.setDepartmani("CEO");
        mudur.setTelefonNo("532");
        mudur.setTahsilDurumu("Lisans");
        mudur.setTecrubeYili((byte) 5);

        /* System.out.println("Adı - Soyadi: "+mudur.getAdi() + " " + mudur.getSoyadi());
        System.out.println("Tahsil: "+ mudur.getTahsilDurumu()); */

        mudur.mudurBilgisiniYaz(mudur);

        cizgiciz();

        Muhasebeci muhasebeci = new Muhasebeci();
        muhasebeci.setUnvan("Mali Müşavir");
        muhasebeci.setAdi("Erdinç");
        muhasebeci.setSoyadi("Ozdemir");

        System.out.println(muhasebeci);
        muhasebeci.bilgiPersonelYaz(muhasebeci);

        muhasebeci.hesapla();
        muhasebeci.hesapla(20);
        muhasebeci.hesapla(10, 20);



    }

}
