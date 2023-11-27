package com.erdincozdemir;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Arac{

    private String plakaNo;
    private short modelYili;
    private  String modelSeri;
    private short koltukSayisi;
    private boolean surucuDurumu;
    private byte tekerSayisi;

    public void hareketEt(){
        System.out.println("Hareket ediyor.");
    }

    @Override
    public String toString() {
        return "Arac{" +
                "plakaNo='" + plakaNo + '\'' +
                ", modelYili=" + modelYili +
                ", modelSeri='" + modelSeri + '\'' +
                ", koltukSayisi=" + koltukSayisi +
                ", surucuDurumu=" + surucuDurumu +
                ", tekerSayisi=" + tekerSayisi +
                '}';
    }
}
}
