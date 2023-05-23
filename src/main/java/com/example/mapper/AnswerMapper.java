package com.example.mapper;

import com.example.domain.AnswerVO;

import java.util.List;

public interface AnswerMapper {
    public List<AnswerVO> getList();

    public void insert(AnswerVO answer);

    public void insertSelectKey(AnswerVO answer);

    public AnswerVO read(Long ano);

    public int delete(Long ano);

    public int update(AnswerVO answer);
}
