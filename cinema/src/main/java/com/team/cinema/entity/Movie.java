package com.team.cinema.entity;

import lombok.*;

import javax.persistence.*;
import java.sql.Time;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long movieNB;
    //영화 번호

    @Column(unique = true)
    private String movieNM;
    //영화 제목

    private Boolean screen;
    //상영 여부

    private Date releaseDT;
    //개봉일

    private Integer level;
    //상영 등급

    private Integer score;
    //평점

    private Time runTime;
    //상영시간
}
