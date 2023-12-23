package com.erdincozdemir;

public class Ogrenci {
    private int id;
    private String adi;
    private String soyadi;

    public Ogrenci() {
    }

    public Ogrenci(String adi) {
        this.adi = adi;
    }

    public Ogrenci(String adi, String soyadi) {
        this.adi = adi;
        this.soyadi = soyadi;
    }

    public Ogrenci(int id, String adi, String soyadi) {
        this.id = id;
        this.adi = adi;
        this.soyadi = soyadi;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
}