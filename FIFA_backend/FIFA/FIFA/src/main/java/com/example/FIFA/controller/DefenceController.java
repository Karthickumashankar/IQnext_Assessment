package com.example.FIFA.controller;

import com.example.FIFA.model.DefenceModel;
import com.example.FIFA.service.DefenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/fifa/api/v1/defence")
public class DefenceController {

    @Autowired
    private DefenceService defenseService;

    @GetMapping("/get-all-details")
    public ResponseEntity<?> getAllPlayerDefense() {
        return defenseService.getAllPlayerDefence();
    }

    @GetMapping("/get-by-id/{playerId}")
    public ResponseEntity<?> getPlayerDefenseById(@PathVariable String playerId) {
        return defenseService.getPlayerDefenceById(playerId);
    }
    @GetMapping("/apply-filter/get-by-position")
    public ResponseEntity<?> getPlayerDefenceByPosition(@RequestParam String position) {
        return defenseService.getPlayerDefenceByPosition(position);
    }

    @GetMapping("/apply-filter/get-by-team")
    public ResponseEntity<?> getPlayerDefenceByTeam(@RequestParam String team) {
        return defenseService.getPlayerDefenceByTeam(team);
    }
    @GetMapping("/apply-filter/get-by-tackles")
    public ResponseEntity<?> getPlayerDefenceByTackles(@RequestParam String tackles) {
        return defenseService.getPlayerDefenceByTackles(tackles);
    }
    @GetMapping("/apply-filter/get-by-tacklesWon")
    public ResponseEntity<?> getPlayerDefenceByTacklesWon(@RequestParam String tacklesWon) {
        return defenseService.getPlayerDefenceByTacklesWon(tacklesWon);
    }

}