package com.funsoft.cabinet.entities;

import javax.persistence.*;

@Entity
public class Homme {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id ;
    @Column(length = 30, nullable = false)
    private  String firstname;
    @Column(length = 30, nullable = false)
    private  String  lastname;
}
