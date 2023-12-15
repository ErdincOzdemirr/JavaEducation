package com.erdincozdemir;

public class Kamyon extends Arac implements Kanun, DernekUyeSartları{

    @Override
    public String aracKontrolu() {
        return "Kasım ayında Kontrol Yapılır";
    }

    @Override
    public short hizSiniriAl() {
        return 100;
    }

    @Override
    public int ehliyetYenilemeZamani() {
        return 10;
    }

    @Override
    public byte ehliyetTecrübeYili() {
        return 10;
    }

    @Override
    public String dernekUyeOnayDurumu() {
        return "Onaylanmıştır";
    }
}
