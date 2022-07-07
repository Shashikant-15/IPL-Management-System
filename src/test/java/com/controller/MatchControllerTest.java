package com.controller;

import static org.mockito.Mockito.any;
import static org.mockito.Mockito.anyInt;
import static org.mockito.Mockito.anyLong;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.dao.MatchRepo;
import com.model.MatchModel;
import com.model.PlayersModel;
import com.model.PointModel;
import com.model.TeamModel;
import com.service.MatchService;
import com.service.ProducerService;
import com.service.ResultService;
import com.service.TeamService;
import java.util.ArrayList;
import org.junit.jupiter.api.Disabled;
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
import org.springframework.ui.ConcurrentModel;
import org.springframework.validation.BeanPropertyBindingResult;
import org.springframework.validation.BindException;

@ContextConfiguration(classes = {MatchController.class})
@ExtendWith(SpringExtension.class)
class MatchControllerTest {
    @Autowired
    private MatchController matchController;

    @MockBean
    private MatchRepo matchRepo;

    @MockBean
    private MatchService matchService;

    @MockBean
    private ProducerService producerService;

    @MockBean
    private ResultService resultService;

    @MockBean
    private TeamService teamService;

    /**
     * Method under test: {@link MatchController#viewMatch(org.springframework.ui.Model)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testViewMatch() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at com.controller.MatchController.viewMatch(MatchController.java:51)
        //   In order to prevent viewMatch(Model)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   viewMatch(Model).
        //   See https://diff.blue/R013 to resolve this issue.

        MatchController matchController = new MatchController();
        matchController.viewMatch(new ConcurrentModel());
    }

    /**
     * Method under test: {@link MatchController#addMatch(org.springframework.ui.Model)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testAddMatch() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at com.controller.MatchController.addMatch(MatchController.java:64)
        //   In order to prevent addMatch(Model)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   addMatch(Model).
        //   See https://diff.blue/R013 to resolve this issue.

        MatchController matchController = new MatchController();
        matchController.addMatch(new ConcurrentModel());
    }

    /**
     * Method under test: {@link MatchController#updateScore(MatchModel, org.springframework.validation.BindingResult)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testUpdateScore() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NumberFormatException: For input string: "Team1 Description"
        //       at jdk.internal.math.FloatingDecimal.readJavaFormatString(FloatingDecimal.java:2054)
        //       at jdk.internal.math.FloatingDecimal.parseDouble(FloatingDecimal.java:110)
        //       at java.lang.Double.parseDouble(Double.java:543)
        //       at com.controller.MatchController.updateScore(MatchController.java:120)
        //   In order to prevent updateScore(MatchModel, BindingResult)
        //   from throwing NumberFormatException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   updateScore(MatchModel, BindingResult).
        //   See https://diff.blue/R013 to resolve this issue.

        MatchController matchController = new MatchController();
        TeamModel teamModel = mock(TeamModel.class);
        doNothing().when(teamModel).setCaptain((String) any());
        doNothing().when(teamModel).setId(anyLong());
        doNothing().when(teamModel).setPlayersModel((java.util.List<PlayersModel>) any());
        doNothing().when(teamModel).setPointModels((java.util.List<PointModel>) any());
        doNothing().when(teamModel).setState((String) any());
        doNothing().when(teamModel).setTeamname((String) any());
        teamModel.setCaptain("Captain");
        teamModel.setId(123L);
        teamModel.setPlayersModel(new ArrayList<>());
        teamModel.setPointModels(new ArrayList<>());
        teamModel.setState("MD");
        teamModel.setTeamname("Teamname");
        TeamModel teamModel1 = mock(TeamModel.class);
        doNothing().when(teamModel1).setCaptain((String) any());
        doNothing().when(teamModel1).setId(anyLong());
        doNothing().when(teamModel1).setPlayersModel((java.util.List<PlayersModel>) any());
        doNothing().when(teamModel1).setPointModels((java.util.List<PointModel>) any());
        doNothing().when(teamModel1).setState((String) any());
        doNothing().when(teamModel1).setTeamname((String) any());
        teamModel1.setCaptain("Captain");
        teamModel1.setId(123L);
        teamModel1.setPlayersModel(new ArrayList<>());
        teamModel1.setPointModels(new ArrayList<>());
        teamModel1.setState("MD");
        teamModel1.setTeamname("Teamname");
        MatchModel matchModel = mock(MatchModel.class);
        when(matchModel.getTeam1Overs()).thenReturn(10.0d);
        when(matchModel.getTeam1Description()).thenReturn("Team1 Description");
        doNothing().when(matchModel).setMatchid(anyInt());
        doNothing().when(matchModel).setResult((String) any());
        doNothing().when(matchModel).setScheduledate((String) any());
        doNothing().when(matchModel).setTeam1((TeamModel) any());
        doNothing().when(matchModel).setTeam1Description((String) any());
        doNothing().when(matchModel).setTeam1Overs((Double) any());
        doNothing().when(matchModel).setTeam1Wickets((String) any());
        doNothing().when(matchModel).setTeam2((TeamModel) any());
        doNothing().when(matchModel).setTeam2Description((String) any());
        doNothing().when(matchModel).setTeam2Overs((Double) any());
        doNothing().when(matchModel).setTeam2Wickets((String) any());
        doNothing().when(matchModel).setTime((String) any());
        doNothing().when(matchModel).setVenue((String) any());
        matchModel.setMatchid(1);
        matchModel.setResult("Result");
        matchModel.setScheduledate("2020-03-01");
        matchModel.setTeam1(teamModel);
        matchModel.setTeam1Description("Team1 Description");
        matchModel.setTeam1Overs(10.0d);
        matchModel.setTeam1Wickets("Team1 Wickets");
        matchModel.setTeam2(teamModel1);
        matchModel.setTeam2Description("Team2 Description");
        matchModel.setTeam2Overs(10.0d);
        matchModel.setTeam2Wickets("Team2 Wickets");
        matchModel.setTime("Time");
        matchModel.setVenue("Venue");
        matchController.updateScore(matchModel, new BindException(new BindException(new BindException(
                new BindException(new BindException(new BeanPropertyBindingResult("Target", "Object Name")))))));
    }

    /**
     * Method under test: {@link MatchController#updateScore(MatchModel, org.springframework.validation.BindingResult)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testUpdateScore2() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NumberFormatException: For input string: "Team2 Description"
        //       at jdk.internal.math.FloatingDecimal.readJavaFormatString(FloatingDecimal.java:2054)
        //       at jdk.internal.math.FloatingDecimal.parseDouble(FloatingDecimal.java:110)
        //       at java.lang.Double.parseDouble(Double.java:543)
        //       at com.controller.MatchController.updateScore(MatchController.java:124)
        //   In order to prevent updateScore(MatchModel, BindingResult)
        //   from throwing NumberFormatException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   updateScore(MatchModel, BindingResult).
        //   See https://diff.blue/R013 to resolve this issue.

        MatchController matchController = new MatchController();
        TeamModel teamModel = mock(TeamModel.class);
        doNothing().when(teamModel).setCaptain((String) any());
        doNothing().when(teamModel).setId(anyLong());
        doNothing().when(teamModel).setPlayersModel((java.util.List<PlayersModel>) any());
        doNothing().when(teamModel).setPointModels((java.util.List<PointModel>) any());
        doNothing().when(teamModel).setState((String) any());
        doNothing().when(teamModel).setTeamname((String) any());
        teamModel.setCaptain("Captain");
        teamModel.setId(123L);
        teamModel.setPlayersModel(new ArrayList<>());
        teamModel.setPointModels(new ArrayList<>());
        teamModel.setState("MD");
        teamModel.setTeamname("Teamname");
        TeamModel teamModel1 = mock(TeamModel.class);
        doNothing().when(teamModel1).setCaptain((String) any());
        doNothing().when(teamModel1).setId(anyLong());
        doNothing().when(teamModel1).setPlayersModel((java.util.List<PlayersModel>) any());
        doNothing().when(teamModel1).setPointModels((java.util.List<PointModel>) any());
        doNothing().when(teamModel1).setState((String) any());
        doNothing().when(teamModel1).setTeamname((String) any());
        teamModel1.setCaptain("Captain");
        teamModel1.setId(123L);
        teamModel1.setPlayersModel(new ArrayList<>());
        teamModel1.setPointModels(new ArrayList<>());
        teamModel1.setState("MD");
        teamModel1.setTeamname("Teamname");
        MatchModel matchModel = mock(MatchModel.class);
        when(matchModel.getTeam2Overs()).thenReturn(10.0d);
        when(matchModel.getTeam2Description()).thenReturn("Team2 Description");
        when(matchModel.getTeam1Overs()).thenReturn(10.0d);
        when(matchModel.getTeam1Description()).thenReturn("42");
        doNothing().when(matchModel).setMatchid(anyInt());
        doNothing().when(matchModel).setResult((String) any());
        doNothing().when(matchModel).setScheduledate((String) any());
        doNothing().when(matchModel).setTeam1((TeamModel) any());
        doNothing().when(matchModel).setTeam1Description((String) any());
        doNothing().when(matchModel).setTeam1Overs((Double) any());
        doNothing().when(matchModel).setTeam1Wickets((String) any());
        doNothing().when(matchModel).setTeam2((TeamModel) any());
        doNothing().when(matchModel).setTeam2Description((String) any());
        doNothing().when(matchModel).setTeam2Overs((Double) any());
        doNothing().when(matchModel).setTeam2Wickets((String) any());
        doNothing().when(matchModel).setTime((String) any());
        doNothing().when(matchModel).setVenue((String) any());
        matchModel.setMatchid(1);
        matchModel.setResult("Result");
        matchModel.setScheduledate("2020-03-01");
        matchModel.setTeam1(teamModel);
        matchModel.setTeam1Description("Team1 Description");
        matchModel.setTeam1Overs(10.0d);
        matchModel.setTeam1Wickets("Team1 Wickets");
        matchModel.setTeam2(teamModel1);
        matchModel.setTeam2Description("Team2 Description");
        matchModel.setTeam2Overs(10.0d);
        matchModel.setTeam2Wickets("Team2 Wickets");
        matchModel.setTime("Time");
        matchModel.setVenue("Venue");
        matchController.updateScore(matchModel, new BindException(new BindException(new BindException(
                new BindException(new BindException(new BeanPropertyBindingResult("Target", "Object Name")))))));
    }

    /**
     * Method under test: {@link MatchController#updateScore(MatchModel, org.springframework.validation.BindingResult)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testUpdateScore3() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at com.controller.MatchController.updateScore(MatchController.java:131)
        //   In order to prevent updateScore(MatchModel, BindingResult)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   updateScore(MatchModel, BindingResult).
        //   See https://diff.blue/R013 to resolve this issue.

        MatchController matchController = new MatchController();
        TeamModel teamModel = mock(TeamModel.class);
        doNothing().when(teamModel).setCaptain((String) any());
        doNothing().when(teamModel).setId(anyLong());
        doNothing().when(teamModel).setPlayersModel((java.util.List<PlayersModel>) any());
        doNothing().when(teamModel).setPointModels((java.util.List<PointModel>) any());
        doNothing().when(teamModel).setState((String) any());
        doNothing().when(teamModel).setTeamname((String) any());
        teamModel.setCaptain("Captain");
        teamModel.setId(123L);
        teamModel.setPlayersModel(new ArrayList<>());
        teamModel.setPointModels(new ArrayList<>());
        teamModel.setState("MD");
        teamModel.setTeamname("Teamname");
        TeamModel teamModel1 = mock(TeamModel.class);
        doNothing().when(teamModel1).setCaptain((String) any());
        doNothing().when(teamModel1).setId(anyLong());
        doNothing().when(teamModel1).setPlayersModel((java.util.List<PlayersModel>) any());
        doNothing().when(teamModel1).setPointModels((java.util.List<PointModel>) any());
        doNothing().when(teamModel1).setState((String) any());
        doNothing().when(teamModel1).setTeamname((String) any());
        teamModel1.setCaptain("Captain");
        teamModel1.setId(123L);
        teamModel1.setPlayersModel(new ArrayList<>());
        teamModel1.setPointModels(new ArrayList<>());
        teamModel1.setState("MD");
        teamModel1.setTeamname("Teamname");
        MatchModel matchModel = mock(MatchModel.class);
        when(matchModel.getTeam2Overs()).thenReturn(10.0d);
        when(matchModel.getTeam2Description()).thenReturn("42");
        when(matchModel.getTeam1Overs()).thenReturn(10.0d);
        when(matchModel.getTeam1Description()).thenReturn("42");
        doNothing().when(matchModel).setMatchid(anyInt());
        doNothing().when(matchModel).setResult((String) any());
        doNothing().when(matchModel).setScheduledate((String) any());
        doNothing().when(matchModel).setTeam1((TeamModel) any());
        doNothing().when(matchModel).setTeam1Description((String) any());
        doNothing().when(matchModel).setTeam1Overs((Double) any());
        doNothing().when(matchModel).setTeam1Wickets((String) any());
        doNothing().when(matchModel).setTeam2((TeamModel) any());
        doNothing().when(matchModel).setTeam2Description((String) any());
        doNothing().when(matchModel).setTeam2Overs((Double) any());
        doNothing().when(matchModel).setTeam2Wickets((String) any());
        doNothing().when(matchModel).setTime((String) any());
        doNothing().when(matchModel).setVenue((String) any());
        matchModel.setMatchid(1);
        matchModel.setResult("Result");
        matchModel.setScheduledate("2020-03-01");
        matchModel.setTeam1(teamModel);
        matchModel.setTeam1Description("Team1 Description");
        matchModel.setTeam1Overs(10.0d);
        matchModel.setTeam1Wickets("Team1 Wickets");
        matchModel.setTeam2(teamModel1);
        matchModel.setTeam2Description("Team2 Description");
        matchModel.setTeam2Overs(10.0d);
        matchModel.setTeam2Wickets("Team2 Wickets");
        matchModel.setTime("Time");
        matchModel.setVenue("Venue");
        matchController.updateScore(matchModel, new BindException(new BindException(new BindException(
                new BindException(new BindException(new BeanPropertyBindingResult("Target", "Object Name")))))));
    }

    /**
     * Method under test: {@link MatchController#updateScore(MatchModel, org.springframework.validation.BindingResult)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testUpdateScore4() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NumberFormatException: For input string: "Team2 Description"
        //       at jdk.internal.math.FloatingDecimal.readJavaFormatString(FloatingDecimal.java:2054)
        //       at jdk.internal.math.FloatingDecimal.parseDouble(FloatingDecimal.java:110)
        //       at java.lang.Double.parseDouble(Double.java:543)
        //       at com.controller.MatchController.updateScore(MatchController.java:124)
        //   In order to prevent updateScore(MatchModel, BindingResult)
        //   from throwing NumberFormatException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   updateScore(MatchModel, BindingResult).
        //   See https://diff.blue/R013 to resolve this issue.

        MatchController matchController = new MatchController();
        TeamModel teamModel = mock(TeamModel.class);
        doNothing().when(teamModel).setCaptain((String) any());
        doNothing().when(teamModel).setId(anyLong());
        doNothing().when(teamModel).setPlayersModel((java.util.List<PlayersModel>) any());
        doNothing().when(teamModel).setPointModels((java.util.List<PointModel>) any());
        doNothing().when(teamModel).setState((String) any());
        doNothing().when(teamModel).setTeamname((String) any());
        teamModel.setCaptain("Captain");
        teamModel.setId(123L);
        teamModel.setPlayersModel(new ArrayList<>());
        teamModel.setPointModels(new ArrayList<>());
        teamModel.setState("MD");
        teamModel.setTeamname("Teamname");
        TeamModel teamModel1 = mock(TeamModel.class);
        doNothing().when(teamModel1).setCaptain((String) any());
        doNothing().when(teamModel1).setId(anyLong());
        doNothing().when(teamModel1).setPlayersModel((java.util.List<PlayersModel>) any());
        doNothing().when(teamModel1).setPointModels((java.util.List<PointModel>) any());
        doNothing().when(teamModel1).setState((String) any());
        doNothing().when(teamModel1).setTeamname((String) any());
        teamModel1.setCaptain("Captain");
        teamModel1.setId(123L);
        teamModel1.setPlayersModel(new ArrayList<>());
        teamModel1.setPointModels(new ArrayList<>());
        teamModel1.setState("MD");
        teamModel1.setTeamname("Teamname");
        MatchModel matchModel = mock(MatchModel.class);
        when(matchModel.getTeam2Overs()).thenReturn(10.0d);
        when(matchModel.getTeam2Description()).thenReturn("Team2 Description");
        when(matchModel.getTeam1Overs()).thenReturn(0.5d);
        when(matchModel.getTeam1Description()).thenReturn("42");
        doNothing().when(matchModel).setMatchid(anyInt());
        doNothing().when(matchModel).setResult((String) any());
        doNothing().when(matchModel).setScheduledate((String) any());
        doNothing().when(matchModel).setTeam1((TeamModel) any());
        doNothing().when(matchModel).setTeam1Description((String) any());
        doNothing().when(matchModel).setTeam1Overs((Double) any());
        doNothing().when(matchModel).setTeam1Wickets((String) any());
        doNothing().when(matchModel).setTeam2((TeamModel) any());
        doNothing().when(matchModel).setTeam2Description((String) any());
        doNothing().when(matchModel).setTeam2Overs((Double) any());
        doNothing().when(matchModel).setTeam2Wickets((String) any());
        doNothing().when(matchModel).setTime((String) any());
        doNothing().when(matchModel).setVenue((String) any());
        matchModel.setMatchid(1);
        matchModel.setResult("Result");
        matchModel.setScheduledate("2020-03-01");
        matchModel.setTeam1(teamModel);
        matchModel.setTeam1Description("Team1 Description");
        matchModel.setTeam1Overs(10.0d);
        matchModel.setTeam1Wickets("Team1 Wickets");
        matchModel.setTeam2(teamModel1);
        matchModel.setTeam2Description("Team2 Description");
        matchModel.setTeam2Overs(10.0d);
        matchModel.setTeam2Wickets("Team2 Wickets");
        matchModel.setTime("Time");
        matchModel.setVenue("Venue");
        matchController.updateScore(matchModel, new BindException(new BindException(new BindException(
                new BindException(new BindException(new BeanPropertyBindingResult("Target", "Object Name")))))));
    }

    /**
     * Method under test: {@link MatchController#viewAddScore(org.springframework.ui.Model)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testViewAddScore() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at com.controller.MatchController.viewAddScore(MatchController.java:147)
        //   In order to prevent viewAddScore(Model)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   viewAddScore(Model).
        //   See https://diff.blue/R013 to resolve this issue.

        MatchController matchController = new MatchController();
        matchController.viewAddScore(new ConcurrentModel());
    }

    /**
     * Method under test: {@link MatchController#scoreResultList(org.springframework.ui.Model)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testScoreResultList() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at com.controller.MatchController.scoreResultList(MatchController.java:160)
        //   In order to prevent scoreResultList(Model)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   scoreResultList(Model).
        //   See https://diff.blue/R013 to resolve this issue.

        MatchController matchController = new MatchController();
        matchController.scoreResultList(new ConcurrentModel());
    }

    /**
     * Method under test: {@link MatchController#viewMatchResult(org.springframework.ui.Model)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testViewMatchResult() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at com.controller.MatchController.viewMatchResult(MatchController.java:223)
        //   In order to prevent viewMatchResult(Model)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   viewMatchResult(Model).
        //   See https://diff.blue/R013 to resolve this issue.

        MatchController matchController = new MatchController();
        matchController.viewMatchResult(new ConcurrentModel());
    }

    /**
     * Method under test: {@link MatchController#editMatch(org.springframework.ui.Model)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testEditMatch() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at com.controller.MatchController.editMatch(MatchController.java:235)
        //   In order to prevent editMatch(Model)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   editMatch(Model).
        //   See https://diff.blue/R013 to resolve this issue.

        MatchController matchController = new MatchController();
        matchController.editMatch(new ConcurrentModel());
    }

    /**
     * Method under test: {@link MatchController#deleteStudent(String, org.springframework.web.servlet.mvc.support.RedirectAttributes)}
     */
    @Test
    void testDeleteStudent() throws Exception {
        doNothing().when(this.matchService).delete(anyInt());
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/deletematch/{matchid}", 42, "Uri Vars");
        MockMvcBuilders.standaloneSetup(this.matchController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isFound())
                .andExpect(MockMvcResultMatchers.model().size(0))
                .andExpect(MockMvcResultMatchers.view().name("redirect:/editMatch"))
                .andExpect(MockMvcResultMatchers.redirectedUrl("/editMatch"));
    }

