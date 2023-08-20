package com.example.FIFA.dao;

import com.example.FIFA.model.StatisticsModel;

import java.util.List;

public interface StatisticsDao {
    List<StatisticsModel> getAllPlayerStatistics();

    StatisticsModel getPlayerStatisticsById(Long id);

    List<StatisticsModel> getPlayerStatisticsByGames(Integer games);

    List<StatisticsModel> getPlayerStatisticsByBirthYear(Integer birthYear);

    List<StatisticsModel> getPlayerStatisticsByMinutes(Integer minutes);

    List<StatisticsModel> getPlayerStatisticsByGoals(Integer goals);
}
