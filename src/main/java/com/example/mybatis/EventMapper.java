package com.example.mybatis;

import java.util.List;

public interface EventMapper {
    public List<Event> findAll();
    public void insert(Event event);
}

