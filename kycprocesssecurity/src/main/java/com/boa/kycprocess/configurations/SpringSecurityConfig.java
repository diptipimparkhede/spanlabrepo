package com.boa.kycprocess.configurations;

  import java.util.ArrayList; import java.util.Arrays; import java.util.List;
  
  import org.springframework.beans.factory.annotation.Autowired; import
  org.springframework.context.annotation.Bean; import
  org.springframework.context.annotation.Configuration; import
  org.springframework.http.HttpMethod; import
  org.springframework.security.access.AccessDecisionManager; import
  org.springframework.security.access.AccessDecisionVoter; import
  org.springframework.security.access.vote.AuthenticatedVoter; import
  org.springframework.security.access.vote.RoleVoter; import
  org.springframework.security.access.vote.UnanimousBased; import
  org.springframework.security.config.annotation.authentication.builders.
  AuthenticationManagerBuilder; import
  org.springframework.security.config.annotation.web.builders.HttpSecurity;
  import
  org.springframework.security.config.annotation.web.builders.WebSecurity;
  import org.springframework.security.config.annotation.web.configuration.
  EnableWebSecurity; import
  org.springframework.security.config.annotation.web.configuration.
  WebSecurityConfigurerAdapter; import
  org.springframework.security.core.userdetails.UserDetailsService; import
  org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder; import
  org.springframework.security.crypto.factory.PasswordEncoderFactories; import
  org.springframework.security.crypto.password.PasswordEncoder; import
  org.springframework.security.web.access.AccessDeniedHandler; import
  org.springframework.security.web.access.expression.WebExpressionVoter;

  
  @Configuration 
  @EnableWebSecurity public class SpringSecurityConfig
  extends WebSecurityConfigurerAdapter {
  
  @Autowired private UserDetailsService userDetailsService;
  
  @Autowired private CustomSuccessHandler customSuccessHandler;
  
  @Override protected void configure(AuthenticationManagerBuilder auth) throws
  Exception {
  
  
  auth.userDetailsService(userDetailsService) .passwordEncoder(new
  BCryptPasswordEncoder());
  
  }
  
  @Override protected void configure(HttpSecurity http) throws Exception {
  
  
  
  http.authorizeRequests() .antMatchers("/getcutomers").access("hasRole('ROLE_ADMIN')")
  .antMatchers(HttpMethod.GET, "/getcutomers").hasRole("ADMIN") .and() .formLogin()
  .loginPage("/login").successHandler(customSuccessHandler)
  .failureUrl("/error") .and() .logout() .logoutSuccessUrl("/");
  
  }
  
  
  }
 