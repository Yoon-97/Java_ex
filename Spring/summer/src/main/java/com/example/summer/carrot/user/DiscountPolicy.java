package com.example.summer.carrot.user;

import org.springframework.stereotype.Component;

@Component
public interface DiscountPolicy {
    /**
     * 껍데기만 같으니 인터페이스 사용
     * Service에서 타입 역할을 해줄 껍데기
     */
    int getPolicy();
}

@Component
class DiscountMemberPolicy implements DiscountPolicy {

    //회원 등급별 할인
    public int getPolicy() {
        return 1;
    }
}

@Component
class DiscountNotMemberPolicy implements DiscountPolicy {

    //비회원 선착순 할인
    public int getPolicy() {
        return 0;
    }
}