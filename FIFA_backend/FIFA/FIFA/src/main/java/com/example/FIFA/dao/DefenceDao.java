package com.example.FIFA.dao;

import com.example.FIFA.model.DefenceModel;
import com.example.FIFA.model.DefenceModel;

import java.util.List;

public interface DefenceDao
{
    List<DefenceModel> getAllPlayerDefence();

    DefenceModel getPlayerDefenceById(Long id);
    List<DefenceModel> getPlayerDefenceByPosition(String position);

    List<DefenceModel> getPlayerDefenceByTeam(String team);

    List<DefenceModel> getPlayerDefenceByTackles(Integer tackles);

    List<DefenceModel> getPlayerDefenceByTacklesWon(Integer tacklesWon);
}
