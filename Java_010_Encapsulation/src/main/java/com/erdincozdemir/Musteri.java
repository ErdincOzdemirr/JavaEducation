package com.erdincozdemir;

public class Musteri {

    private String adi;
    private String soyadi;

   private String iban;

    private Long hesapNo;

    private Double hesapCüzdani;

    public Musteri() {
        System.out.println("Boş mu");
    }

    public Musteri(String adi, String soyadi, String iban, long hesapNo, Double hesapCüzdani) {
        this.adi = adi;
        this.soyadi = soyadi;
        this.iban = iban;
        this.hesapNo = hesapNo;
        this.hesapCüzdani = hesapCüzdani;
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

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public Long getHesapNo() {
        return hesapNo;
    }

    public void setHesapNo(Long hesapNo) {
        this.hesapNo = hesapNo;
    }

    public Double getHesapCüzdani() {
        return hesapCüzdani;
    }

    public void setHesapCüzdani(Double hesapCüzdani) {
        this.hesapCüzdani = hesapCüzdani;
    }
}
