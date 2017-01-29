package com.yb.team.project.dao;

import com.yb.team.project.model.DeviceTable;
import com.yb.team.project.model.DeviceTableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public interface DeviceTableMapper {
    int countByExample(DeviceTableExample example);

    int deleteByExample(DeviceTableExample example);

    int deleteByPrimaryKey(Integer deviceId);

    int insert(DeviceTable record);

    int insertSelective(DeviceTable record);

    List<DeviceTable> selectByExample(DeviceTableExample example);

    DeviceTable selectByPrimaryKey(Integer deviceId);

    int updateByExampleSelective(@Param("record") DeviceTable record, @Param("example") DeviceTableExample example);

    int updateByExample(@Param("record") DeviceTable record, @Param("example") DeviceTableExample example);

    int updateByPrimaryKeySelective(DeviceTable record);

    int updateByPrimaryKey(DeviceTable record);
}