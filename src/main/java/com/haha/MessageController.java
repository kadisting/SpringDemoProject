package com.haha;

import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by xupanpan on 19/07/2017.
 */
@RestController
@RequestMapping("/1.0")
public class MessageController {

    @RequestMapping(value = "/msg", method = RequestMethod.GET)
    public Message getMessge(@RequestParam("msg") String msg) {

        System.out.println(System.currentTimeMillis());
        Message message = new Message();
        message.id = 12343334;
        message.msg = msg;
        return message;
    }


}
