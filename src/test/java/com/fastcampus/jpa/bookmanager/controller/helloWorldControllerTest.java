package com.fastcampus.jpa.bookmanager.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest
@AutoConfigureMockMvc
class helloWorldControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void helloWorldTest() throws Exception{
        mockMvc.perform(MockMvcRequestBuilders.get("/hello-world")) // get으로 "/hello-world"를 요청하는 것을 테스트하겠다는 의미이다.
                .andDo(print()) // print를 해준다.
                .andExpect(status().isOk()) // status가 isOk를 리턴할 것을 expect한다.
                .andExpect(content().string("hello-world"));    // content().string은 helloWorld() 메소드의 리턴값인 "hello-world"를 리턴할 것을 expect한다.
    }


}