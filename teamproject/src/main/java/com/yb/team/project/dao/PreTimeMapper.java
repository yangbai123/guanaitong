package com.yb.team.project.dao;

import com.yb.team.project.model.PreTime;
import com.yb.team.project.model.PreTimeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PreTimeMapper {
    int countByExample(PreTimeExample example);

    int deleteByExample(PreTimeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PreTime record);

    int insertSelective(PreTime record);

    List<PreTime> selectByExample(PreTimeExample example);

    PreTime selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PreTime record, @Param("example") PreTimeExample example);

    int updateByExample(@Param("record") PreTime record, @Param("example") PreTimeExample example);

    int updateByPrimaryKeySelective(PreTime record);

    int updateByPrimaryKey(PreTime record);
}