package com.erdincozdemir.departman;

import com.erdincozdemir.base.Personel;
import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Muhasebeci extends Personel {
    /*
    private String adi;
    private String soyadi;
    private String telefonNo;
    private String kimlikNo;
    private String hesapNo;
    private int personelNo;
    private String departmani;
     */

    private String unvan;
    private long sertifikaNo;

}
