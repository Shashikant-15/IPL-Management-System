package com.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class JsonModelTest {
    /**
     * Method under test: {@link JsonModel#getId()}
     */
    @Test
    void testGetId() {
        assertEquals(0L, (new JsonModel()).getId().longValue());
    }

    /**
     * Method under test: {@link JsonModel#setId(Long)}
     */
    @Test
    void testSetId() {
        JsonModel jsonModel = new JsonModel();
        jsonModel.setId(123L);
        assertEquals(123L, jsonModel.getId().longValue());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>default or parameterless constructor of {@link JsonModel}
     *   <li>{@link JsonModel#setResult(String)}
     *   <li>{@link JsonModel#setScheduledate(String)}
     *   <li>{@link JsonModel#setStateModel(String)}
     *   <li>{@link JsonModel#setTeam1(String)}
     *   <li>{@link JsonModel#setTeam1Description(String)}
     *   <li>{@link JsonModel#setTeam1Overs(Double)}
     *   <li>{@link JsonModel#setTeam1Wickets(String)}
     *   <li>{@link JsonModel#setTeam2(String)}
     *   <li>{@link JsonModel#setTeam2Description(String)}
     *   <li>{@link JsonModel#setTeam2Overs(Double)}
     *   <li>{@link JsonModel#setTeam2Wickets(String)}
     *   <li>{@link JsonModel#setTime(String)}
     *   <li>{@link JsonModel#setVenue(String)}
     *   <li>{@link JsonModel#getResult()}
     *   <li>{@link JsonModel#getScheduledate()}
     *   <li>{@link JsonModel#getStateModel()}
     *   <li>{@link JsonModel#getTeam1()}
     *   <li>{@link JsonModel#getTeam1Description()}
     *   <li>{@link JsonModel#getTeam1Overs()}
     *   <li>{@link JsonModel#getTeam1Wickets()}
     *   <li>{@link JsonModel#getTeam2()}
     *   <li>{@link JsonModel#getTeam2Description()}
     *   <li>{@link JsonModel#getTeam2Overs()}
     *   <li>{@link JsonModel#getTeam2Wickets()}
     *   <li>{@link JsonModel#getTime()}
     *   <li>{@link JsonModel#getVenue()}
     * </ul>
     */
    @Test
    void testConstructor() {
        JsonModel actualJsonModel = new JsonModel();
        actualJsonModel.setResult("Result");
        actualJsonModel.setScheduledate("2020-03-01");
        actualJsonModel.setStateModel("MD");
        actualJsonModel.setTeam1("Team1");
        actualJsonModel.setTeam1Description("Team1 Description");
        actualJsonModel.setTeam1Overs(10.0d);
        actualJsonModel.setTeam1Wickets("Team1 Wickets");
        actualJsonModel.setTeam2("Team2");
        actualJsonModel.setTeam2Description("Team2 Description");
        actualJsonModel.setTeam2Overs(10.0d);
        actualJsonModel.setTeam2Wickets("Team2 Wickets");
        actualJsonModel.setTime("Time");
        actualJsonModel.setVenue("Venue");
        assertEquals("Result", actualJsonModel.getResult());
        assertEquals("2020-03-01", actualJsonModel.getScheduledate());
        assertEquals("MD", actualJsonModel.getStateModel());
        assertEquals("Team1", actualJsonModel.getTeam1());
        assertEquals("Team1 Description", actualJsonModel.getTeam1Description());
        assertEquals(10.0d, actualJsonModel.getTeam1Overs().doubleValue());
        assertEquals("Team1 Wickets", actualJsonModel.getTeam1Wickets());
        assertEquals("Team2", actualJsonModel.getTeam2());
        assertEquals("Team2 Description", actualJsonModel.getTeam2Description());
        assertEquals(10.0d, actualJsonModel.getTeam2Overs().doubleValue());
        assertEquals("Team2 Wickets", actualJsonModel.getTeam2Wickets());
        assertEquals("Time", actualJsonModel.getTime());
        assertEquals("Venue", actualJsonModel.getVenue());
    }
}

