package com.example.FIFA.dto;

import com.example.FIFA.dao.StatisticsDao;
import com.example.FIFA.model.StatisticsModel;
import lombok.Data;

import java.util.List;

@Data
public class AllPlayerStatisticsDto
{
    List<StatisticsModel> allPlayerList;
    boolean status;
    String message;
}
