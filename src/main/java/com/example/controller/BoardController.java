package com.example.controller;

import com.example.domain.BoardVO;
import com.example.service.BoardService;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.sql.ResultSet;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import java.util.stream.Collectors;

@Log4j
@RequestMapping("/board")
@AllArgsConstructor
@RestController
public class BoardController {
    private BoardService service;

    @GetMapping("/list")
    public List<BoardVO> list(Model model) {
        log.info("list");

        List<BoardVO> resultList = service.getList(); // 데이터베이스에서 가져온 List

        return resultList;
    }

    @PostMapping("/register")
    public Map<String, String> register(@RequestBody BoardVO board, RedirectAttributes rttr) {
        log.info("register: " + board);
        service.register(board);
//        rttr.addFlashAttribute("result", board.getBno());

        Map<String, String> result = new HashMap<>();

        result.put("message", "success");
        return result;
    }

    @GetMapping("/get")
    public BoardVO get(@RequestParam("bno") Long bno) {
        log.info("/get");
//        model.addAttribute("board", service.get(bno));

        return service.get(bno);
    }

    @PostMapping("/modify")
    public Map<String, String> modify(@RequestBody BoardVO board) {
        log.info("modify : " + board );

        service.modify(board);

        Map<String, String> result = new HashMap<>();

        result.put("message", "success");
        return result;
    }

    @PostMapping("/remove")
    public String remove(@RequestParam("bno") Long bno, RedirectAttributes rttr) {
        log.info("remove..." + bno);

        service.remove(bno);
//        if (service.remove(bno)) {
//            rttr.addFlashAttribute("result", "success");
//        }

        return "redirect:/board/list";
    }
}
