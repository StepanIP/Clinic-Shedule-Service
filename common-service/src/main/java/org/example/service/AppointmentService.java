package org.example.service;

import org.example.model.Appointment;

import java.util.List;

public interface AppointmentService {
    Appointment create(Appointment appointment);
    Appointment readById(Long appointmentId);
    Appointment update(Appointment appointment);
    void delete(Appointment appointment);
    List<Appointment> getAll();
}
