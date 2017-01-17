package com.yb.team.project.dao;

import com.yb.team.project.model.MeetdevTable;
import com.yb.team.project.model.MeetdevTableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MeetdevTableMapper {
    int countByExample(MeetdevTableExample example);

    int deleteByExample(MeetdevTableExample example);

    int deleteByPrimaryKey(Integer associateId);

    int insert(MeetdevTable record);

    int insertSelective(MeetdevTable record);

    List<MeetdevTable> selectByExample(MeetdevTableExample example);

    MeetdevTable selectByPrimaryKey(Integer associateId);

    int updateByExampleSelective(@Param("record") MeetdevTable record, @Param("example") MeetdevTableExample example);

    int updateByExample(@Param("record") MeetdevTable record, @Param("example") MeetdevTableExample example);

    int updateByPrimaryKeySelective(MeetdevTable record);

    int updateByPrimaryKey(MeetdevTable record);
}