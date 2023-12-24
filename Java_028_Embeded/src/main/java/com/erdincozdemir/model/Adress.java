package com.erdincozdemir.model;

import javax.persistence.Embeddable;

Embeddable
public class Adress {
    @Column
    private String sehir;
    private String ilce;
    private String mahalle;

    public Adress() {
    }

    public Adress(String sehir, String ilce, String mahalle) {
        this.sehir = sehir;
        this.ilce = ilce;
        this.mahalle = mahalle;
    }

    public Adress(String sehir, String ilce) {
        this.sehir = sehir;
        this.ilce = ilce;
    }

    public String getSehir() {
        return sehir;
    }

    public void setSehir(String sehir) {
        this.sehir = sehir;
    }

    public String getIlce() {
        return ilce;
    }

    public void setIlce(String ilce) {
        this.ilce = ilce;
    }

    public String getMahalle() {
        return mahalle;
    }

    public void setMahalle(String mahalle) {
        this.mahalle = mahalle;
    }
}
