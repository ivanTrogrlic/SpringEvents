package com.demo.spring.controller;

import com.demo.spring.entity.Event;
import com.demo.spring.entity.Statistics;
import com.demo.spring.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.sql.Date;
import java.util.Collection;

@RestController
@RequestMapping("/events")
public class EventController {

    @Autowired
    private EventService eventService;

    @GetMapping("/period")
    public Collection<Event> getEventsInPeriod(@RequestParam Date from, @RequestParam Date to) {
        return eventService.getEventByInterval(from, to);
    }

    @GetMapping("/statistics")
    public Statistics getEventStatisticsByInterval(@RequestParam Date from, @RequestParam Date to) {
        return null;
    }

    @DeleteMapping("/{id}")
    public void deleteEventById(@PathVariable("id") Long id) {
        eventService.removeEvent(id);
    }

    @PutMapping()
    public void updateEventById(@Valid @RequestBody Event event) {
        eventService.updateEvent(event);
    }

    @PostMapping()
    @PreAuthorize("hasRole('USER')")
    public void insertEvent(@Valid @RequestBody Event event) {
        eventService.insertEvent(event);
    }
}
