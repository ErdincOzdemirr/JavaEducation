package com.erdincozdemir.model;

import jakarta.persistence.*;
import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private long id;

    //  @GeneratedValue(strategy = GenerationType.IDENTITY )
    // private String id;

    @Column(name = "FIRST_NAME", length = 100, nullable = false)
    private String firstName;

    @Column(name = "LAST_NAME", length = 125)
    private String lastName;

    @Column(name = "EMAIL", unique = true)
    private String email;

    //@Column(name = "SCHOOL_NO")
    //private int schoolNo;

}
