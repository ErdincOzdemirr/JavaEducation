package com.erdincozdemir;

import java.util.Scanner;

public class _002_if_Else {
    public static void main(String[] args) {

        System.out.println("IF ELSE");

        if (11<50){
            System.out.println("EVET UYGUNDUR.");
        }else {
            System.out.println("HAYIR OLMAZ!");
        };

        System.out.println("---- Ornek1 ----");

        int yas = 21;
        System.out.println("Oy kullanmak isteyenin yasi = "+ yas);
        int secmenyasi = 18;

        if (secmenyasi < yas ) {
            System.out.println("Evet oy kullanabilir");
        }else {
            System.out.println("Hayır Oy Kullanamaz");
        }

        System.out.println("---- Ornek2 ----");

        int yas1 = 18;
        String saglikDurumu = "EVET";

        if(saglikDurumu.equals("EVET")) {
            if (yas1 == 16 ){
                System.out.println("Aday stajyer olabilir.");
            } else if (yas1 > 17 ) {
                System.out.println("Reşit ehliyet alabilir.");
            } else  {
                System.out.println("Üzgünüm ehliyet için uygun değilsiniz.");
            }
        } else {
            System.out.println("Sağlık durumunuz uygun olmadığı için rapor alamazsınız.");
        }
    }
}
