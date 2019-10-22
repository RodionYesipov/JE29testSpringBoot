package com.yesipov.controller;

import com.yesipov.model.Message;
import com.yesipov.repo.MessageRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@org.springframework.stereotype.Controller
public class Controller {
    @Autowired
    private MessageRepo messageRepo;

    @PostMapping
    public String addMessage(@RequestParam String title, @RequestParam String text, Map<String, Object> model) {
        Message message = new Message(title, text);

        messageRepo.save(message);

        Iterable<Message> messages = messageRepo.findAll();

        model.put("messages", messages);

        return "main";
    }

    @GetMapping
    public String showAll(Map<String, Object> model) {
        Iterable<Message> messages = messageRepo.findAll();

        model.put("messages", messages);

        return "main";
    }

    @GetMapping(value = "/getmessage")
    public String getMessage(@RequestParam(value = "title") String title,
                             @RequestParam(value = "text") String text,
                             Map<String, Object> model
    ) {
        Iterable<Message> messages = messageRepo.findByTitleAndText(title,text);

        model.put("messages", messages);

        return "mess";
    }
}
