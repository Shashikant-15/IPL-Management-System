package com.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import java.util.ArrayList;
import org.junit.jupiter.api.Test;

class MatchModelTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>default or parameterless constructor of {@link MatchModel}
     *   <li>{@link MatchModel#setMatchid(int)}
     *   <li>{@link MatchModel#setResult(String)}
     *   <li>{@link MatchModel#setScheduledate(String)}
     *   <li>{@link MatchModel#setTeam1(TeamModel)}
     *   <li>{@link MatchModel#setTeam1Description(String)}
     *   <li>{@link MatchModel#setTeam1Overs(Double)}
     *   <li>{@link MatchModel#setTeam1Wickets(String)}
     *   <li>{@link MatchModel#setTeam2(TeamModel)}
     *   <li>{@link MatchModel#setTeam2Description(String)}
     *   <li>{@link MatchModel#setTeam2Overs(Double)}
     *   <li>{@link MatchModel#setTeam2Wickets(String)}
     *   <li>{@link MatchModel#setTime(String)}
     *   <li>{@link MatchModel#setVenue(String)}
     *   <li>{@link MatchModel#getMatchid()}
     *   <li>{@link MatchModel#getResult()}
     *   <li>{@link MatchModel#getScheduledate()}
     *   <li>{@link MatchModel#getTeam1()}
     *   <li>{@link MatchModel#getTeam1Description()}
     *   <li>{@link MatchModel#getTeam1Overs()}
     *   <li>{@link MatchModel#getTeam1Wickets()}
     *   <li>{@link MatchModel#getTeam2()}
     *   <li>{@link MatchModel#getTeam2Description()}
     *   <li>{@link MatchModel#getTeam2Overs()}
     *   <li>{@link MatchModel#getTeam2Wickets()}
     *   <li>{@link MatchModel#getTime()}
     *   <li>{@link MatchModel#getVenue()}
     * </ul>
     */
    @Test
    void testConstructor() {
        MatchModel actualMatchModel = new MatchModel();
        actualMatchModel.setMatchid(1);
        actualMatchModel.setResult("Result");
        actualMatchModel.setScheduledate("2020-03-01");
        TeamModel teamModel = new TeamModel();
        teamModel.setCaptain("Captain");
        teamModel.setId(123L);
        teamModel.setPlayersModel(new ArrayList<>());
        teamModel.setPointModels(new ArrayList<>());
        teamModel.setState("MD");
        teamModel.setTeamname("Teamname");
        actualMatchModel.setTeam1(teamModel);
        actualMatchModel.setTeam1Description("Team1 Description");
        actualMatchModel.setTeam1Overs(10.0d);
        actualMatchModel.setTeam1Wickets("Team1 Wickets");
        TeamModel teamModel1 = new TeamModel();
        teamModel1.setCaptain("Captain");
        teamModel1.setId(123L);
        teamModel1.setPlayersModel(new ArrayList<>());
        teamModel1.setPointModels(new ArrayList<>());
        teamModel1.setState("MD");
        teamModel1.setTeamname("Teamname");
        actualMatchModel.setTeam2(teamModel1);
        actualMatchModel.setTeam2Description("Team2 Description");
        actualMatchModel.setTeam2Overs(10.0d);
        actualMatchModel.setTeam2Wickets("Team2 Wickets");
        actualMatchModel.setTime("Time");
        actualMatchModel.setVenue("Venue");
        assertEquals(1, actualMatchModel.getMatchid());
        assertEquals("Result", actualMatchModel.getResult());
        assertEquals("2020-03-01", actualMatchModel.getScheduledate());
        assertSame(teamModel, actualMatchModel.getTeam1());
        assertEquals("Team1 Description", actualMatchModel.getTeam1Description());
        assertEquals(10.0d, actualMatchModel.getTeam1Overs().doubleValue());
        assertEquals("Team1 Wickets", actualMatchModel.getTeam1Wickets());
        assertSame(teamModel1, actualMatchModel.getTeam2());
        assertEquals("Team2 Description", actualMatchModel.getTeam2Description());
        assertEquals(10.0d, actualMatchModel.getTeam2Overs().doubleValue());
        assertEquals("Team2 Wickets", actualMatchModel.getTeam2Wickets());
        assertEquals("Time", actualMatchModel.getTime());
        assertEquals("Venue", actualMatchModel.getVenue());
    }
}

