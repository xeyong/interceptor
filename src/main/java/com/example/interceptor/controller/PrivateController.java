package com.example.interceptor.controller;

import com.example.interceptor.annotation.Auth;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/private")
@Auth//custom annotation을 활용해서 인터셉터에서 @Auth가 붙어있으면 세션을 검사해서 있을때만 통과시킴
@Slf4j
public class PrivateController {

    @GetMapping("/hello")
    public String hello(){
        log.info("private hello controller");
        return  "private hello";
    }
}
