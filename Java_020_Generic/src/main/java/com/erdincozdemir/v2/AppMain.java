package com.erdincozdemir.v2;

import java.util.ArrayList;
import java.util.LinkedList;

public class AppMain {
    public static void main(String[] args) {

        Personel obj = new Personel();

        obj.ekranaYaz();

        obj.ekranaYaz(54, "Erdinç");
        obj.ekranaYaz(06, "Hava");
        obj.ekranaYaz(26, "Oğuz");
        obj.ekranaYaz(34, "Atilla");
        obj.ekranaYaz("35", "Murat");
        obj.ekranaYaz(54, "Erdinç", "Ozdemir");


        LinkedList ogrenciNo = new LinkedList();
        ogrenciNo.add(1453);
        ogrenciNo.add(1923);

        ArrayList ogrenciList = new ArrayList();
        ogrenciList.add("İsmail");
        ogrenciList.add("Hacer");

        obj.ekranaYaz(ogrenciNo, ogrenciList);


    }
}
