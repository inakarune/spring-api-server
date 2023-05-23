package com.example.controller;

import com.example.service.AnswerService;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Log4j
@RequestMapping("/answer")
@AllArgsConstructor
@RestController
public class AnswerController {
    private AnswerService answerService;


}
