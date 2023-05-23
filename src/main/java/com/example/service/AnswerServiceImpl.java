package com.example.service;

import com.example.domain.AnswerVO;
import com.example.mapper.AnswerMapper;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Log4j
@Service
public class AnswerServiceImpl implements AnswerService {

    private final AnswerMapper mapper;

    @Autowired
    public AnswerServiceImpl(AnswerMapper answerMapper) {
        this.mapper = answerMapper;
    }

    @Override
    public void register(AnswerVO answer) {
        log.info("register......" + answer);

        mapper.insertSelectKey(answer);
    }

    @Override
    public AnswerVO get(Long ano) {
        log.info("get........" + ano);

        return mapper.read(ano);
    }

    @Override
    public boolean modify(AnswerVO answer) {
        log.info("modify........" + answer);

        return mapper.update(answer) == 1;
    }

    @Override
    public boolean remove(Long ano) {
        log.info("remove......." + ano);

        return mapper.delete(ano) == 1;
    }

    @Override
    public List<AnswerVO> getList() {
        log.info("getList..........");

        return mapper.getList();
    }
}
