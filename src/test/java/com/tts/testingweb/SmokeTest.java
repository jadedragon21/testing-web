package com.tts.testingweb;

import static org.assertj.core.api.Assertions.assertThat;

import com.tts.testingweb.controller.HomeController;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SmokeTest {
    @BeforeEach
    void beforeEachTest(){
        System.out.println("Test is running....");
    }
    @AfterEach
    void afterEachTest(){
        System.out.println("Test has resolved.");
    }
    @Autowired
    private HomeController controller;

    @Test
    public void contextLoads() throws Exception {
        assertThat(controller).isNotNull();
    }
}