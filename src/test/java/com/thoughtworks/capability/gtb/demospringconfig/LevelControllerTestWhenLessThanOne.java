package com.thoughtworks.capability.gtb.demospringconfig;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

@SpringBootTest(properties = {"levelNumber=0"})
@AutoConfigureMockMvc
class LevelControllerTestWhenLessThanOne {
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void equal() throws Exception {
        mockMvc.perform(get("/level"))
                .andExpect(content().string("basic"));
    }
}