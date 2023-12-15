package com.erdincozdemir;

public abstract class Hayvan extends Canli{

    public Hayvan(){
        System.out.println("Hayvan Sinifi");
    };
    public void gidaAl(){
        System.out.println("Hayvan Yemek Yiyecek.");
    };

    public abstract void sesVer();
    public abstract void hareketEt();
}
