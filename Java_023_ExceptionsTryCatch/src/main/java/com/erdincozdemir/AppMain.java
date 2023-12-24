package com.erdincozdemir;

import java.util.Scanner;

public class AppMain {
    public static void main(String[] args) {

        int sayi1 = 0;
        int sayi2 = 0;
        int toplam = 0;
        float bolme = 0;

        Scanner scanner = new Scanner(System.in);

        boolean hataDurumuFlag = false;
        do {
            try {
//TODO Bunu Halllet
                System.out.print("1.sayiyi giriniz : ");
                sayi1 = scanner.nextInt();

                System.out.print("2.sayiyi giriniz : ");
                sayi2 = scanner.nextInt();

                toplam = sayi1 + sayi2;
                System.out.println("Toplam : " + toplam);

                bolme = sayi1 / sayi2;
                System.out.println("Bolme : " + bolme);

                hataDurumuFlag = false;

            } catch (Exception e) {

                System.out.println("Hata : " + e.toString());
                hataDurumuFlag = true;

            } finally {

                System.out.println("---------------");

            }

        } while (hataDurumuFlag);


    }
}
