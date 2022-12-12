package com.funsoft.cabinet.entities;

import lombok.Data;
import org.springframework.boot.autoconfigure.web.WebProperties;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;


@Data
@Entity
public class Patient {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;

    @Column(length = 30, nullable = false)
    private  String firstname;
    @Column(length = 30, nullable = false)
    private  String  lastname;
    @Column(length = 8, nullable = false)
    private String phone;

    @OneToMany(mappedBy = "patient",fetch = FetchType.LAZY,cascade = {CascadeType.REMOVE,CascadeType.PERSIST})
    private List<Appointment> appointmentList ;

    private boolean status;


}
