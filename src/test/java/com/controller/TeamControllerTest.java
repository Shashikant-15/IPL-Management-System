package com.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.dao.TeamRepo;
import com.model.TeamModel;
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

@ContextConfiguration(classes = {TeamController.class})
@ExtendWith(SpringExtension.class)
class TeamControllerTest {
    @Autowired
    private TeamController teamController;

    @MockBean
    private TeamService teamService;

    /**
     * Method under test: {@link TeamController#add(org.springframework.ui.Model)}
     */
    @Test
    void testAdd() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   javax.servlet.ServletException: Circular view path [addTeam]: would dispatch back to the current handler URL [/addTeam] again. Check your ViewResolver setup! (Hint: This may be the result of an unspecified view, due to default view name generation.)
        //       at org.springframework.web.servlet.view.InternalResourceView.prepareForRendering(InternalResourceView.java:210)
        //       at org.springframework.web.servlet.view.InternalResourceView.renderMergedOutputModel(InternalResourceView.java:148)
        //       at org.springframework.web.servlet.view.AbstractView.render(AbstractView.java:316)
        //       at org.springframework.web.servlet.DispatcherServlet.render(DispatcherServlet.java:1400)
        //       at org.springframework.test.web.servlet.TestDispatcherServlet.render(TestDispatcherServlet.java:137)
        //       at org.springframework.web.servlet.DispatcherServlet.processDispatchResult(DispatcherServlet.java:1145)
        //       at org.springframework.web.servlet.DispatcherServlet.doDispatch(DispatcherServlet.java:1084)
        //       at org.springframework.web.servlet.DispatcherServlet.doService(DispatcherServlet.java:963)
        //       at org.springframework.web.servlet.FrameworkServlet.processRequest(FrameworkServlet.java:1006)
        //       at org.springframework.web.servlet.FrameworkServlet.doGet(FrameworkServlet.java:898)
        //       at javax.servlet.http.HttpServlet.service(HttpServlet.java:655)
        //       at org.springframework.web.servlet.FrameworkServlet.service(FrameworkServlet.java:883)
        //       at org.springframework.test.web.servlet.TestDispatcherServlet.service(TestDispatcherServlet.java:72)
        //       at javax.servlet.http.HttpServlet.service(HttpServlet.java:764)
        //       at org.springframework.mock.web.MockFilterChain$ServletFilterProxy.doFilter(MockFilterChain.java:167)
        //       at org.springframework.mock.web.MockFilterChain.doFilter(MockFilterChain.java:134)
        //       at org.springframework.test.web.servlet.MockMvc.perform(MockMvc.java:199)
        //   In order to prevent add(Model)
        //   from throwing ServletException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   add(Model).
        //   See https://diff.blue/R013 to resolve this issue.

