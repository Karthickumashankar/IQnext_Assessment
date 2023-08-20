package com.example.FIFA.dto;

import com.example.FIFA.model.DefenceModel;
import com.example.FIFA.model.StatisticsModel;
import lombok.Data;

@Data
public class CommonResponseDefenceDto
{
    DefenceModel PlayerData;
    boolean status;
    String message;
}