    /**
     * Method under test: {@link MatchController#deleteStudent(String, org.springframework.web.servlet.mvc.support.RedirectAttributes)}
     */
    @Test
    void testDeleteStudent2() throws Exception {
        doNothing().when(this.matchService).delete(anyInt());
        MockHttpServletRequestBuilder getResult = MockMvcRequestBuilders.get("/deletematch/{matchid}", 42, "Uri Vars");
        getResult.contentType("https://example.org/example");
        MockMvcBuilders.standaloneSetup(this.matchController)
                .build()
                .perform(getResult)
                .andExpect(MockMvcResultMatchers.status().isFound())
                .andExpect(MockMvcResultMatchers.model().size(0))
                .andExpect(MockMvcResultMatchers.view().name("redirect:/editMatch"))
                .andExpect(MockMvcResultMatchers.redirectedUrl("/editMatch"));
    }

    /**
     * Method under test: {@link MatchController#saveMatch(com.model.MatchModel, org.springframework.validation.BindingResult, org.springframework.web.servlet.mvc.support.RedirectAttributes)}
     */
    @Test
    void testSaveMatch() throws Exception {
        when(this.matchService.saveMatches((com.model.MatchModel) any(),
                (org.springframework.validation.BindingResult) any(),
                (org.springframework.web.servlet.mvc.support.RedirectAttributes) any())).thenReturn("Save Matches");
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.post("/SaveMatch");
        MockMvcBuilders.standaloneSetup(this.matchController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.model().size(1))
                .andExpect(MockMvcResultMatchers.model().attributeExists("match"))
                .andExpect(MockMvcResultMatchers.view().name("Save Matches"))
                .andExpect(MockMvcResultMatchers.forwardedUrl("Save Matches"));
    }

