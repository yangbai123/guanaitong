package com.yb.team.project.dao;

import com.yb.team.project.model.RoomMessage;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ManagementMapper {
    List<String> roomSearch();
    List<RoomMessage> roomMessage(String room);

}