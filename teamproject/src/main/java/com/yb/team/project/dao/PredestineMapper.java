package com.yb.team.project.dao;


import com.yb.team.project.model.ShowParam;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface PredestineMapper {
    List<ShowParam> getBookByDate(String date);

}