package com.jvhuaxia.testspring.session.test_spring_session.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;


@RestController
public class UserController {

    @Value("${server.port}")
    Integer port;

    @RequestMapping("/get")
    public String get(HttpSession httpSession) {
        System.out.println("get" + port);
        return httpSession.getAttribute("userName").toString();
    }

    @RequestMapping("/set")
    public void set(HttpSession httpSession) {
        System.out.println("set" + port);
        httpSession.setAttribute("userName", ("JJJ" + port));
    }

}
