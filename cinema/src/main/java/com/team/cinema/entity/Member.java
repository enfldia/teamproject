package com.team.cinema.entity;

import com.team.cinema.constant.Role;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "member")
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "member_number")
    private Long userNB;

    @Column(unique = true)
    private String userName;

    private String birthday;

    @Column(unique = true)
    private String phoneNB;

    @Column(unique = true)
    private String userId;

    @Column
    private String password;

    @Column(unique = true)
    private String email;

    @Enumerated(EnumType.STRING)
    private Role role;

    private String snsId;




}
