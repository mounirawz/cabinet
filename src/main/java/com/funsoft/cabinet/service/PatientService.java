package com.funsoft.cabinet.service;

import com.funsoft.cabinet.entities.Patient;

import java.util.List;
import java.util.Map;

public interface PatientService {

    public Patient save(Patient patient);

    public Patient update(Long id,Patient patient);

    public Map<String ,Boolean> delete(Long id);

    public Patient getPatient(Long id);

    public List<Patient> getPatients();

    public Patient findByPhone(String phone);


}
