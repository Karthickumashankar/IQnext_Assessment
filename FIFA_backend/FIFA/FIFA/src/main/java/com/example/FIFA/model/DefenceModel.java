package com.example.FIFA.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="player_defence")
public class DefenceModel {
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

        @Column(name = "birth_year")
        private Integer birthYear;

        @Column(name = "minutes_90s")
        private Double minutes90s;

        @Column(name = "tackles")
        private Integer tackles;

        @Column(name = "tackles_won")
        private Integer tacklesWon;

        @Column(name = "tackles_def_3rd")
        private Integer tacklesDef3rd;

        @Column(name = "tackles_mid_3rd")
        private Integer tacklesMid3rd;

        @Column(name = "tackles_att_3rd")
        private Integer tacklesAtt3rd;

        @Column(name = "dribble_tackles")
        private Integer dribbleTackes;

        @Column(name = "dribbles_vs")
        private Integer dribblesVs;

        @Column(name = "dribble_tackles_pct")
        private Double dribbleTacklesPct;

        @Column(name = "dribbled_past")
        private Integer dribbledPast;

        @Column(name = "blocks")
        private Integer blocks;

        @Column(name = "blocked_shots")
        private Integer blockedShots;

        @Column(name = "blocked_passes")
        private Integer blockedPasses;

        @Column(name = "interceptions")
        private Integer interceptions;

        @Column(name = "tackles_interceptions")
        private Integer tacklesInterceptions;

        @Column(name = "clearances")
        private Integer clearances;

        @Column(name = "errors")
        private Integer errors;
}
