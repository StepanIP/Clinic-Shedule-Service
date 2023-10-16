package org.example.service.impl;

import org.example.model.Schedule;
import org.example.repository.ScheduleRepository;
import org.example.service.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ScheduleServiceImpl implements ScheduleService {
    private final ScheduleRepository scheduleRepository;

    @Autowired
    public ScheduleServiceImpl(ScheduleRepository scheduleRepository) {
        this.scheduleRepository = scheduleRepository;
    }

    @Override
    public Schedule create(Schedule schedule) {
        return scheduleRepository.save(schedule);
    }

    @Override
    public Schedule readById(Long scheduleId) {
        return scheduleRepository.findById(scheduleId).orElse(null);
    }

    @Override
    public Schedule update(Schedule schedule) {
        return scheduleRepository.save(schedule);
    }

    @Override
    public void delete(Schedule schedule) {
        scheduleRepository.delete(schedule);
    }

    @Override
    public List<Schedule> getAll() {
        return scheduleRepository.findAll();
    }
}
