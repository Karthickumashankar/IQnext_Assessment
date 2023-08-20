package com.example.FIFA.dto;

import com.example.FIFA.model.DefenceModel;
import com.example.FIFA.model.StatisticsModel;
import lombok.Data;

import java.util.List;

@Data
public class CommonResponseObject {
    StatisticsModel PlayerData;
    boolean status;
    String message;
}
