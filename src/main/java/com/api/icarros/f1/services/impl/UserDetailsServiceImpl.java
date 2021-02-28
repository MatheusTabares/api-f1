package com.api.icarros.f1.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.api.icarros.f1.security.UserSpringSecurity;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private BCryptPasswordEncoder pe;

    @Value("${login.email}")
    private String loginEmail;

    @Value("${login.password}")
    private String loginPassword;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        if (!email.equals(loginEmail)) {
            throw new UsernameNotFoundException(email);
        }
        return new UserSpringSecurity(1, email, pe.encode(loginPassword));
    }

}
