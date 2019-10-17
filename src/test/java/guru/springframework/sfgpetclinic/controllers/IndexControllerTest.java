package guru.springframework.sfgpetclinic.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IndexControllerTest {

    IndexController controller;

    @BeforeEach
    void setUp() {
        controller = new IndexController();
    }

    @Test
    void index() {
        //message  is displayed only if the test case fails
        assertEquals("index", controller.index());
        assertEquals("index", controller.index(), "Wrong View Returned");
        //the labmda  expression only happens when the assertion fails
        assertEquals("index", controller.index(), () -> "Another Expensive Message " +
                "Make me only if you have to");
    }

    @Test
    void oupsHandler() {
        //the labmda  expression only happens when the assertion fails
        assertTrue("notimplemented".equals(controller.oupsHandler()), () -> "This is some expensive " +
                "Message to build" +
                "for my test");
    }
}