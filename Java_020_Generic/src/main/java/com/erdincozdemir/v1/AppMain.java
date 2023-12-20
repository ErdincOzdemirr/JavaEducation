package com.erdincozdemir.v1;

import java.util.ArrayList;

public class AppMain {
    public static <ListPersonel> void main(String[] args) {

        ArrayList           myArrayList1 = new ArrayList<>();
        ArrayList <String> myArrayList2 = new ArrayList<>();
        myArrayList2.add("Ozdemir");

        PersonelList<String> myListManager = new PersonelList();

        //log
        //islemler
        myListManager.listeyeEkle("Erdinç");
    }


}