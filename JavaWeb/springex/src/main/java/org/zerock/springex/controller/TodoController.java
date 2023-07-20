package org.zerock.springex.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.zerock.springex.dto.TodoDTO;

@Controller
@RequestMapping("/todo")
@Log4j2
public class TodoController {

    @RequestMapping("/list")  // 특정한 경로의 요청(Request)을 지정하기 위해 사용
    public void list() {
        log.info("todo list......");
    }

    // @RequestMapping(value = "/register", method = RequestMethod.GET)
    @GetMapping("/register")
    public void registerGET() {
        log.info("GET todo register.......");
    }

    @PostMapping("/register")
    public void registerPost(TodoDTO todoDTO) {
        log.info("POST todo register.....");
        log.info(todoDTO);
    }

}
