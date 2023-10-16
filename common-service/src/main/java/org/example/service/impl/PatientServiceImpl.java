package org.example.service.impl;

import org.example.model.Patient;
import org.example.repository.PatientRepository;
import org.example.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PatientServiceImpl implements PatientService {
    private final PatientRepository patientRepository;

    @Autowired
    public PatientServiceImpl(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    @Override
    public Patient create(Patient patient) {
        return patientRepository.save(patient);
    }

    @Override
    public Patient readById(Long patientId) {
        return patientRepository.findById(patientId).orElse(null);
    }

    @Override
    public Patient update(Patient patient) {
        return patientRepository.save(patient);
    }

    @Override
    public void delete(Patient patient) {
        patientRepository.delete(patient);
    }

    @Override
    public List<Patient> getAll() {
        return patientRepository.findAll();
    }
}
