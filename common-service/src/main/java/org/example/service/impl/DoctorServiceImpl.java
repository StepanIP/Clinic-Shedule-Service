package org.example.service.impl;

import org.example.model.Doctor;
import org.example.repository.DoctorRepository;
import org.example.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class DoctorServiceImpl implements DoctorService {
    private final DoctorRepository doctorRepository;

    @Autowired
    public DoctorServiceImpl(DoctorRepository doctorRepository) {
        this.doctorRepository = doctorRepository;
    }

    @Override
    public Doctor create(Doctor doctor) {
        return doctorRepository.save(doctor);
    }

    @Override
    public Doctor readById(Long doctorId) {
        return doctorRepository.findById(doctorId).orElse(null);
    }

    @Override
    public Doctor update(Doctor doctor) {
        return doctorRepository.save(doctor);
    }

    @Override
    public void delete(Doctor doctor) {
        doctorRepository.delete(doctor);
    }

    @Override
    public List<Doctor> getAll() {
        return doctorRepository.findAll();
    }
}
