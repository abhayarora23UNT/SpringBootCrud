package com.example.demo.controllers;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoggingController {
    Logger log= LoggerFactory.getLogger(LoggingController.class);

    @RequestMapping("/logs/print")
    public String displayLogs() {

        log.info("This is an info log");
        log.debug("This is an debug log");
        log.error("This is an error log");
        return "Logs have printed in the terminal";
    }
}
