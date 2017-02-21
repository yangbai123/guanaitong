package com.yb.team.project.dao;


import com.yb.team.project.model.Predestine;
import com.yb.team.project.model.ShowParam;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface PredestineMapper {
    List<ShowParam> getBookByDate(String date,int companyId);
    List<ShowParam> bookByPerson(String date,String room,int companyId);
    int bookSuccess(Predestine predestine);
}