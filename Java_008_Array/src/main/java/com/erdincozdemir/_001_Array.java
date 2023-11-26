package com.erdincozdemir;

public class _001_Array {
    public static void main(String[] args) {
        int sayi1 = 10;
        int sayi2 = 20;
        int sayi3 = 30;
        int sayi4 = 40;
        int sayi5 = 50;
        System.out.println(sayi1 + " " + sayi2 + " " + sayi3 + " " + sayi4 + " " + sayi5);

        int [] sayi = new int [5];
        sayi[0] = 100;
        sayi[1] = 200;
        sayi[2] = 300;
        sayi[3] = 400;
        sayi[4] = 500;
        System.out.println(sayi[0] + " " + sayi[1] + " " + sayi[2] + " " + sayi[3] + " " + sayi[4]);

        //sayilar[26] = 123;
        //System.out.println(sayilar[26]); array index out of bounds exception ( sınır aşma hatası verir. arrayin sınırı 5 ama biz 26 ya gidemez)

        //sayilar[5] = 8;
        //System.out.println(sayilar[26]); array index out of bounds exception ( sınır aşma hatası verir. arrayin sınırı 5 ama biz en son 4 e kadar gideriz. 5 e gidemez)

        short myArray[] = new short[4];
        myArray[0]=10000;
        //myArray[1]=null; yanlış
        //array değerine değer atanmadığı zaman varsayılan olarak tipe göre değer alır.
        System.out.println(myArray[0]);//10000
        System.out.println(myArray[1]);//0
        System.out.println(myArray[2]);//0

        byte myArrayByte[] = {14, 53, 19, 23};
        //byte myArrayByte[] = new byte[4];
        /* myArrayByte[0]=120;
        myArrayByte[1]=100;
        myArrayByte[2]=12;
        myArrayByte[3]=10;*/
        //myArray[1]=null; yanlış
        //array değerine değer atanmadığı zaman varsayılan olarak tipe göre değer alır.
        System.out.println(myArrayByte[0]);//120
        System.out.println(myArrayByte[1]);//100
        System.out.println(myArrayByte[2]);//12

        System.out.println("---------------------------");

        for (int i = 0; i < myArrayByte.length; i++) {
            System.out.println(myArrayByte[i]);
        }
    }
}
