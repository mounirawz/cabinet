package com.funsoft.cabinet.service;

import com.funsoft.cabinet.entities.Doctor;
import com.funsoft.cabinet.entities.Speciality;
import com.funsoft.cabinet.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

//@Service
public class DoctorServiceImpl implements DoctorService{

    @Autowired
    DoctorRepository doctorRepository;


    @Override
    public Doctor Save(Doctor doctor) {
        return doctorRepository.save(doctor);
    }

    @Override
    public Doctor getDoctor(Long id) {
        return doctorRepository.findById(id).get();
    }

    @Override
    public List<Doctor> getDoctor() {
        return (List<Doctor>) doctorRepository.findAll();
    }

    @Override
    public Map<String, Boolean> deleteDoctor(long id) {
        doctorRepository.deleteById(id);
        Map<String, Boolean> res = new HashMap<>();
        res.put("deleted",Boolean.TRUE);
        return res;
    }

    @Override
    public List<Doctor> SearchByFirstname(String firstname) {
        return doctorRepository.findByFirstname(firstname);
    }

    @Override
    public List<Doctor> SearchByFirstnameOrLastname(String name) {
        return doctorRepository.findByFirstnameOrLastname(name,name);
    }

    @Override
    public List<Doctor> SearchBySpeciality(Speciality speciality) {
        return doctorRepository.findBySpeciality(speciality);
    }

    @Override
    public List<Doctor> advancedSearch(Speciality speciality, String pseudo) {
        return doctorRepository.search(speciality,pseudo);
    }

}
