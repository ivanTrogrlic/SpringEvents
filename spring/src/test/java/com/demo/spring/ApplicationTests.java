package com.demo.spring;

import com.demo.spring.controller.EventController;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = Application.class)
@WebMvcTest(EventController.class)
public class ApplicationTests {

    @Test
    @Ignore
    public void contextLoads() {
    }

}
