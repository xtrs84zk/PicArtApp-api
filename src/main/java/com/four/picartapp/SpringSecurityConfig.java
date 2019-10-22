package com.four.picartapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import javax.sql.DataSource;

@Configuration
@EnableWebSecurity
//@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private DataSource dataSource;
    @Value("${security-jdbc.user}")
    private String usersByUsernameQuery;
    @Value("${security.jdbc-authorities}")
    private String authoritiesByUsernameQuery;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        //alterar la tabla de productos para permitir alteraciones sólo al usuario autenticado como administrador
        http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
                .and().csrf().disable()
                .authorizeRequests().antMatchers(HttpMethod.GET, "/productoes/*").authenticated()
                .antMatchers(HttpMethod.DELETE, "/productoes/*").hasAuthority("")
                .antMatchers("/**").permitAll()
                .and().httpBasic();
    }

    //cifrado de contraseñas
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.jdbcAuthentication().dataSource(dataSource).usersByUsernameQuery(usersByUsernameQuery)
                .authoritiesByUsernameQuery(authoritiesByUsernameQuery)
                .passwordEncoder(new BCryptPasswordEncoder());
    }
}

