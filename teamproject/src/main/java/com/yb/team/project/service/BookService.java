package com.yb.team.project.service;

import com.yb.team.project.dao.PredestineMapper;
import com.yb.team.project.model.Predestine;
import com.yb.team.project.model.ShowParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/2/16.
 */
@Service
public class BookService {
    @Autowired
    PredestineMapper predestineMapper;
    public List<ShowParam> bookSearch(String date){
        return  predestineMapper.getBookByDate(date);
    }
}
