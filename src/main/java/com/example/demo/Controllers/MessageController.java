package com.example.demo.Controllers;

import com.example.demo.Models.Message;
import com.example.demo.Repositories.MessageRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("api/message/")
public class MessageController {

    @Autowired
    private  MessageRepository messageRepository;

    @GetMapping("print/{message}/{owner}")
    public Message printMessage(@PathVariable String message,@PathVariable String owner) {
        return new Message(null,message,owner);
    }


    @GetMapping("save")
    public String addMessage(){
        Message message = new Message();
        message.setOwner("salah-eddine");
        message.setMessage("hello salah");
        messageRepository.save(message);
        return "Message saved";
    }

    @GetMapping("all")
    public List<Message> allMessages(){

        return messageRepository.findAll();
    }



}
