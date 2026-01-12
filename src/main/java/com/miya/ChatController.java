package com.miya;

import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class ChatController {

    @PostMapping("/chat")
    public String chat(@RequestBody String userMsg) {
        return MiyaBrain.reply(userMsg);
    }
}
