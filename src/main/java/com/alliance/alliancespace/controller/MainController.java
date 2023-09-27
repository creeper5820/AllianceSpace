package com.alliance.alliancespace.controller;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Slf4j
@Controller
public class MainController
{
    @Data
    public static class Student
    {
        int user_id;
        String user_name;
        String user_password;
        String user_docker_id;
    }

    @RequestMapping("/index")
    @ResponseBody
    public String index()
    {

        log.error("-User enter this page called index-");

        return "Hello World!!";
    }

    @RequestMapping("/student")
    @ResponseBody
    public Student student()
    {
        Student user = new Student();
        user.setUser_id(114514);
        user.setUser_name("Lisii");
        user.setUser_password("zxcvbnm");
        user.setUser_docker_id("57928593");

        return user;
    }
}
