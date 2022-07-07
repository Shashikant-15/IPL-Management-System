package com.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import java.util.ArrayList;
import org.junit.jupiter.api.Test;

class PointModelTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>default or parameterless constructor of {@link PointModel}
     *   <li>{@link PointModel#setId(Long)}
     *   <li>{@link PointModel#setLossCount(int)}
     *   <li>{@link PointModel#setMatchCount(int)}
     *   <li>{@link PointModel#setPoint(int)}
     *   <li>{@link PointModel#setTeam(TeamModel)}
     *   <li>{@link PointModel#setWinCount(int)}
     *   <li>{@link PointModel#getId()}
     *   <li>{@link PointModel#getLossCount()}
     *   <li>{@link PointModel#getMatchCount()}
     *   <li>{@link PointModel#getPoint()}
     *   <li>{@link PointModel#getTeam()}
     *   <li>{@link PointModel#getWinCount()}
     * </ul>
     */
    @Test
    void testConstructor() {
        PointModel actualPointModel = new PointModel();
        actualPointModel.setId(123L);
        actualPointModel.setLossCount(3);
        actualPointModel.setMatchCount(3);
        actualPointModel.setPoint(1);
        TeamModel teamModel = new TeamModel();
        teamModel.setCaptain("Captain");
        teamModel.setId(123L);
        teamModel.setPlayersModel(new ArrayList<>());
        teamModel.setPointModels(new ArrayList<>());
        teamModel.setState("MD");
        teamModel.setTeamname("Teamname");
        actualPointModel.setTeam(teamModel);
        actualPointModel.setWinCount(3);
        assertEquals(123L, actualPointModel.getId().longValue());
        assertEquals(3, actualPointModel.getLossCount());
        assertEquals(3, actualPointModel.getMatchCount());
        assertEquals(1, actualPointModel.getPoint());
        assertSame(teamModel, actualPointModel.getTeam());
        assertEquals(3, actualPointModel.getWinCount());
    }
}

