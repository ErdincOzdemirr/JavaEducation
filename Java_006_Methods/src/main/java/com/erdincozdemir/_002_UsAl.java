package com.erdincozdemir;

public class _002_UsAl {
    public static void main(String[] args) {

        double sonuc = usHesapla(3, 4);
        System.out.println(sonuc);

        float toplam = (int) topla(4,5,7);
        System.out.println(toplam);
    }

    private static double usHesapla(double taban, double us) {
        if (us < 0) {
            throw new IllegalArgumentException("Üs değeri negatif olamaz");
        }
        return Math.pow(taban, us);
    }

    public static float topla(int a, int b, int c) {
        return a + b + c;
    }
}
