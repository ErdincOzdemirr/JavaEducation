package com.erdincozdemir;

public class Otobus extends Arac implements Kanun, Guzergah{
    @Override
    public String aracKontrolu() {
        return "Haziran Ayında yapılır. ";
    }

    @Override
    public short hizSiniriAl() {
        return 120;
    }

    @Override
    public int ehliyetYenilemeZamani() {
        return 12;
    }


    @Override
    public boolean biletDurumu() {
        return true;
    }

    @Override
    public boolean vizeDurumu() {
        return false;
    }
}
