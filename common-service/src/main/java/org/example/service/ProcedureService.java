package org.example.service;

import org.example.model.Procedure;

import java.util.List;

public interface ProcedureService {
    Procedure create(Procedure procedure);
    Procedure readById(Long procedureId);
    Procedure update(Procedure procedure);
    void delete(Procedure procedure);
    List<Procedure> getAll();
}