    /**
     * Method under test: {@link MatchController#showEditPlayer(String)}
     */
    @Test
    void testShowEditPlayer() throws Exception {
        when(this.teamService.listAll()).thenReturn(new ArrayList<>());

        TeamModel teamModel = new TeamModel();
        teamModel.setCaptain("Captain");
        teamModel.setId(123L);
        teamModel.setPlayersModel(new ArrayList<>());
        teamModel.setPointModels(new ArrayList<>());
        teamModel.setState("MD");
        teamModel.setTeamname("Teamname");

        TeamModel teamModel1 = new TeamModel();
        teamModel1.setCaptain("Captain");
        teamModel1.setId(123L);
        teamModel1.setPlayersModel(new ArrayList<>());
        teamModel1.setPointModels(new ArrayList<>());
        teamModel1.setState("MD");
        teamModel1.setTeamname("Teamname");

        MatchModel matchModel = new MatchModel();
        matchModel.setMatchid(1);
        matchModel.setResult("Result");
        matchModel.setScheduledate("2020-03-01");
        matchModel.setTeam1(teamModel);
        matchModel.setTeam1Description("Team1 Description");
        matchModel.setTeam1Overs(10.0d);
        matchModel.setTeam1Wickets("Team1 Wickets");
        matchModel.setTeam2(teamModel1);
        matchModel.setTeam2Description("Team2 Description");
        matchModel.setTeam2Overs(10.0d);
        matchModel.setTeam2Wickets("Team2 Wickets");
        matchModel.setTime("Time");
        matchModel.setVenue("Venue");
        when(this.matchService.get(anyInt())).thenReturn(matchModel);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/editmatch/{matchid}", 42, "Uri Vars");
        MockMvcBuilders.standaloneSetup(this.matchController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.model().size(2))
                .andExpect(MockMvcResultMatchers.model().attributeExists("match", "teamList"))
                .andExpect(MockMvcResultMatchers.view().name("updateMatch"))
                .andExpect(MockMvcResultMatchers.forwardedUrl("updateMatch"));
    }

