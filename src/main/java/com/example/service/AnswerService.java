package com.example.service;

import com.example.domain.AnswerVO;
import java.util.List;

public interface AnswerService {
    public void register(AnswerVO answer);

    public AnswerVO get(Long ano);

    public boolean modify(AnswerVO answer);
    public boolean remove(Long ano);

    public List<AnswerVO> getList();
}
