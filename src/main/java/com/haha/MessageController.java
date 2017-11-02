package com.haha;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by xupanpan on 19/07/2017.
 */
@RestController
public class MessageController {

    @RequestMapping("/msg")
    public Message getMessge(){

        System.out.println(System.currentTimeMillis());
        Message message = new Message();
        message.id = 12343334;
        message.msg = "dd5555dd";
        return message;
    }



}
