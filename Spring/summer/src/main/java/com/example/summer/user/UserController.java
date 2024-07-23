package com.example.summer.user;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    UserService userService = new UserService();

    @RequestMapping(value = "/sign-up", method = RequestMethod.POST)
    public HttpEntity<String> singUp(@RequestBody SignupUserDto signupUserDto) {
        return new ResponseEntity<>(userService.signUp(signupUserDto), HttpStatus.CREATED);
    }

    @RequestMapping(value = "/sign-in", method = RequestMethod.POST)
    public String signIn(@RequestBody User user) {
        return userService.signIn(user);
    }
}
