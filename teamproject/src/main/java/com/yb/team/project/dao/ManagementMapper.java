package com.yb.team.project.dao;

import com.yb.team.project.model.Management;
import com.yb.team.project.model.ManagementExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;


@Repository
public interface ManagementMapper {
    int countByExample(ManagementExample example);

    int deleteByExample(ManagementExample example);

    int deleteByPrimaryKey(Integer meetingRoomid);

    int insert(Management record);

    int insertSelective(Management record);

    List<Management> selectByExample(ManagementExample example);

    Management selectByPrimaryKey(Integer meetingRoomid);

    int updateByExampleSelective(@Param("record") Management record, @Param("example") ManagementExample example);

    int updateByExample(@Param("record") Management record, @Param("example") ManagementExample example);

    int updateByPrimaryKeySelective(Management record);

    int updateByPrimaryKey(Management record);
}