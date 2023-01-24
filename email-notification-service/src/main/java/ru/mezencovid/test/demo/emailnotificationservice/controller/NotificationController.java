package ru.mezencovid.test.demo.emailnotificationservice.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log4j2
@RequestMapping("/email")
public class NotificationController {

    @PostMapping("/notification")
    public String notification(){
        log.info("email was sent");
        return "Чекай логи, уведомление отпралено!";
    }

}
