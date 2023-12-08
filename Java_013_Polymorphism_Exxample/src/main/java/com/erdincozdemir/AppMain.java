package com.erdincozdemir;

public class AppMain {
    public static void main(String[] args) {
        Kedi kedi = new Kedi();
        kedi.sesVer();
        System.out.println("-----------");
        Kopek kopek = new Kopek();
        kopek.sesVer();
        System.out.println("-----------");
        Kus kus = new Kus();
        kus.sesVer();

        Veteriner veteriner = new Veteriner();
        if (kedi instanceof Hayvan){
            System.out.println(kedi);
        } else {
            System.out.println("Hayır");
        }

        Hayvan hayvan = new Hayvan();
        hayvan.sesVer();

        System.out.println("------");

        Hayvan hayvan2 = new Kedi();
        hayvan2.sesVer();

        //Kedi kedi2 = (Kedi) new Hayvan(); çalışmaz çünkü alt class dan üst class a nesne eklenemez.
    }
}
