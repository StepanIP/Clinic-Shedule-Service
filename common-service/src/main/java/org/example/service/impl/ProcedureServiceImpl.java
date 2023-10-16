package org.example.service.impl;

import org.example.model.Procedure;
import org.example.repository.ProcedureRepository;
import org.example.service.ProcedureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProcedureServiceImpl implements ProcedureService {
    private final ProcedureRepository procedureRepository;

    @Autowired
    public ProcedureServiceImpl(ProcedureRepository procedureRepository) {
        this.procedureRepository = procedureRepository;
    }

    @Override
    public Procedure create(Procedure procedure) {
        return procedureRepository.save(procedure);
    }

    @Override
    public Procedure readById(Long procedureId) {
        return procedureRepository.findById(procedureId).orElse(null);
    }

    @Override
    public Procedure update(Procedure procedure) {
        return procedureRepository.save(procedure);
    }

    @Override
    public void delete(Procedure procedure) {
        procedureRepository.delete(procedure);
    }

    @Override
    public List<Procedure> getAll() {
        return procedureRepository.findAll();
    }
}
