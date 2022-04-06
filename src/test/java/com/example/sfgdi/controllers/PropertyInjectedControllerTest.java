package com.example.sfgdi.controllers;

import com.example.sfgdi.services.ConstructorGreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyInjectedControllerTest {

    PropertyInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new PropertyInjectedController();

        controller.greetingService=new ConstructorGreetingServiceImpl();
    }

    @Test
    void greeting() {
        System.out.println(controller.getGreeting());
    }
}