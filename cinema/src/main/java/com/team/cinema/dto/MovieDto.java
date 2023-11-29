package com.team.cinema.dto;

import lombok.Getter;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.sql.Time;
import java.util.Date;


@Getter
public class MovieDto {


    private Long movieNB;
    //영화 번호


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

