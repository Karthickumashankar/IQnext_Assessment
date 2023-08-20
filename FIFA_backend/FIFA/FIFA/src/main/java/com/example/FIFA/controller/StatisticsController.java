package com.example.FIFA.controller;

import com.example.FIFA.model.StatisticsModel;
import com.example.FIFA.service.StatisticsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/fifa/api/v1/statistics")
public class StatisticsController {

    @Autowired
    private StatisticsService statisticsService;

    @GetMapping("/get-all-details")
    public ResponseEntity<?> getAllPlayerStatistics() {
        return statisticsService.getAllPlayerStatistics();
    }

    @GetMapping("/get-by-id/{playerId}")
    public  ResponseEntity<?> getPlayerStatisticsById(@PathVariable String playerId) {
        return statisticsService.getPlayerStatisticsById(playerId);
    }

    @GetMapping("/apply-filter/get-by-games")
    public ResponseEntity<?> getPlayerStatisticsByGames(@RequestParam String games) {
        return statisticsService.getPlayerStatisticsByGames(games);
    }

    @GetMapping("/apply-filter/get-by-birth-year")
    public ResponseEntity<?> getPlayerStatisticsByBirthYear(@RequestParam String birthYear) {
        return statisticsService.getPlayerStatisticsByBirthYear(birthYear);
    }
    @GetMapping("/apply-filter/get-by-minutes")
    public ResponseEntity<?> getPlayerStatisticsByMinutes(@RequestParam String minutes) {
        return statisticsService.getPlayerStatisticsByMinutes(minutes);
    }
    @GetMapping("/apply-filter/get-by-goals")
    public ResponseEntity<?> getPlayerStatisticsByGoals(@RequestParam String goals) {
        return statisticsService.getPlayerStatisticsByGoals(goals);
    }
}