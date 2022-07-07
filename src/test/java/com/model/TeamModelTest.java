package com.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

class TeamModelTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link TeamModel#TeamModel()}
     *   <li>{@link TeamModel#setCaptain(String)}
     *   <li>{@link TeamModel#setPlayersModel(List)}
     *   <li>{@link TeamModel#setPointModels(List)}
     *   <li>{@link TeamModel#setState(String)}
     *   <li>{@link TeamModel#setTeamname(String)}
     *   <li>{@link TeamModel#getCaptain()}
     *   <li>{@link TeamModel#getId()}
     *   <li>{@link TeamModel#getPlayersModel()}
     *   <li>{@link TeamModel#getPointModels()}
     *   <li>{@link TeamModel#getState()}
     *   <li>{@link TeamModel#getTeamname()}
     * </ul>
     */
    @Test
    void testConstructor() {
        TeamModel actualTeamModel = new TeamModel();
        actualTeamModel.setCaptain("Captain");
        ArrayList<PlayersModel> playersModelList = new ArrayList<>();
        actualTeamModel.setPlayersModel(playersModelList);
        ArrayList<PointModel> pointModelList = new ArrayList<>();
        actualTeamModel.setPointModels(pointModelList);
        actualTeamModel.setState("MD");
        actualTeamModel.setTeamname("Teamname");
        assertEquals("Captain", actualTeamModel.getCaptain());
        assertNull(actualTeamModel.getId());
        List<PlayersModel> playersModel = actualTeamModel.getPlayersModel();
        assertSame(playersModelList, playersModel);
        List<PointModel> pointModels = actualTeamModel.getPointModels();
        assertEquals(pointModels, playersModel);
        assertSame(pointModelList, pointModels);
        assertEquals(playersModelList, pointModels);
        assertEquals("MD", actualTeamModel.getState());
        assertEquals("Teamname", actualTeamModel.getTeamname());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link TeamModel#TeamModel(long)}
     *   <li>{@link TeamModel#setCaptain(String)}
     *   <li>{@link TeamModel#setPlayersModel(List)}
     *   <li>{@link TeamModel#setPointModels(List)}
     *   <li>{@link TeamModel#setState(String)}
     *   <li>{@link TeamModel#setTeamname(String)}
     *   <li>{@link TeamModel#getCaptain()}
     *   <li>{@link TeamModel#getId()}
     *   <li>{@link TeamModel#getPlayersModel()}
     *   <li>{@link TeamModel#getPointModels()}
     *   <li>{@link TeamModel#getState()}
     *   <li>{@link TeamModel#getTeamname()}
     * </ul>
     */
    @Test
    void testConstructor2() {
        TeamModel actualTeamModel = new TeamModel(123L);
        actualTeamModel.setCaptain("Captain");
        ArrayList<PlayersModel> playersModelList = new ArrayList<>();
        actualTeamModel.setPlayersModel(playersModelList);
        ArrayList<PointModel> pointModelList = new ArrayList<>();
        actualTeamModel.setPointModels(pointModelList);
        actualTeamModel.setState("MD");
        actualTeamModel.setTeamname("Teamname");
        assertEquals("Captain", actualTeamModel.getCaptain());
        assertEquals(123L, actualTeamModel.getId().longValue());
        List<PlayersModel> playersModel = actualTeamModel.getPlayersModel();
        assertSame(playersModelList, playersModel);
        List<PointModel> pointModels = actualTeamModel.getPointModels();
        assertEquals(pointModels, playersModel);
        assertSame(pointModelList, pointModels);
        assertEquals(playersModelList, pointModels);
        assertEquals("MD", actualTeamModel.getState());
        assertEquals("Teamname", actualTeamModel.getTeamname());
    }

    /**
     * Method under test: {@link TeamModel#TeamModel(long, String, String, String)}
     */
    @Test
    void testConstructor3() {
        TeamModel actualTeamModel = new TeamModel(123L, "Teamname", "Captain", "MD");

        assertEquals("Captain", actualTeamModel.getCaptain());
        assertEquals("Teamname", actualTeamModel.getTeamname());
        assertEquals("MD", actualTeamModel.getState());
        assertEquals(123L, actualTeamModel.getId().longValue());
    }

    /**
     * Method under test: {@link TeamModel#TeamModel(long, boolean, String, String)}
     */
    @Test
    void testConstructor4() {
        TeamModel actualTeamModel = new TeamModel(123L, true, "Captain", "MD");

        String expectedTeamname = Boolean.TRUE.toString();
        assertEquals(expectedTeamname, actualTeamModel.getTeamname());
    }

    /**
     * Method under test: {@link TeamModel#setId(long)}
     */
    @Test
    void testSetId() {
        TeamModel teamModel = new TeamModel();
        teamModel.setId(123L);
        assertEquals(123L, teamModel.getId().longValue());
    }
}

