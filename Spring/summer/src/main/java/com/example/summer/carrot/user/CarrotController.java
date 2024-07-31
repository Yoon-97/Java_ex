package com.example.summer.carrot.user;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/carrot")
public class CarrotController {

    private final int MEMBER = 1;

    private final MemberService memberService;
    private final NotMemberService notMemberService;

    public CarrotController(MemberService memberService, NotMemberService notMemberService) {
        this.memberService = memberService;
        this.notMemberService = notMemberService;
    }

    @GetMapping(value = "/{id}")
    public int calcDiscountPrice(@PathVariable int id) {
        if (isMember(id)) return memberService.calcDiscountPrice();
        else return notMemberService.calcDiscountPrice();
    }

    private boolean isMember(int id) {
        return id == MEMBER;
    }

}
