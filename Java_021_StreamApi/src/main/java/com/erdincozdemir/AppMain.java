package com.erdincozdemir;

import java.util.stream.Stream;

public class AppMain {
    public static void main(String[] args) {

        Stream <String> boskayit = Stream.empty();
        System.out.println("boskayit bilgisi: "+boskayit);

        Stream <String> tekKayit = Stream.of("Erdinç");
        System.out.println("Tek Kayit Bilgisi : "+tekKayit);

        Stream <String> cokluKayit = Stream.of("Erdinç", "Hava", "Ezgi", "Hacer", "ismail");
        System.out.println("Coklu Kayit Bilgisi : "+cokluKayit);

    }
}