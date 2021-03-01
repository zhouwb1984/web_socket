package com.zcode.web_socket.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/ws/")
public class WebSocketController {

    @GetMapping("/hello")
    public String hello() {
        return "hello webSocket";
    }

    @GetMapping("/demo")
    public ModelAndView clientDemo() {
        ModelAndView view = new ModelAndView("client_demo");
        return view;
    }

}
