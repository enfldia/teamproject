package com.team.cinema.controller;

import com.team.cinema.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class MemberController {

    // 필드 주입
    private final MemberService memberService;

    @GetMapping(value = "/memeber/new")
    public String memberForm() {

        return "member/memberForm";
    }
}
