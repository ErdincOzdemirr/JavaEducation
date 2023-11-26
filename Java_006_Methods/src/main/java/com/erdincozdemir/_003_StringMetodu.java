package com.erdincozdemir;

public class _003_StringMetodu {

    public static void main(String[] args) {

        String adi = "Erdinç";
        System.out.println(adi.length());
        if (adi.length() > 4) {
            System.out.println("Evet");
        } else {
            System.out.println("Hayır");
        }
        cizgiCek();

        String adi2 = "Hava";
        String adi3 = "Ezgi";

        if (adi2 == adi3) {
            System.out.println("Eşit");
        } else {
            System.out.println("Değil");
        }

        cizgiCek();

        if (adi2.equals(adi3)) {
            System.out.println("EŞİT");
        } else {
            System.out.println("Değil");
        }

        cizgiCek();

        selamVer("Erdinç");

    }

    private static void cizgiCek(){
        System.out.println("-------------------");
    }

    private static void selamVer(String isim) {System.out.println("Selamlar Sayın "+ isim + " Hoşgeldiniz.");
    }
}
