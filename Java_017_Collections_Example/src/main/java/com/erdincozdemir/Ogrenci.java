package com.erdincozdemir;

import lombok.*;

import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Ogrenci {

    private String adi;
    private String soyadi;
    private String okulNo;
    private List<Ders> ders;
    private Brans brans;
}
