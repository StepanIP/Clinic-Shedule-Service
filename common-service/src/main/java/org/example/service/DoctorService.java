package org.example.service;

import org.example.model.Doctor;

import java.util.List;

public interface DoctorService {
    Doctor create(Doctor doctor);
    Doctor readById(Long doctorId);
    Doctor update(Doctor doctor);
    void delete(Doctor doctor);
    List<Doctor> getAll();
}
