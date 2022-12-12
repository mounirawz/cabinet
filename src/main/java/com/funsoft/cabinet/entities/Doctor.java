package com.funsoft.cabinet.entities;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

//pojo ------->Entity
@Getter
@Setter
@Data
@Entity
@Table(name = "doctors" )
public class Doctor implements Serializable {

     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private long id ;
     @Column(length = 30, nullable = false)
     private  String firstname;
     @Column(length = 30, nullable = false)
     private  String  lastname;
     @Column(nullable = false,unique = true)
     private  String  email;
     @Column(nullable = false)
     private  String address ;
     @Enumerated(EnumType.STRING)
     private  Speciality speciality;

     @OneToMany(mappedBy = "doctor",fetch = FetchType.LAZY,cascade = {CascadeType.REMOVE,CascadeType.PERSIST})
     private List<Appointment> appointmentList ;



     public Doctor() {
     }

     public long getId() {
          return id;
     }

     public void setId(long id) {
          this.id = id;
     }

     public String getFirstname() {
          return firstname;
     }

     public void setFirstname(String firstname) {
          this.firstname = firstname;
     }

     public String getLastname() {
          return lastname;
     }

     public void setLastname(String lastname) {
          this.lastname = lastname;
     }

     public String getEmail() {
          return email;
     }

     public void setEmail(String email) {
          this.email = email;
     }

     public String getAddress() {
          return address;
     }

     public void setAddress(String address) {
          this.address = address;
     }

     public Speciality getSpeciality() {
          return speciality;
     }

     public void setSpeciality(Speciality speciality) {
          this.speciality = speciality;
     }
}
