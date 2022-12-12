package com.funsoft.cabinet.entities;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Data
public class Projet {



        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long id;

        @Column(length = 30, nullable = false)
        private String firstname;

        @OneToMany(mappedBy = "projet",fetch = FetchType.LAZY )
        private List<Employe> employeList;

    }

