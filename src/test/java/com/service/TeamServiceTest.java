package com.service;
import com.dao.TeamRepo;

import com.model.TeamModel;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;

@SpringBootTest
class TeamServiceTest {

    @Autowired
    TeamRepo teamRepo;

    @Autowired
    TeamService teamService;

    @Test
    void getAllTeams_ReturnTrueIfReturnTeamList() {
        List<TeamModel> teams = teamService.listAll();
        int actualSize = teams.size();
        System.out.println(actualSize);
        assertTrue(actualSize > 1);
    }

    @Test
    void getTeamByName_ReturnTrueIfTeamFound(){
        boolean actual = teamService.findByname("CSK").isPresent();
        System.out.println(actual);
        assertTrue(actual);
    }


}