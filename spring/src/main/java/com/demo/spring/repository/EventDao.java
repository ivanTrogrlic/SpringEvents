package com.demo.spring.repository;

import com.demo.spring.entity.Event;
import com.demo.spring.entity.Statistics;

import java.sql.Date;
import java.util.Collection;

public interface EventDao {

    Collection<Event> getEventByInterval(Date from, Date to);

    Statistics getEventStatisticsByInterval(Date from, Date to);

    void removeEventById(int id);

    void updateEvent(Event student);

    void insertEvent(Event event);

}
