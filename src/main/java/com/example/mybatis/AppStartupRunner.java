package com.example.mybatis;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AppStartupRunner implements ApplicationRunner {

    private static final Logger logger = LoggerFactory.getLogger(AppStartupRunner.class);

    @Autowired
    private EventMapper eventMapper;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        List<Event> events = eventMapper.findAll();

        events.forEach(e -> System.out.println(e));
    }
}
