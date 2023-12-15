package com.erdincozdemir;

public class Kedi extends Hayvan implements Kural{
    @Override
    public void sesVer() {
        System.out.println("Kedi miyav der");

    }

    @Override
    public void hareketEt() {
        System.out.println("Kedi hareket ediyor");

    }

    //İsteğe bağlı superclass dan veri alabilirsin ama abstrac ise kesin almalısın;

   @Override
    public void gidaAl(){
        System.out.println("Hayvan Yemek Yiyecek.");
    };

    @Override
    public boolean saglikdurumu() {
        return true;
    }

}
