package com.example.FIFA.dto;

import com.example.FIFA.dao.StatisticsDao;
import com.example.FIFA.model.DefenceModel;
import lombok.Data;

import java.util.List;

@Data
public class AllPlayerDefenceDto
{
    List<DefenceModel> allPlayerList;
    boolean status;
    String message;
}
