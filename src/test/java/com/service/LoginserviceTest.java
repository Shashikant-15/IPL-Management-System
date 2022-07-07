package com.service;

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.dao.LoginRepository;
import com.model.Login;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ContextConfiguration(classes = {Loginservice.class})
@ExtendWith(SpringExtension.class)
class LoginserviceTest {
    @MockBean
    private LoginRepository loginRepository;

    @Autowired
    private Loginservice loginservice;

    /**
     * Method under test: {@link Loginservice#login(String, String)}
     */
    @Test
    void testLogin() {
        Login login = new Login();
        login.setId(123L);
        login.setPassword("iloveyou");
        login.setUsername("janedoe");
        when(this.loginRepository.findByUsernameAndPassword((String) any(), (String) any())).thenReturn(login);
        assertSame(login, this.loginservice.login("janedoe", "iloveyou"));
        verify(this.loginRepository).findByUsernameAndPassword((String) any(), (String) any());
    }
}

