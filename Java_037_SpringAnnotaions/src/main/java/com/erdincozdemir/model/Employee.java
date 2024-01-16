package com.erdincozdemir.model;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Employee {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
}
