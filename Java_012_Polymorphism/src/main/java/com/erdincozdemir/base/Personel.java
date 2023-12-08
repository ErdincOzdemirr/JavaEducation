package com.erdincozdemir.base;

import com.erdincozdemir.departman.Mudur;
import lombok.*;

@Setter
@Getter
@ToString
public class Personel {

    private String adi;
    private String soyadi;
    private String telefonNo;
    private String kimlikNo;
    private String hesapNo;
    private int personelNo;
    private String departmani;


    public Personel() {
    }

    public Personel(String adi, String soyadi, String telefonNo, String kimlikNo, String hesapNo, int personelNo, String departmani) {
        this.adi = adi;
        this.soyadi = soyadi;
        this.telefonNo = telefonNo;
        this.kimlikNo = kimlikNo;
        this.hesapNo = hesapNo;
        this.personelNo = personelNo;
        this.departmani = departmani;
    }

    public void bilgiPersonelYaz(Personel personel) {
        if (personel.getSoyadi() == null) personel.setSoyadi("");
        System.out.println("Adı - Soyadi: "+personel.getAdi() + " " + personel.getSoyadi());
        if (personel.getDepartmani() == null){
            personel.setDepartmani("Henüz Belirli Değil");
        System.out.println("Departman: "+personel.getDepartmani());}
    }

    public void hesapla(){
        System.out.println("Personel içindeki hesapla metodu");
    };
}
