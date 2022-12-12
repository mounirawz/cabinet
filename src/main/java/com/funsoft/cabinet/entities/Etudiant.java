package com.funsoft.cabinet.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.List;


@Entity
@Data
public class Etudiant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(length = 30, nullable = false)
    private String firstname;

    @ManyToMany(mappedBy = "participant",fetch = FetchType.LAZY)
    private List<Evenement>  enenementList;
}

