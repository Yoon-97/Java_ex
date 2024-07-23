package com.example.summer.user;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    UserRepository userRepository = new UserRepository();

    public String signIn(User user) {
        User loginUser = userRepository.findById(user.getId());
        if (loginUser.getPassword().equals(user.getPassword())) {
            return loginUser.getName();
        }
        return "회원이 존재하지 않습니다.";
    }

    public String signUp(SignupUserDto signupUserDto) {
        return userRepository.save(signupUserDto.convertToUser());
    }

}
