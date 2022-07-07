package com.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import java.util.ArrayList;
import org.junit.jupiter.api.Test;

class PlayersModelTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>default or parameterless constructor of {@link PlayersModel}
     *   <li>{@link PlayersModel#setId(int)}
     *   <li>{@link PlayersModel#setName(String)}
     *   <li>{@link PlayersModel#setPlayer_role(String)}
     *   <li>{@link PlayersModel#setTeam(TeamModel)}
     *   <li>{@link PlayersModel#getId()}
     *   <li>{@link PlayersModel#getName()}
     *   <li>{@link PlayersModel#getPlayer_role()}
     *   <li>{@link PlayersModel#getTeam()}
     * </ul>
     */
    @Test
    void testConstructor() {
        PlayersModel actualPlayersModel = new PlayersModel();
        actualPlayersModel.setId(1);
        actualPlayersModel.setName("Name");
        actualPlayersModel.setPlayer_role("Player role");
        TeamModel teamModel = new TeamModel();
        teamModel.setCaptain("Captain");
        teamModel.setId(123L);
        teamModel.setPlayersModel(new ArrayList<>());
        teamModel.setPointModels(new ArrayList<>());
        teamModel.setState("MD");
        teamModel.setTeamname("Teamname");
        actualPlayersModel.setTeam(teamModel);
        assertEquals(1, actualPlayersModel.getId());
        assertEquals("Name", actualPlayersModel.getName());
        assertEquals("Player role", actualPlayersModel.getPlayer_role());
        assertSame(teamModel, actualPlayersModel.getTeam());
    }
}

