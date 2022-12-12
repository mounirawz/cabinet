package com.funsoft.cabinet.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Employe implements  Serializable{



        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long id;

        @Column(length = 30, nullable = false)
        private String firstname;




        @ManyToOne
        @JoinColumn(name = "projet_id",referencedColumnName = "id")
        private Projet projet;

}
