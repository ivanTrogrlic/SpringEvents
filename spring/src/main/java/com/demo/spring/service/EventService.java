package com.demo.spring.service;

import com.demo.spring.entity.Event;
import com.demo.spring.entity.Statistics;
import com.demo.spring.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.Collection;

@Service
public class EventService {

    @Autowired
    private EventRepository eventRepository;

    public Collection<Event> getEventByInterval(Date from, Date to) {
        return this.eventRepository.findAll();
    }

    public Statistics getEventStatisticsByInterval(Date from, Date to) {
        return null;
    }

    public void insertEvent(Event event) {
        this.eventRepository.save(event);
    }

    public void updateEvent(Event event) {
        this.eventRepository.save(event);
    }

    public void removeEvent(Long eventId) {
        this.eventRepository.deleteById(eventId);
    }

}
