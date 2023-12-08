package com.erdincozdemir.departman;
import com.erdincozdemir.base.Personel;

public class Mudur extends Personel {

    /*
    private String adi;
    private String soyadi;
    private String telefonNo;
    private String kimlikNo;
    private String hesapNo;
    private int personelNo;
    private String departmani;
     */
    private String tahsilDurumu;

    private byte tecrubeYili;

    public Mudur() {

    }

    public Mudur(String adi, String soyadi, String telefonNo, String kimlikNo, String hesapNo, int personelNo, String departmani, String tahsilDurumu, byte tecrubeYili) {
        super(adi, soyadi, telefonNo, kimlikNo, hesapNo, personelNo, departmani);
        this.tahsilDurumu = tahsilDurumu;
        this.tecrubeYili = tecrubeYili;
    }

    public String getTahsilDurumu() {
        return tahsilDurumu;
    }

    public void setTahsilDurumu(String tahsilDurumu) {
        this.tahsilDurumu = tahsilDurumu;
    }

    public byte getTecrubeYili() {
        return tecrubeYili;
    }

    public void setTecrubeYili(byte tecrubeYili) {
        this.tecrubeYili = tecrubeYili;
    }

    public void mudurBilgisiniYaz(Mudur mudur) {
        System.out.println("Adı - Soyadi: "+mudur.getAdi() + " " + mudur.getSoyadi());
        System.out.println("Tahsil: "+ mudur.getTahsilDurumu());
        System.out.println("Departman: "+mudur.getDepartmani());
    }
}
