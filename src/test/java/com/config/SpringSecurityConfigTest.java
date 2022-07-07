package com.config;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.HashMap;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.ApplicationContext;
import org.springframework.security.authentication.AuthenticationTrustResolver;
import org.springframework.security.authentication.ProviderManager;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.ObjectPostProcessor;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.web.accept.ContentNegotiationStrategy;

@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_EACH_TEST_METHOD)
@ContextConfiguration(classes = {SpringSecurityConfig.class, AuthenticationConfiguration.class})
@ExtendWith(SpringExtension.class)
class SpringSecurityConfigTest {
    @Autowired
    private ApplicationContext applicationContext;

    @MockBean
    private AuthenticationTrustResolver authenticationTrustResolver;

    @MockBean
    private ContentNegotiationStrategy contentNegotiationStrategy;

    @Autowired
    private ObjectPostProcessor<Object> objectPostProcessor;

    @Autowired
    private SpringSecurityConfig springSecurityConfig;

    /**
     * Method under test: {@link SpringSecurityConfig#configure(AuthenticationManagerBuilder)}
     */
    @Test
    void testConfigure() throws Exception {
        AuthenticationManagerBuilder authenticationManagerBuilder = new AuthenticationManagerBuilder(
                this.objectPostProcessor);
        this.springSecurityConfig.configure(authenticationManagerBuilder);
        assertTrue(authenticationManagerBuilder
                .getDefaultUserDetailsService() instanceof org.springframework.security.provisioning.InMemoryUserDetailsManager);
        assertTrue(((DaoAuthenticationProvider) ((ProviderManager) authenticationManagerBuilder.getOrBuild()).getProviders()
                .get(0)).getUserCache() instanceof org.springframework.security.core.userdetails.cache.NullUserCache);
        assertTrue(((DaoAuthenticationProvider) ((ProviderManager) authenticationManagerBuilder.getOrBuild()).getProviders()
                .get(0)).isHideUserNotFoundExceptions());
        assertFalse(
                ((DaoAuthenticationProvider) ((ProviderManager) authenticationManagerBuilder.getOrBuild()).getProviders()
                        .get(0)).isForcePrincipalAsString());
    }

    /**
     * Method under test: {@link SpringSecurityConfig#configure(AuthenticationManagerBuilder)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testConfigure2() throws Exception {
        // TODO: Complete this test.
        //   test threw
        //   java.lang.NullPointerException
        //       at com.config.SpringSecurityConfig.configure(SpringSecurityConfig.java:15)
        //   In order to prevent configure(AuthenticationManagerBuilder)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in

        this.springSecurityConfig.configure((AuthenticationManagerBuilder) null);
    }

    /**
     * Method under test: {@link SpringSecurityConfig#configure(HttpSecurity)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testConfigure3() throws Exception {
        // TODO: Complete this test.
        //   test threw
        //   java.lang.NullPointerException
        //       at org.springframework.security.config.annotation.web.configurers.ExpressionUrlAuthorizationConfigurer.<init>(ExpressionUrlAuthorizationConfigurer.java:109)
        //       at org.springframework.security.config.annotation.web.builders.HttpSecurity.authorizeRequests(HttpSecurity.java:1183)
        //       at com.config.SpringSecurityConfig.configure(SpringSecurityConfig.java:23)
        //   In order to prevent configure(HttpSecurity)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in

        AuthenticationManagerBuilder authenticationBuilder = new AuthenticationManagerBuilder(this.objectPostProcessor);
        this.springSecurityConfig
                .configure(new HttpSecurity(this.objectPostProcessor, authenticationBuilder, new HashMap<>()));
    }

    /**
     * Method under test: {@link SpringSecurityConfig#configure(HttpSecurity)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testConfigure4() throws Exception {
        // TODO: Complete this test.
        //   java.lang.NullPointerException
        //       at com.config.SpringSecurityConfig.configure(SpringSecurityConfig.java:22)
        //   In order to prevent configure(HttpSecurity)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in

        this.springSecurityConfig.configure((HttpSecurity) null);
    }

    /**
     * Method under test: {@link SpringSecurityConfig#passwordEncoder()}
     */
    @Test
    void testPasswordEncoder() {
        // TODO: Complete this test.
        //   Reason: R002 Missing observers.
        //   There are no fields that could be asserted on.

        SpringSecurityConfig.passwordEncoder();
    }
}

