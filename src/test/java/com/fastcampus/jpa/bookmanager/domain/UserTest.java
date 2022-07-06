package com.fastcampus.jpa.bookmanager.domain;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;


class UserTest {

    @Test
    void test(){
        User user = new User();
        user.setEmail("ahyoon@comgong.com");
        user.setName("ahyoon");
        user.setCreatedAt(LocalDateTime.now());
        user.setUpdatedAt(LocalDateTime.now());

        User user1 = new User("ahyoon","ahyoon@comgong.com",LocalDateTime.now(),LocalDateTime.now());
        User user2 = new User("ahyoon","ahyoon@comgong.com");

        User user3 = User.builder()
                .name("ahyoon")
                .email("ahyoon.comgong.com")
                .build();

        System.out.println(">>> "+user);
    }

}