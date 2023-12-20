package com.erdincozdemir.v1;

import java.time.LocalDateTime;
import java.util.ArrayList;
//Kendi class ımı yazdım
public class PersonelList<T>{
    private ArrayList<T> mYlist = new ArrayList<>();

    public  void listeyeEkle (T eklenecekSey){
        System.out.println("Eklenen : " + eklenecekSey+" - Eklenme Zamanı : "+LocalDateTime.now());
        mYlist.add(eklenecekSey);
    };

    public ArrayList<T> ListeyeGetir(){
        return mYlist;
    };



}
