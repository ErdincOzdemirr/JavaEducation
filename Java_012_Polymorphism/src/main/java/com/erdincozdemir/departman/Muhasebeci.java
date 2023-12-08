package com.erdincozdemir.departman;

import com.erdincozdemir.base.Personel;
import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Muhasebeci extends Personel {
    /*
    private String adi;
    private String soyadi;
    private String telefonNo;
    private String kimlikNo;
    private String hesapNo;
    private int personelNo;
    private String departmani;
     */

    private String unvan;
    private long sertifikaNo;

    @Override
    public void hesapla(){
        System.out.println("Muhasebeci içindeki hesapla metodu");
    };

    public void hesapla(int maas){
        System.out.println("Muhasebeci 2.hesapla metodu");
    };

    public void hesapla(int i, int i1) {
        System.out.println("2 parametreli");
    }

    public void hesapla(int i, int i1, String i2) {
        System.out.println("3 parametreli");
    }
    public void hesapla(String i, int i1, String i2) {
        System.out.println("3 parametreli");
    }
}
