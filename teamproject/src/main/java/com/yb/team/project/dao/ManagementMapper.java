package com.yb.team.project.dao;

import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ManagementMapper {
    List<String> roomSearch();

}