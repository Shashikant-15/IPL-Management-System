package com.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class LoginTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>default or parameterless constructor of {@link Login}
     *   <li>{@link Login#setId(Long)}
     *   <li>{@link Login#setPassword(String)}
     *   <li>{@link Login#setUsername(String)}
     *   <li>{@link Login#getId()}
     *   <li>{@link Login#getPassword()}
     *   <li>{@link Login#getUsername()}
     * </ul>
     */
    @Test
    void testConstructor() {
        Login actualLogin = new Login();
        actualLogin.setId(123L);
        actualLogin.setPassword("iloveyou");
        actualLogin.setUsername("janedoe");
        assertEquals(123L, actualLogin.getId().longValue());
        assertEquals("iloveyou", actualLogin.getPassword());
        assertEquals("janedoe", actualLogin.getUsername());
    }
}

