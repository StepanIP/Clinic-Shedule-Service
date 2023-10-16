package org.example.service;

import org.example.model.Patient;

import java.util.List;

public interface PatientService {
    Patient create(Patient patient);
    Patient readById(Long patientId);
    Patient update(Patient patient);
    void delete(Patient patient);
    List<Patient> getAll();
}
