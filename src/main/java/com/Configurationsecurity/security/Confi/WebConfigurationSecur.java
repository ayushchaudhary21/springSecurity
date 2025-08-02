package com.Configurationsecurity.security.Confi;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class WebConfigurationSecur {
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
       httpSecurity
               .csrf(csrf -> csrf.disable())
               .authorizeHttpRequests(
                            auth -> auth
                                    .requestMatchers("/register").permitAll()
                                       .anyRequest().authenticated()

                      )             .httpBasic(Customizer.withDefaults()
               ).formLogin(Customizer.withDefaults());
       return httpSecurity.build();
    }
}

/*    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
       httpSecurity
               .csrf(csrf -> csrf.disable())
               .authorizeHttpRequests(
                       request -> request.anyRequest().authenticated()

               ).httpBasic(Customizer.withDefaults()
               ).formLogin(Customizer.withDefaults());
       return httpSecurity.build();

    }
    basic configuraion controll
 */