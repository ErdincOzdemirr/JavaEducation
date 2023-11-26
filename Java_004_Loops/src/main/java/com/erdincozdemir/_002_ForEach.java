package com.erdincozdemir;

public class _002_ForEach {
    public static void main(String[] args) {

        String [] ogrenciler = {"Erdinc", "Hava", "Ezgi"};

        for ( String ogrenci : ogrenciler /* arrayName */) {
            System.out.println("ogrenci : " + ogrenci);
        }

        System.out.println("------------------------");

        int [] numaralar = {007, 13, 21, 1};
        for(int numara : numaralar) {
            System.out.println((float) numara + numara*20/100);
        };

        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String i : cars) {
            System.out.println(i);
        }
    }
}
