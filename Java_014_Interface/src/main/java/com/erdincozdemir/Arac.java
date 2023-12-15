package com.erdincozdemir;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Arac {

    private String plakaNumarasi;
    private short modelYili;
    private String modelSeri;
    private short koltukSayisi;
    private boolean surucuDurum;
    private byte tekerSayi;

    public void hareketEt(){
        System.out.println("Hareket Ediyor");
    };

    public void hareketEt(String aracCinsi) {
        System.out.println("Harekete Ediyor : " + aracCinsi);
    };

    public boolean yagKontrolDurumu(){
        return false;
    };

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Arac{");
        sb.append("plakaNumarasi='").append(plakaNumarasi).append('\'');
        sb.append(", modelYili=").append(modelYili);
        sb.append(", modelSeri='").append(modelSeri).append('\'');
        sb.append(", koltukSayisi=").append(koltukSayisi);
        sb.append(", surucuDurum=").append(surucuDurum);
        sb.append(", tekerSayi=").append(tekerSayi);
        sb.append('}');
        return sb.toString();
    }


}
