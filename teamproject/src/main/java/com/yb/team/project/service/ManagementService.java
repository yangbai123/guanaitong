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
    public List<String> roomSearch(int companyId){
        return managementMapper.roomSearch(companyId);
    }
    public List<RoomMessage> roomMessage(String name,int companyId){
        return  managementMapper.roomMessage(name,companyId);
    }
    public int roomIdSearch(String room,int companyId){
        return managementMapper.roomIdSearch(room,companyId);
    }
}
