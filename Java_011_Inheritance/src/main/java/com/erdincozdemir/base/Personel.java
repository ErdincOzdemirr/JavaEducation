package com.erdincozdemir.base;

import com.erdincozdemir.departman.Mudur;
import lombok.ToString;

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

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getSoyadi() {
        return soyadi;
    }

    public void setSoyadi(String soyadi) {
        this.soyadi = soyadi;
    }

    public String getTelefonNo() {
        return telefonNo;
    }

    public void setTelefonNo(String telefonNo) {
        this.telefonNo = telefonNo;
    }

    public String getKimlikNo() {
        return kimlikNo;
    }

    public void setKimlikNo(String kimlikNo) {
        this.kimlikNo = kimlikNo;
    }

    public String getHesapNo() {
        return hesapNo;
    }

    public void setHesapNo(String hesapNo) {
        this.hesapNo = hesapNo;
    }

    public int getPersonelNo() {
        return personelNo;
    }

    public void setPersonelNo(int personelNo) {
        this.personelNo = personelNo;
    }

    public String getDepartmani() {
        return departmani;
    }

    public void setDepartmani(String departmani) {
        this.departmani = departmani;
    }

    public void bilgiPersonelYaz(Personel personel) {
        if (personel.getSoyadi() == null) personel.setSoyadi("");
        System.out.println("Adı - Soyadi: "+personel.getAdi() + " " + personel.getSoyadi());
        if (personel.getDepartmani() == null){
            personel.setDepartmani("Henüz Belirli Değil");
        System.out.println("Departman: "+personel.getDepartmani());}
    }

    /*@Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Personel{");
        sb.append("adi='").append(adi).append('\'');
        sb.append(", soyadi='").append(soyadi).append('\'');
        sb.append(", telefonNo='").append(telefonNo).append('\'');
        sb.append(", kimlikNo='").append(kimlikNo).append('\'');
        sb.append(", hesapNo='").append(hesapNo).append('\'');
        sb.append(", personelNo=").append(personelNo);
        sb.append(", departmani='").append(departmani).append('\'');
        sb.append('}');
        return sb.toString();*/

}
