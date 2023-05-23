package com.example.apiserver;

import com.example.mapper.BoardMapper;
import com.example.service.BoardService;
import lombok.extern.log4j.Log4j;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@Log4j
@SpringBootTest
@RunWith(SpringRunner.class)
@ContextConfiguration(locations = {"classpath:/root-context.xml"})
class ApiServerApplicationTests {

    private final BoardService service;

    @Autowired
    public ApiServerApplicationTests(BoardService service) {
        this.service = service;
    }

    @Test
    void contextLoads() {
        log.info(service.getList());
    }

}
