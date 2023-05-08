package com.backend.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig  {
    @Bean
    public PasswordEncoder getPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.authorizeRequests().requestMatchers(new AntPathRequestMatcher("/**")).permitAll();
        http.cors().disable()			//cors 방지
                .csrf().disable()			//csrf 방지
                .formLogin().disable()		//기본 로그인페이지 없애기
                .headers().frameOptions().disable()
                .and().formLogin().loginPage("/user/login").defaultSuccessUrl("/question/list").and().logout().logoutRequestMatcher(new AntPathRequestMatcher("/user/logout")).logoutSuccessUrl("/user/login")
                .invalidateHttpSession(true);

        return http.build();
    }

}