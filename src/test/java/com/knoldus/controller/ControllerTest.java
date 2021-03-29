package com.knoldus.controller;

import org.junit.jupiter.api.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class ControllerTest {

    @Test
    void getController() {
        String s = "Running, ";
        String t = new SimpleDateFormat("kk:mm:ss").format(new Date());
        Controller controller = new Controller();
        assertEquals(s+t, controller.getController());
    }
}