        TeamController teamController = new TeamController(new TeamService(mock(TeamRepo.class)));
        assertEquals("addTeam", teamController.add(new ConcurrentModel()));
    }

    /**
     * Method under test: {@link TeamController#playerManagement(org.springframework.ui.Model)}
     */
    @Test
    void testPlayerManagement() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   javax.servlet.ServletException: Circular view path [editTeam]: would dispatch back to the current handler URL [/editTeam] again. Check your ViewResolver setup! (Hint: This may be the result of an unspecified view, due to default view name generation.)
        //       at org.springframework.web.servlet.view.InternalResourceView.prepareForRendering(InternalResourceView.java:210)
        //       at org.springframework.web.servlet.view.InternalResourceView.renderMergedOutputModel(InternalResourceView.java:148)
        //       at org.springframework.web.servlet.view.AbstractView.render(AbstractView.java:316)
        //       at org.springframework.web.servlet.DispatcherServlet.render(DispatcherServlet.java:1400)
        //       at org.springframework.test.web.servlet.TestDispatcherServlet.render(TestDispatcherServlet.java:137)
        //       at org.springframework.web.servlet.DispatcherServlet.processDispatchResult(DispatcherServlet.java:1145)
        //       at org.springframework.web.servlet.DispatcherServlet.doDispatch(DispatcherServlet.java:1084)
        //       at org.springframework.web.servlet.DispatcherServlet.doService(DispatcherServlet.java:963)
        //       at org.springframework.web.servlet.FrameworkServlet.processRequest(FrameworkServlet.java:1006)
        //       at org.springframework.web.servlet.FrameworkServlet.doGet(FrameworkServlet.java:898)
        //       at javax.servlet.http.HttpServlet.service(HttpServlet.java:655)
        //       at org.springframework.web.servlet.FrameworkServlet.service(FrameworkServlet.java:883)
        //       at org.springframework.test.web.servlet.TestDispatcherServlet.service(TestDispatcherServlet.java:72)
        //       at javax.servlet.http.HttpServlet.service(HttpServlet.java:764)
        //       at org.springframework.mock.web.MockFilterChain$ServletFilterProxy.doFilter(MockFilterChain.java:167)
        //       at org.springframework.mock.web.MockFilterChain.doFilter(MockFilterChain.java:134)
        //       at org.springframework.test.web.servlet.MockMvc.perform(MockMvc.java:199)
        //   In order to prevent playerManagement(Model)
        //   from throwing ServletException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   playerManagement(Model).
        //   See https://diff.blue/R013 to resolve this issue.

        TeamRepo teamRepo = mock(TeamRepo.class);
        when(teamRepo.findAll()).thenReturn(new ArrayList<>());
        TeamController teamController = new TeamController(new TeamService(teamRepo));
        assertEquals("editTeam", teamController.playerManagement(new ConcurrentModel()));
        verify(teamRepo).findAll();
    }

    /**
     * Method under test: {@link TeamController#playerManagement(org.springframework.ui.Model)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testPlayerManagement2() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   javax.servlet.ServletException: Circular view path [editTeam]: would dispatch back to the current handler URL [/editTeam] again. Check your ViewResolver setup! (Hint: This may be the result of an unspecified view, due to default view name generation.)
        //       at org.springframework.web.servlet.view.InternalResourceView.prepareForRendering(InternalResourceView.java:210)
        //       at org.springframework.web.servlet.view.InternalResourceView.renderMergedOutputModel(InternalResourceView.java:148)
        //       at org.springframework.web.servlet.view.AbstractView.render(AbstractView.java:316)
        //       at org.springframework.web.servlet.DispatcherServlet.render(DispatcherServlet.java:1400)
        //       at org.springframework.test.web.servlet.TestDispatcherServlet.render(TestDispatcherServlet.java:137)
        //       at org.springframework.web.servlet.DispatcherServlet.processDispatchResult(DispatcherServlet.java:1145)
        //       at org.springframework.web.servlet.DispatcherServlet.doDispatch(DispatcherServlet.java:1084)
        //       at org.springframework.web.servlet.DispatcherServlet.doService(DispatcherServlet.java:963)
        //       at org.springframework.web.servlet.FrameworkServlet.processRequest(FrameworkServlet.java:1006)
        //       at org.springframework.web.servlet.FrameworkServlet.doGet(FrameworkServlet.java:898)
        //       at javax.servlet.http.HttpServlet.service(HttpServlet.java:655)
        //       at org.springframework.web.servlet.FrameworkServlet.service(FrameworkServlet.java:883)
        //       at org.springframework.test.web.servlet.TestDispatcherServlet.service(TestDispatcherServlet.java:72)
        //       at javax.servlet.http.HttpServlet.service(HttpServlet.java:764)
        //       at org.springframework.mock.web.MockFilterChain$ServletFilterProxy.doFilter(MockFilterChain.java:167)
        //       at org.springframework.mock.web.MockFilterChain.doFilter(MockFilterChain.java:134)
        //       at org.springframework.test.web.servlet.MockMvc.perform(MockMvc.java:199)
        //   In order to prevent playerManagement(Model)
        //   from throwing ServletException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   playerManagement(Model).
        //   See https://diff.blue/R013 to resolve this issue.

        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at com.controller.TeamController.playerManagement(TeamController.java:56)
        //   In order to prevent playerManagement(Model)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   playerManagement(Model).
        //   See https://diff.blue/R013 to resolve this issue.

        TeamController teamController = new TeamController(null);
        teamController.playerManagement(new ConcurrentModel());
    }

    /**
     * Method under test: {@link TeamController#playerManagement(org.springframework.ui.Model)}
     */
    @Test
    void testPlayerManagement3() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   javax.servlet.ServletException: Circular view path [editTeam]: would dispatch back to the current handler URL [/editTeam] again. Check your ViewResolver setup! (Hint: This may be the result of an unspecified view, due to default view name generation.)
        //       at org.springframework.web.servlet.view.InternalResourceView.prepareForRendering(InternalResourceView.java:210)
        //       at org.springframework.web.servlet.view.InternalResourceView.renderMergedOutputModel(InternalResourceView.java:148)
        //       at org.springframework.web.servlet.view.AbstractView.render(AbstractView.java:316)
        //       at org.springframework.web.servlet.DispatcherServlet.render(DispatcherServlet.java:1400)
        //       at org.springframework.test.web.servlet.TestDispatcherServlet.render(TestDispatcherServlet.java:137)
        //       at org.springframework.web.servlet.DispatcherServlet.processDispatchResult(DispatcherServlet.java:1145)
        //       at org.springframework.web.servlet.DispatcherServlet.doDispatch(DispatcherServlet.java:1084)
        //       at org.springframework.web.servlet.DispatcherServlet.doService(DispatcherServlet.java:963)
        //       at org.springframework.web.servlet.FrameworkServlet.processRequest(FrameworkServlet.java:1006)
        //       at org.springframework.web.servlet.FrameworkServlet.doGet(FrameworkServlet.java:898)
        //       at javax.servlet.http.HttpServlet.service(HttpServlet.java:655)
        //       at org.springframework.web.servlet.FrameworkServlet.service(FrameworkServlet.java:883)
        //       at org.springframework.test.web.servlet.TestDispatcherServlet.service(TestDispatcherServlet.java:72)
        //       at javax.servlet.http.HttpServlet.service(HttpServlet.java:764)
        //       at org.springframework.mock.web.MockFilterChain$ServletFilterProxy.doFilter(MockFilterChain.java:167)
        //       at org.springframework.mock.web.MockFilterChain.doFilter(MockFilterChain.java:134)
        //       at org.springframework.test.web.servlet.MockMvc.perform(MockMvc.java:199)
        //   In order to prevent playerManagement(Model)
        //   from throwing ServletException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   playerManagement(Model).
        //   See https://diff.blue/R013 to resolve this issue.

        TeamService teamService = mock(TeamService.class);
        when(teamService.listAll()).thenReturn(new ArrayList<>());
        TeamController teamController = new TeamController(teamService);
        assertEquals("editTeam", teamController.playerManagement(new ConcurrentModel()));
        verify(teamService).listAll();
    }

    /**
     * Method under test: {@link TeamController#viewTeamsPage(org.springframework.ui.Model)}
     */
    @Test
    void testViewTeamsPage() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   javax.servlet.ServletException: Circular view path [Teams]: would dispatch back to the current handler URL [/Teams] again. Check your ViewResolver setup! (Hint: This may be the result of an unspecified view, due to default view name generation.)
        //       at org.springframework.web.servlet.view.InternalResourceView.prepareForRendering(InternalResourceView.java:210)
        //       at org.springframework.web.servlet.view.InternalResourceView.renderMergedOutputModel(InternalResourceView.java:148)
        //       at org.springframework.web.servlet.view.AbstractView.render(AbstractView.java:316)
        //       at org.springframework.web.servlet.DispatcherServlet.render(DispatcherServlet.java:1400)
        //       at org.springframework.test.web.servlet.TestDispatcherServlet.render(TestDispatcherServlet.java:137)
        //       at org.springframework.web.servlet.DispatcherServlet.processDispatchResult(DispatcherServlet.java:1145)
        //       at org.springframework.web.servlet.DispatcherServlet.doDispatch(DispatcherServlet.java:1084)
        //       at org.springframework.web.servlet.DispatcherServlet.doService(DispatcherServlet.java:963)
        //       at org.springframework.web.servlet.FrameworkServlet.processRequest(FrameworkServlet.java:1006)
        //       at org.springframework.web.servlet.FrameworkServlet.doGet(FrameworkServlet.java:898)
        //       at javax.servlet.http.HttpServlet.service(HttpServlet.java:655)
        //       at org.springframework.web.servlet.FrameworkServlet.service(FrameworkServlet.java:883)
        //       at org.springframework.test.web.servlet.TestDispatcherServlet.service(TestDispatcherServlet.java:72)
        //       at javax.servlet.http.HttpServlet.service(HttpServlet.java:764)
        //       at org.springframework.mock.web.MockFilterChain$ServletFilterProxy.doFilter(MockFilterChain.java:167)
        //       at org.springframework.mock.web.MockFilterChain.doFilter(MockFilterChain.java:134)
        //       at org.springframework.test.web.servlet.MockMvc.perform(MockMvc.java:199)
        //   In order to prevent viewTeamsPage(Model)
        //   from throwing ServletException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   viewTeamsPage(Model).
        //   See https://diff.blue/R013 to resolve this issue.

        TeamRepo teamRepo = mock(TeamRepo.class);
        when(teamRepo.findAll()).thenReturn(new ArrayList<>());
        TeamController teamController = new TeamController(new TeamService(teamRepo));
        assertEquals("Teams", teamController.viewTeamsPage(new ConcurrentModel()));
        verify(teamRepo).findAll();
    }

    /**
     * Method under test: {@link TeamController#viewTeamsPage(org.springframework.ui.Model)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testViewTeamsPage2() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   javax.servlet.ServletException: Circular view path [Teams]: would dispatch back to the current handler URL [/Teams] again. Check your ViewResolver setup! (Hint: This may be the result of an unspecified view, due to default view name generation.)
        //       at org.springframework.web.servlet.view.InternalResourceView.prepareForRendering(InternalResourceView.java:210)
        //       at org.springframework.web.servlet.view.InternalResourceView.renderMergedOutputModel(InternalResourceView.java:148)
        //       at org.springframework.web.servlet.view.AbstractView.render(AbstractView.java:316)
        //       at org.springframework.web.servlet.DispatcherServlet.render(DispatcherServlet.java:1400)
        //       at org.springframework.test.web.servlet.TestDispatcherServlet.render(TestDispatcherServlet.java:137)
        //       at org.springframework.web.servlet.DispatcherServlet.processDispatchResult(DispatcherServlet.java:1145)
        //       at org.springframework.web.servlet.DispatcherServlet.doDispatch(DispatcherServlet.java:1084)
        //       at org.springframework.web.servlet.DispatcherServlet.doService(DispatcherServlet.java:963)
        //       at org.springframework.web.servlet.FrameworkServlet.processRequest(FrameworkServlet.java:1006)
        //       at org.springframework.web.servlet.FrameworkServlet.doGet(FrameworkServlet.java:898)
        //       at javax.servlet.http.HttpServlet.service(HttpServlet.java:655)
        //       at org.springframework.web.servlet.FrameworkServlet.service(FrameworkServlet.java:883)
        //       at org.springframework.test.web.servlet.TestDispatcherServlet.service(TestDispatcherServlet.java:72)
        //       at javax.servlet.http.HttpServlet.service(HttpServlet.java:764)
        //       at org.springframework.mock.web.MockFilterChain$ServletFilterProxy.doFilter(MockFilterChain.java:167)
        //       at org.springframework.mock.web.MockFilterChain.doFilter(MockFilterChain.java:134)
        //       at org.springframework.test.web.servlet.MockMvc.perform(MockMvc.java:199)
        //   In order to prevent viewTeamsPage(Model)
        //   from throwing ServletException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   viewTeamsPage(Model).
        //   See https://diff.blue/R013 to resolve this issue.

        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at com.controller.TeamController.viewTeamsPage(TeamController.java:94)
        //   In order to prevent viewTeamsPage(Model)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   viewTeamsPage(Model).
        //   See https://diff.blue/R013 to resolve this issue.

        TeamController teamController = new TeamController(null);
        teamController.viewTeamsPage(new ConcurrentModel());
    }

    /**
     * Method under test: {@link TeamController#viewTeamsPage(org.springframework.ui.Model)}
     */
    @Test
    void testViewTeamsPage3() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   javax.servlet.ServletException: Circular view path [Teams]: would dispatch back to the current handler URL [/Teams] again. Check your ViewResolver setup! (Hint: This may be the result of an unspecified view, due to default view name generation.)
        //       at org.springframework.web.servlet.view.InternalResourceView.prepareForRendering(InternalResourceView.java:210)
        //       at org.springframework.web.servlet.view.InternalResourceView.renderMergedOutputModel(InternalResourceView.java:148)
        //       at org.springframework.web.servlet.view.AbstractView.render(AbstractView.java:316)
        //       at org.springframework.web.servlet.DispatcherServlet.render(DispatcherServlet.java:1400)
        //       at org.springframework.test.web.servlet.TestDispatcherServlet.render(TestDispatcherServlet.java:137)
        //       at org.springframework.web.servlet.DispatcherServlet.processDispatchResult(DispatcherServlet.java:1145)
        //       at org.springframework.web.servlet.DispatcherServlet.doDispatch(DispatcherServlet.java:1084)
        //       at org.springframework.web.servlet.DispatcherServlet.doService(DispatcherServlet.java:963)
        //       at org.springframework.web.servlet.FrameworkServlet.processRequest(FrameworkServlet.java:1006)
        //       at org.springframework.web.servlet.FrameworkServlet.doGet(FrameworkServlet.java:898)
        //       at javax.servlet.http.HttpServlet.service(HttpServlet.java:655)
        //       at org.springframework.web.servlet.FrameworkServlet.service(FrameworkServlet.java:883)
        //       at org.springframework.test.web.servlet.TestDispatcherServlet.service(TestDispatcherServlet.java:72)
        //       at javax.servlet.http.HttpServlet.service(HttpServlet.java:764)
        //       at org.springframework.mock.web.MockFilterChain$ServletFilterProxy.doFilter(MockFilterChain.java:167)
        //       at org.springframework.mock.web.MockFilterChain.doFilter(MockFilterChain.java:134)
        //       at org.springframework.test.web.servlet.MockMvc.perform(MockMvc.java:199)
        //   In order to prevent viewTeamsPage(Model)
        //   from throwing ServletException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   viewTeamsPage(Model).
        //   See https://diff.blue/R013 to resolve this issue.

        TeamService teamService = mock(TeamService.class);
        when(teamService.listAll()).thenReturn(new ArrayList<>());
        TeamController teamController = new TeamController(teamService);
        assertEquals("Teams", teamController.viewTeamsPage(new ConcurrentModel()));
        verify(teamService).listAll();
    }

    /**
     * Method under test: {@link TeamController#viewTeams1(org.springframework.ui.Model)}
     */
    @Test
    void testViewTeams1() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   javax.servlet.ServletException: Circular view path [Admin]: would dispatch back to the current handler URL [/Admin] again. Check your ViewResolver setup! (Hint: This may be the result of an unspecified view, due to default view name generation.)
        //       at org.springframework.web.servlet.view.InternalResourceView.prepareForRendering(InternalResourceView.java:210)
        //       at org.springframework.web.servlet.view.InternalResourceView.renderMergedOutputModel(InternalResourceView.java:148)
        //       at org.springframework.web.servlet.view.AbstractView.render(AbstractView.java:316)
        //       at org.springframework.web.servlet.DispatcherServlet.render(DispatcherServlet.java:1400)
        //       at org.springframework.test.web.servlet.TestDispatcherServlet.render(TestDispatcherServlet.java:137)
        //       at org.springframework.web.servlet.DispatcherServlet.processDispatchResult(DispatcherServlet.java:1145)
        //       at org.springframework.web.servlet.DispatcherServlet.doDispatch(DispatcherServlet.java:1084)
        //       at org.springframework.web.servlet.DispatcherServlet.doService(DispatcherServlet.java:963)
        //       at org.springframework.web.servlet.FrameworkServlet.processRequest(FrameworkServlet.java:1006)
        //       at org.springframework.web.servlet.FrameworkServlet.doGet(FrameworkServlet.java:898)
        //       at javax.servlet.http.HttpServlet.service(HttpServlet.java:655)
        //       at org.springframework.web.servlet.FrameworkServlet.service(FrameworkServlet.java:883)
        //       at org.springframework.test.web.servlet.TestDispatcherServlet.service(TestDispatcherServlet.java:72)
        //       at javax.servlet.http.HttpServlet.service(HttpServlet.java:764)
        //       at org.springframework.mock.web.MockFilterChain$ServletFilterProxy.doFilter(MockFilterChain.java:167)
        //       at org.springframework.mock.web.MockFilterChain.doFilter(MockFilterChain.java:134)
        //       at org.springframework.test.web.servlet.MockMvc.perform(MockMvc.java:199)
        //   In order to prevent viewTeams1(Model)
        //   from throwing ServletException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   viewTeams1(Model).
        //   See https://diff.blue/R013 to resolve this issue.

        TeamRepo teamRepo = mock(TeamRepo.class);
        when(teamRepo.findAll()).thenReturn(new ArrayList<>());
        TeamController teamController = new TeamController(new TeamService(teamRepo));
        assertEquals("Admin", teamController.viewTeams1(new ConcurrentModel()));
        verify(teamRepo).findAll();
    }

    /**
     * Method under test: {@link TeamController#viewTeams1(org.springframework.ui.Model)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testViewTeams12() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   javax.servlet.ServletException: Circular view path [Admin]: would dispatch back to the current handler URL [/Admin] again. Check your ViewResolver setup! (Hint: This may be the result of an unspecified view, due to default view name generation.)
        //       at org.springframework.web.servlet.view.InternalResourceView.prepareForRendering(InternalResourceView.java:210)
        //       at org.springframework.web.servlet.view.InternalResourceView.renderMergedOutputModel(InternalResourceView.java:148)
        //       at org.springframework.web.servlet.view.AbstractView.render(AbstractView.java:316)
        //       at org.springframework.web.servlet.DispatcherServlet.render(DispatcherServlet.java:1400)
        //       at org.springframework.test.web.servlet.TestDispatcherServlet.render(TestDispatcherServlet.java:137)
        //       at org.springframework.web.servlet.DispatcherServlet.processDispatchResult(DispatcherServlet.java:1145)
        //       at org.springframework.web.servlet.DispatcherServlet.doDispatch(DispatcherServlet.java:1084)
        //       at org.springframework.web.servlet.DispatcherServlet.doService(DispatcherServlet.java:963)
        //       at org.springframework.web.servlet.FrameworkServlet.processRequest(FrameworkServlet.java:1006)
        //       at org.springframework.web.servlet.FrameworkServlet.doGet(FrameworkServlet.java:898)
        //       at javax.servlet.http.HttpServlet.service(HttpServlet.java:655)
        //       at org.springframework.web.servlet.FrameworkServlet.service(FrameworkServlet.java:883)
        //       at org.springframework.test.web.servlet.TestDispatcherServlet.service(TestDispatcherServlet.java:72)
        //       at javax.servlet.http.HttpServlet.service(HttpServlet.java:764)
        //       at org.springframework.mock.web.MockFilterChain$ServletFilterProxy.doFilter(MockFilterChain.java:167)
        //       at org.springframework.mock.web.MockFilterChain.doFilter(MockFilterChain.java:134)
        //       at org.springframework.test.web.servlet.MockMvc.perform(MockMvc.java:199)
        //   In order to prevent viewTeams1(Model)
        //   from throwing ServletException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   viewTeams1(Model).
        //   See https://diff.blue/R013 to resolve this issue.

        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at com.controller.TeamController.viewTeams1(TeamController.java:107)
        //   In order to prevent viewTeams1(Model)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   viewTeams1(Model).
        //   See https://diff.blue/R013 to resolve this issue.

        TeamController teamController = new TeamController(null);
        teamController.viewTeams1(new ConcurrentModel());
    }

    /**
     * Method under test: {@link TeamController#viewTeams1(org.springframework.ui.Model)}
     */
    @Test
    void testViewTeams13() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   javax.servlet.ServletException: Circular view path [Admin]: would dispatch back to the current handler URL [/Admin] again. Check your ViewResolver setup! (Hint: This may be the result of an unspecified view, due to default view name generation.)
        //       at org.springframework.web.servlet.view.InternalResourceView.prepareForRendering(InternalResourceView.java:210)
        //       at org.springframework.web.servlet.view.InternalResourceView.renderMergedOutputModel(InternalResourceView.java:148)
        //       at org.springframework.web.servlet.view.AbstractView.render(AbstractView.java:316)
        //       at org.springframework.web.servlet.DispatcherServlet.render(DispatcherServlet.java:1400)
        //       at org.springframework.test.web.servlet.TestDispatcherServlet.render(TestDispatcherServlet.java:137)
        //       at org.springframework.web.servlet.DispatcherServlet.processDispatchResult(DispatcherServlet.java:1145)
        //       at org.springframework.web.servlet.DispatcherServlet.doDispatch(DispatcherServlet.java:1084)
        //       at org.springframework.web.servlet.DispatcherServlet.doService(DispatcherServlet.java:963)
        //       at org.springframework.web.servlet.FrameworkServlet.processRequest(FrameworkServlet.java:1006)
        //       at org.springframework.web.servlet.FrameworkServlet.doGet(FrameworkServlet.java:898)
        //       at javax.servlet.http.HttpServlet.service(HttpServlet.java:655)
        //       at org.springframework.web.servlet.FrameworkServlet.service(FrameworkServlet.java:883)
        //       at org.springframework.test.web.servlet.TestDispatcherServlet.service(TestDispatcherServlet.java:72)
        //       at javax.servlet.http.HttpServlet.service(HttpServlet.java:764)
        //       at org.springframework.mock.web.MockFilterChain$ServletFilterProxy.doFilter(MockFilterChain.java:167)
        //       at org.springframework.mock.web.MockFilterChain.doFilter(MockFilterChain.java:134)
        //       at org.springframework.test.web.servlet.MockMvc.perform(MockMvc.java:199)
        //   In order to prevent viewTeams1(Model)
        //   from throwing ServletException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   viewTeams1(Model).
        //   See https://diff.blue/R013 to resolve this issue.

        TeamService teamService = mock(TeamService.class);
        when(teamService.listAll()).thenReturn(new ArrayList<>());
        TeamController teamController = new TeamController(teamService);
        assertEquals("Admin", teamController.viewTeams1(new ConcurrentModel()));
        verify(teamService).listAll();
    }

    /**
     * Method under test: {@link TeamController#deleteTeam(Long, org.springframework.web.servlet.mvc.support.RedirectAttributes)}
     */
    @Test
    void testDeleteTeam() throws Exception {
        doNothing().when(this.teamService).deleteTeams((Long) any());
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/deleteTeam/{id}", 123L);
        MockMvcBuilders.standaloneSetup(this.teamController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isFound())
                .andExpect(MockMvcResultMatchers.model().size(0))
                .andExpect(MockMvcResultMatchers.view().name("redirect:/editTeam"))
                .andExpect(MockMvcResultMatchers.redirectedUrl("/editTeam"));
    }

    /**
     * Method under test: {@link TeamController#deleteTeam(Long, org.springframework.web.servlet.mvc.support.RedirectAttributes)}
     */
    @Test
    void testDeleteTeam2() throws Exception {
        doNothing().when(this.teamService).deleteTeams((Long) any());
        MockHttpServletRequestBuilder getResult = MockMvcRequestBuilders.get("/deleteTeam/{id}", 123L);
        getResult.contentType("https://example.org/example");
        MockMvcBuilders.standaloneSetup(this.teamController)
                .build()
                .perform(getResult)
                .andExpect(MockMvcResultMatchers.status().isFound())
                .andExpect(MockMvcResultMatchers.model().size(0))
                .andExpect(MockMvcResultMatchers.view().name("redirect:/editTeam"))
                .andExpect(MockMvcResultMatchers.redirectedUrl("/editTeam"));
    }

    /**
     * Method under test: {@link TeamController#editTeamView(int)}
     */
    @Test
    void testEditTeamView() throws Exception {
        TeamModel teamModel = new TeamModel();
        teamModel.setCaptain("Captain");
        teamModel.setId(123L);
        teamModel.setPlayersModel(new ArrayList<>());
        teamModel.setPointModels(new ArrayList<>());
        teamModel.setState("MD");
        teamModel.setTeamname("Teamname");
        when(this.teamService.getIds((String) any())).thenReturn(teamModel);
        when(this.teamService.listAll()).thenReturn(new ArrayList<>());
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/teamEdit/{id}", 1);
        MockMvcBuilders.standaloneSetup(this.teamController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.model().size(2))
                .andExpect(MockMvcResultMatchers.model().attributeExists("team", "teamList"))
                .andExpect(MockMvcResultMatchers.view().name("updateTeam"))
                .andExpect(MockMvcResultMatchers.forwardedUrl("updateTeam"));
    }

    /**
     * Method under test: {@link TeamController#editTeamView(int)}
     */
    @Test
    void testEditTeamView2() throws Exception {
        TeamModel teamModel = new TeamModel();
        teamModel.setCaptain("Captain");
        teamModel.setId(123L);
        teamModel.setPlayersModel(new ArrayList<>());
        teamModel.setPointModels(new ArrayList<>());
        teamModel.setState("MD");
        teamModel.setTeamname("Teamname");
        when(this.teamService.getIds((String) any())).thenReturn(teamModel);
        when(this.teamService.listAll()).thenReturn(new ArrayList<>());
        MockHttpServletRequestBuilder getResult = MockMvcRequestBuilders.get("/teamEdit/{id}", 1);
        getResult.contentType("https://example.org/example");
        MockMvcBuilders.standaloneSetup(this.teamController)
                .build()
                .perform(getResult)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.model().size(2))
                .andExpect(MockMvcResultMatchers.model().attributeExists("team", "teamList"))
                .andExpect(MockMvcResultMatchers.view().name("updateTeam"))
                .andExpect(MockMvcResultMatchers.forwardedUrl("updateTeam"));
    }

    /**
     * Method under test: {@link TeamController#saveTeam(com.model.TeamModel, org.springframework.validation.BindingResult, org.springframework.web.servlet.mvc.support.RedirectAttributes)}
     */
    @Test
    void testSaveTeam() throws Exception {
        when(this.teamService.teamNameExists((String) any())).thenReturn(true);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.post("/save");
        MockMvcBuilders.standaloneSetup(this.teamController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.model().size(1))
                .andExpect(MockMvcResultMatchers.model().attributeExists("Team"))
                .andExpect(MockMvcResultMatchers.view().name("addTeam"))
                .andExpect(MockMvcResultMatchers.forwardedUrl("addTeam"));
    }

    /**
     * Method under test: {@link TeamController#saveTeam(com.model.TeamModel, org.springframework.validation.BindingResult, org.springframework.web.servlet.mvc.support.RedirectAttributes)}
     */
    @Test
    void testSaveTeam2() throws Exception {
        when(this.teamService.teamNameExists((String) any())).thenReturn(false);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.post("/save");
        MockMvcBuilders.standaloneSetup(this.teamController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.model().size(1))
                .andExpect(MockMvcResultMatchers.model().attributeExists("Team"))
                .andExpect(MockMvcResultMatchers.view().name("addTeam"))
                .andExpect(MockMvcResultMatchers.forwardedUrl("addTeam"));
    }

    /**
     * Method under test: {@link TeamController#updatePlayer(com.model.TeamModel, org.springframework.validation.BindingResult, org.springframework.web.servlet.mvc.support.RedirectAttributes)}
     */
    @Test
    void testUpdatePlayer() throws Exception {
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.post("/UpdateTeam");
        MockMvcBuilders.standaloneSetup(this.teamController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.model().size(1))
                .andExpect(MockMvcResultMatchers.model().attributeExists("Team"))
                .andExpect(MockMvcResultMatchers.view().name("updateTeam"))
                .andExpect(MockMvcResultMatchers.forwardedUrl("updateTeam"));
    }
}

