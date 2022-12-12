package com.funsoft.cabinet.entities;

import javax.persistence.*;

@Entity
public class Femme {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id ;
    @Column(length = 30, nullable = false)
    private  String firstname;
    @Column(length = 30, nullable = false)
    private  String  lastname;
    @OneToOne
    private Homme conjoint;


}
