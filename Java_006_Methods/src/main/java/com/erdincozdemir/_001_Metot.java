package com.erdincozdemir;

public class _001_Metot {

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            cizgiCiz();
        }
        topla(1, 2);
        kucukBul(8, 12);

        int dizi[] = new int[]{23, 38, 41, 33};
        islemYap(dizi);

        // Diziyi ekrana yazdırma işlemi, islemYap metodu çağrıldıktan sonra yapılıyor.
        for (int i : dizi) {
            System.out.println(i);
        }
    }

    public static void cizgiCiz() {
        System.out.println("---------------");
    }

    public static void topla(int a, int b) {
        int toplama = a + b;
        System.out.println("toplam = " + toplama);
    }

    public static void kucukBul(int x, int y) {
        if (x > y) {
            System.out.println("x, y'den büyük");
        } else if (x < y) {
            System.out.println(("x, y'den küçük"));
        } else {
            System.out.println("x = y");
        }
    }

    private static void islemYap(int dizi[]) {
        for (int i = 0; i < 3; i++) {
            dizi[i] = i * i;
        }
    }
}
