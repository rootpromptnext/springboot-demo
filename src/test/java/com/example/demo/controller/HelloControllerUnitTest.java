package com.example.demo.controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloControllerUnitTest {

    private final HelloController controller = new HelloController();

    @Test
    void testHello() {
        String response = controller.hello();
        assertEquals("Hello, Spring Boot!", response);
    }

    @Test
    void testGreetWithName() {
        String response = controller.greet("Prayag");
        assertEquals("Hello, Prayag!", response);
    }

    @Test
    void testGreetWithoutName() {
        String response = controller.greet(null);
        assertEquals("Hello, Guest!", response);

        response = controller.greet("");
        assertEquals("Hello, Guest!", response);
    }
}
