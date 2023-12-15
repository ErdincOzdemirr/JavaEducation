package com.erdincozdemir;

public class Taksi extends Arac implements Kanun, Belediyeİstekleri{
    @Override
    public String aracKontrolu() {
        return "2 ayda bir";
    }

    @Override
    public short hizSiniriAl() {
        return 105;
    }

    @Override
    public int ehliyetYenilemeZamani() {
        return 8;
    }

    @Override
    public String calismaSaatlari() {
        return "8-17";
    }

    @Override
    public boolean akilSagligiRaporu() {
        return false;
    }
}
