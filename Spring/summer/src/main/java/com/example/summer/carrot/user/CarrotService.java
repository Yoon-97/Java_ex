package com.example.summer.carrot.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarrotService {

    DiscountPolicy discountPolicy;

    @Autowired
    public CarrotService(DiscountPolicy discountPolicy) {
        this.discountPolicy = discountPolicy;
    }

    public int calcDiscountPrice() {
        return discountPolicy.getPolicy();
    }
}

@Service
class MemberService extends CarrotService {

    public MemberService(DiscountPolicy discountMemberPolicy) {
        super(discountMemberPolicy);
    }
}

@Service
class NotMemberService extends CarrotService {

    public NotMemberService(DiscountPolicy discountNotMemberPolicy) {
        super(discountNotMemberPolicy);
    }

    public int calcDiscountPrice() {
        return discountPolicy.getPolicy();
    }

}