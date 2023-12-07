package com.erdincozdemir.departman;

import com.erdincozdemir.base.Personel;
import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Hizmetli extends Personel {
    private String vazifesi;
}
