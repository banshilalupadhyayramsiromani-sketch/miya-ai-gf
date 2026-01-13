package com.miya.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class ChatController {

    @PostMapping("/chat")
    public String chat(@RequestBody String message) {

        if(message.toLowerCase().contains("love")) {
            return "Miya 💖: Tum ho toh sab perfect lagta hai";
        }

        if(message.toLowerCase().contains("miss")) {
            return "Miya 😘: Main toh hamesha tumhare saath hoon";
        }

        return "Miya 😊: Batao jaan, kya baat hai?";
    }
}
