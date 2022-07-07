package com.controller;

import static org.mockito.Mockito.when;

import com.service.ResultService;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@ContextConfiguration(classes = {PointController.class})
@ExtendWith(SpringExtension.class)
class PointControllerTest {
    @Autowired
    private PointController pointController;

    @MockBean
    private ResultService resultService;

    /**
     * Method under test: {@link PointController#viewHome(org.springframework.ui.Model)}
     */
    @Test
    void testViewHome() throws Exception {
        when(this.resultService.getPoint()).thenReturn(new ArrayList<>());
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/");
        MockMvcBuilders.standaloneSetup(this.pointController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.model().size(1))
                .andExpect(MockMvcResultMatchers.model().attributeExists("pointlist"))
                .andExpect(MockMvcResultMatchers.view().name("index"))
                .andExpect(MockMvcResultMatchers.forwardedUrl("index"));
    }

    /**
     * Method under test: {@link PointController#viewHome(org.springframework.ui.Model)}
     */
    @Test
    void testViewHome2() throws Exception {
        when(this.resultService.getPoint()).thenReturn(new ArrayList<>());
        MockHttpServletRequestBuilder getResult = MockMvcRequestBuilders.get("/");
        getResult.contentType("https://example.org/example");
        MockMvcBuilders.standaloneSetup(this.pointController)
                .build()
                .perform(getResult)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.model().size(1))
                .andExpect(MockMvcResultMatchers.model().attributeExists("pointlist"))
                .andExpect(MockMvcResultMatchers.view().name("index"))
                .andExpect(MockMvcResultMatchers.forwardedUrl("index"));
    }
}

