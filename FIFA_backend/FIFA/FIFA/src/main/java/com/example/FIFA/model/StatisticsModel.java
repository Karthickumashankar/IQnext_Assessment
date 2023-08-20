package com.example.FIFA.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="player_stats")
public class StatisticsModel {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column(name = "player")
        private String player;

        @Column(name = "position")
        private String position;

        @Column(name = "team")
        private String team;

        @Column(name = "age")
        private String age;

        @Column(name = "club")
        private String club;

        @Column(name = "birth_year")
        private Integer birthYear;

        @Column(name = "games")
        private Integer games;

        @Column(name = "games_starts")
        private Integer gamesStarts;

        @Column(name = "minutes")
        private Integer minutes;

        @Column(name = "minutes_90s")
        private Double minutes90s;

        @Column(name = "goals")
        private Integer goals;

        @Column(name = "assists")
        private Integer assists;

        @Column(name = "goals_pens")
        private Integer goalsPens;

        @Column(name = "pens_made")
        private Integer pensMade;

        @Column(name = "pens_att")
        private Integer pensAtt;

        @Column(name = "cards_yellow")
        private Integer cardsYellow;

        @Column(name = "cards_red")
        private Integer cardsRed;

        @Column(name = "goals_per90")
        private Double goalsPer90;

        @Column(name = "assists_per90")
        private Double assistsPer90;

        @Column(name = "goals_assists_per90")
        private Double goalsAssistsPer90;

        @Column(name = "goals_pens_per90")
        private Double goalsPensPer90;

        @Column(name = "goals_assists_pens_per90")
        private Double goalsAssistsPensPer90;

        @Column(name = "xg")
        private Double xg;

        @Column(name = "npxg")
        private Double npxg;

        @Column(name = "xg_assist")
        private Double xgAssist;

        @Column(name = "npxg_xg_assist")
        private Double npxgXgAssist;

        @Column(name = "xg_per90")
        private Double xgPer90;

        @Column(name = "xg_assist_per90")
        private Double xgAssistPer90;

        @Column(name = "xg_xg_assist_per90")
        private Double xgXgAssistPer90;

        @Column(name = "npxg_per90")
        private Double npxgPer90;

        @Column(name = "npxg_xg_assist_per90")
        private Double npxgXgAssistPer90;

}


