package com.yb.team.project.service;

import com.yb.team.project.dao.ManagementMapper;
import com.yb.team.project.model.RoomMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/2/16.
 */
@Service
public class ManagementService {
    @Autowired
    ManagementMapper managementMapper;
    public List<String> roomSearch(){
        return managementMapper.roomSearch();
    }
    public List<RoomMessage> roomMessage(String name){
        return  managementMapper.roomMessage(name);
    }
    public int roomIdSearch(String room){
        return managementMapper.roomIdSearch(room);
    }
}
