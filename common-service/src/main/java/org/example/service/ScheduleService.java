package org.example.service;

import org.example.model.Schedule;

import java.util.List;

public interface ScheduleService {
    Schedule create(Schedule schedule);
    Schedule readById(Long scheduleId);
    Schedule update(Schedule schedule);
    void delete(Schedule schedule);
    List<Schedule> getAll();
}
