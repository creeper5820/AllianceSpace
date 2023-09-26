package com.alliance.alliancespace.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfiguration
{
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception
    {
        return http
                .authorizeHttpRequests(conf ->
                        {
                            conf.anyRequest().authenticated();
                        }
                )
                .formLogin( conf ->
                        {
                            conf.loginProcessingUrl("/api/auth/login");
                            conf.permitAll();
                        }
                )
                .csrf(AbstractHttpConfigurer::disable)
                .build();
    }
}
