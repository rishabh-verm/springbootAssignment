package com.knoldus.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
@RequestMapping(path = "/status")
public class Controller {

    /**
     * Gets controller.
     *
     * @return the string and current time as output.
     */
    @GetMapping
    public String getController() {
        return "Running, "
                + new SimpleDateFormat("kk:mm:ss").format(new Date());
    }
}
