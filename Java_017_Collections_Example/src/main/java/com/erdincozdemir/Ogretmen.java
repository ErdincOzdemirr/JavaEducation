package com.erdincozdemir;

import lombok.*; //import lombok.*.* olmaz çünkü * dan sonra ne yazıldığının önemi yok 2 * olmaz;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Ogretmen {

    private String adi;
    private String soyadi;
    private String telefon;
    private String adres;
    private Brans brans;

}
