package com.funsoft.cabinet.service;

import com.funsoft.cabinet.entities.Doctor;
import com.funsoft.cabinet.entities.Speciality;
import org.hibernate.type.LongType;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
@Service
public interface DoctorService {

    public Doctor Save(Doctor doctor);

    public Doctor getDoctor(Long id);

    public List<Doctor> getDoctor();


    public Map<String,Boolean> deleteDoctor(long id);


    public List<Doctor> SearchByFirstname(String firstname);

    public List<Doctor> SearchByFirstnameOrLastname(String name);

    public List<Doctor> SearchBySpeciality(Speciality speciality);

    public List<Doctor> advancedSearch(Speciality speciality,String pseudo);

}
