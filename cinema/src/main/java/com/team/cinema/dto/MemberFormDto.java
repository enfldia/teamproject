package com.team.cinema.dto;


import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
public class MemberFormDto {

    @NotBlank(message = "이름을 입력해주세요.")
    private String userName;

    private String birthday;

    @NotBlank (message = "휴대폰 번호는 필수값입니다.")
    private String phoneNB;

    @NotBlank(message = "아이디를 입력해주세요.")
    private String userId;

    @NotBlank(message = "비밀번호를 입력해주세요.")
    private String password;

    @NotBlank(message = "이메일은 필수값입니다.")
    private String email;


}
