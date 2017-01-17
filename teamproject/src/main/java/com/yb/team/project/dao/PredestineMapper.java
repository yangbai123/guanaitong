package com.yb.team.project.dao;

import com.yb.team.project.model.Predestine;
import com.yb.team.project.model.PredestineExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PredestineMapper {
    int countByExample(PredestineExample example);

    int deleteByExample(PredestineExample example);

    int deleteByPrimaryKey(Integer meetingId);

    int insert(Predestine record);

    int insertSelective(Predestine record);

    List<Predestine> selectByExample(PredestineExample example);

    Predestine selectByPrimaryKey(Integer meetingId);

    int updateByExampleSelective(@Param("record") Predestine record, @Param("example") PredestineExample example);

    int updateByExample(@Param("record") Predestine record, @Param("example") PredestineExample example);

    int updateByPrimaryKeySelective(Predestine record);

    int updateByPrimaryKey(Predestine record);
}