    /**
     * Method under test: {@link MatchController#showEditPlayer(String)}
     */
    @Test
    void testShowEditPlayer2() throws Exception {
        when(this.teamService.listAll()).thenReturn(new ArrayList<>());

        TeamModel teamModel = new TeamModel();
        teamModel.setCaptain("Captain");
        teamModel.setId(123L);
        teamModel.setPlayersModel(new ArrayList<>());
        teamModel.setPointModels(new ArrayList<>());
        teamModel.setState("MD");
        teamModel.setTeamname("Teamname");

        TeamModel teamModel1 = new TeamModel();
        teamModel1.setCaptain("Captain");
        teamModel1.setId(123L);
        teamModel1.setPlayersModel(new ArrayList<>());
        teamModel1.setPointModels(new ArrayList<>());
        teamModel1.setState("MD");
        teamModel1.setTeamname("Teamname");

        MatchModel matchModel = new MatchModel();
        matchModel.setMatchid(1);
        matchModel.setResult("Result");
        matchModel.setScheduledate("2020-03-01");
        matchModel.setTeam1(teamModel);
        matchModel.setTeam1Description("Team1 Description");
        matchModel.setTeam1Overs(10.0d);
        matchModel.setTeam1Wickets("Team1 Wickets");
        matchModel.setTeam2(teamModel1);
        matchModel.setTeam2Description("Team2 Description");
        matchModel.setTeam2Overs(10.0d);
        matchModel.setTeam2Wickets("Team2 Wickets");
        matchModel.setTime("Time");
        matchModel.setVenue("Venue");
        when(this.matchService.get(anyInt())).thenReturn(matchModel);
        MockHttpServletRequestBuilder getResult = MockMvcRequestBuilders.get("/editmatch/{matchid}", 42, "Uri Vars");
        getResult.contentType("https://example.org/example");
        MockMvcBuilders.standaloneSetup(this.matchController)
                .build()
                .perform(getResult)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.model().size(2))
                .andExpect(MockMvcResultMatchers.model().attributeExists("match", "teamList"))
                .andExpect(MockMvcResultMatchers.view().name("updateMatch"))
                .andExpect(MockMvcResultMatchers.forwardedUrl("updateMatch"));
    }

    /**
     * Method under test: {@link MatchController#showEditScore(String)}
     */
    @Test
    void testShowEditScore() throws Exception {
        when(this.teamService.listAll()).thenReturn(new ArrayList<>());

        TeamModel teamModel = new TeamModel();
        teamModel.setCaptain("Captain");
        teamModel.setId(123L);
        teamModel.setPlayersModel(new ArrayList<>());
        teamModel.setPointModels(new ArrayList<>());
        teamModel.setState("MD");
        teamModel.setTeamname("Teamname");

        TeamModel teamModel1 = new TeamModel();
        teamModel1.setCaptain("Captain");
        teamModel1.setId(123L);
        teamModel1.setPlayersModel(new ArrayList<>());
        teamModel1.setPointModels(new ArrayList<>());
        teamModel1.setState("MD");
        teamModel1.setTeamname("Teamname");

        MatchModel matchModel = new MatchModel();
        matchModel.setMatchid(1);
        matchModel.setResult("Result");
        matchModel.setScheduledate("2020-03-01");
        matchModel.setTeam1(teamModel);
        matchModel.setTeam1Description("Team1 Description");
        matchModel.setTeam1Overs(10.0d);
        matchModel.setTeam1Wickets("Team1 Wickets");
        matchModel.setTeam2(teamModel1);
        matchModel.setTeam2Description("Team2 Description");
        matchModel.setTeam2Overs(10.0d);
        matchModel.setTeam2Wickets("Team2 Wickets");
        matchModel.setTime("Time");
        matchModel.setVenue("Venue");
        when(this.matchService.get(anyInt())).thenReturn(matchModel);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/editScore/{matchid}", 42, "Uri Vars");
        MockMvcBuilders.standaloneSetup(this.matchController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.model().size(2))
                .andExpect(MockMvcResultMatchers.model().attributeExists("match", "teamList"))
                .andExpect(MockMvcResultMatchers.view().name("UpdateScore"))
                .andExpect(MockMvcResultMatchers.forwardedUrl("UpdateScore"));
    }

    /**
     * Method under test: {@link MatchController#showEditScore(String)}
     */
    @Test
    void testShowEditScore2() throws Exception {
        when(this.teamService.listAll()).thenReturn(new ArrayList<>());

        TeamModel teamModel = new TeamModel();
        teamModel.setCaptain("Captain");
        teamModel.setId(123L);
        teamModel.setPlayersModel(new ArrayList<>());
        teamModel.setPointModels(new ArrayList<>());
        teamModel.setState("MD");
        teamModel.setTeamname("Teamname");

        TeamModel teamModel1 = new TeamModel();
        teamModel1.setCaptain("Captain");
        teamModel1.setId(123L);
        teamModel1.setPlayersModel(new ArrayList<>());
        teamModel1.setPointModels(new ArrayList<>());
        teamModel1.setState("MD");
        teamModel1.setTeamname("Teamname");

        MatchModel matchModel = new MatchModel();
        matchModel.setMatchid(1);
        matchModel.setResult("Result");
        matchModel.setScheduledate("2020-03-01");
        matchModel.setTeam1(teamModel);
        matchModel.setTeam1Description("Team1 Description");
        matchModel.setTeam1Overs(10.0d);
        matchModel.setTeam1Wickets("Team1 Wickets");
        matchModel.setTeam2(teamModel1);
        matchModel.setTeam2Description("Team2 Description");
        matchModel.setTeam2Overs(10.0d);
        matchModel.setTeam2Wickets("Team2 Wickets");
        matchModel.setTime("Time");
        matchModel.setVenue("Venue");
        when(this.matchService.get(anyInt())).thenReturn(matchModel);
        MockHttpServletRequestBuilder getResult = MockMvcRequestBuilders.get("/editScore/{matchid}", 42, "Uri Vars");
        getResult.contentType("https://example.org/example");
        MockMvcBuilders.standaloneSetup(this.matchController)
                .build()
                .perform(getResult)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.model().size(2))
                .andExpect(MockMvcResultMatchers.model().attributeExists("match", "teamList"))
                .andExpect(MockMvcResultMatchers.view().name("UpdateScore"))
                .andExpect(MockMvcResultMatchers.forwardedUrl("UpdateScore"));
    }

    /**
     * Method under test: {@link MatchController#updateMatch(com.model.MatchModel, org.springframework.validation.BindingResult, org.springframework.web.servlet.mvc.support.RedirectAttributes)}
     */
    @Test
    void testUpdateMatch() throws Exception {
        when(this.matchService.DateIsExist((String) any(), (org.springframework.validation.BindingResult) any()))
                .thenReturn(true);
        when(this.matchService.venueExists((String) any(), (org.springframework.validation.BindingResult) any()))
                .thenReturn(true);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.post("/upMatch");
        MockMvcBuilders.standaloneSetup(this.matchController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.model().size(1))
                .andExpect(MockMvcResultMatchers.model().attributeExists("match"))
                .andExpect(MockMvcResultMatchers.view().name("updateMatch"))
                .andExpect(MockMvcResultMatchers.forwardedUrl("updateMatch"));
    }

    /**
     * Method under test: {@link MatchController#updateMatch(com.model.MatchModel, org.springframework.validation.BindingResult, org.springframework.web.servlet.mvc.support.RedirectAttributes)}
     */
    @Test
    void testUpdateMatch2() throws Exception {
        when(this.matchService.DateIsExist((String) any(), (org.springframework.validation.BindingResult) any()))
                .thenReturn(false);
        when(this.matchService.venueExists((String) any(), (org.springframework.validation.BindingResult) any()))
                .thenReturn(true);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.post("/upMatch");
        MockMvcBuilders.standaloneSetup(this.matchController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.model().size(1))
                .andExpect(MockMvcResultMatchers.model().attributeExists("match"))
                .andExpect(MockMvcResultMatchers.view().name("updateMatch"))
                .andExpect(MockMvcResultMatchers.forwardedUrl("updateMatch"));
    }

    /**
     * Method under test: {@link MatchController#updateMatch(com.model.MatchModel, org.springframework.validation.BindingResult, org.springframework.web.servlet.mvc.support.RedirectAttributes)}
     */
    @Test
    void testUpdateMatch3() throws Exception {
        when(this.matchService.DateIsExist((String) any(), (org.springframework.validation.BindingResult) any()))
                .thenReturn(true);
        when(this.matchService.venueExists((String) any(), (org.springframework.validation.BindingResult) any()))
                .thenReturn(false);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.post("/upMatch");
        MockMvcBuilders.standaloneSetup(this.matchController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.model().size(1))
                .andExpect(MockMvcResultMatchers.model().attributeExists("match"))
                .andExpect(MockMvcResultMatchers.view().name("updateMatch"))
                .andExpect(MockMvcResultMatchers.forwardedUrl("updateMatch"));
    }
}

