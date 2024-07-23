package com.example.summer.user;

import java.util.HashMap;
import java.util.Map;

public class UserRepository {

    private int idx = 0;
    private Map<Integer, User> users = new HashMap<>();

    public User findById(String id) {
        for (Integer i : users.keySet()) {
            if (users.get(i).getId().equals(id)) {
                return users.get(i);
            }
        }
        return null;
    }

    public String save(User user) {
        users.put(idx++, user);
        return (users.get(idx - 1).getName() + " 님 가입을 환영합니다.");
    }

}
