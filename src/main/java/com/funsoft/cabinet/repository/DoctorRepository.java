package com.funsoft.cabinet.repository;

import com.funsoft.cabinet.entities.Doctor;
import com.funsoft.cabinet.entities.Speciality;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface DoctorRepository extends  CrudRepository <Doctor,Long> {

    // select d from Doctor d where  d.Speciality = :speciality  JPQL ---> SQL
    public List<Doctor> findBySpeciality(Speciality speciality);

    // select d from Doctor d where  d.Firstname = :firstname  JPQL ---> SQL
    public List<Doctor> findByFirstname(String firstname);


    // select d from Doctor d where  d.Firstname = :firstname OR d.Lastname = :lastname JPQL ---> SQL
    public List<Doctor> findByFirstnameOrLastname(String firstname,String lastname );


    @Query(value = " Select d FROM Doctor d WHERE d.speciality = :spec AND " + "(d.firstname LIKE :pseudo OR d.lastname LIKE :pseudo)")
    public List<Doctor> search(@Param("spec") Speciality speciality, @Param("pseudo") String pseudo);
  






 // @Override
   // public List<Doctor> search(@Param("spec") Speciality speciality, @Param("pseudo") String pseudo,@Param("pseudo1") String pseudo1);
}
