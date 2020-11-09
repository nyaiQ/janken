package oit.is.z1416.kaizi.janken.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class Lec03AuthConfiguration extends WebSecurityConfigurerAdapter {

  @Override
  protected void configure(AuthenticationManagerBuilder auth) throws Exception {

    // user1 PassWord
    auth.inMemoryAuthentication().withUser("user1")
        .password("$2y$10$FXJWO9xuUSHoYsRh2IcvXuMIZfgcNxphtXRGeqGao91vfMF5Rs4jC").roles("USER");
    // user2 pasSworD
    auth.inMemoryAuthentication().withUser("user2")
        .password("$2y$10$pbxhtDWId/O/yHXW7OyA8.Obud6ESjcAjmQF4s5lKTOJaAZlMHGUy").roles("USER");
    // かしわ kashiwa
    auth.inMemoryAuthentication().withUser("かしわ")
        .password("$2y$10$Cab15/XpuZYeAMfxunpjfOmI5t2nAcF22/8tKfLsGnDpjr7ch4vkm").roles("USER");
  }

  @Bean
  PasswordEncoder passwordEncoder() {
    return new BCryptPasswordEncoder();
  }

  @Override
  protected void configure(HttpSecurity http) throws Exception {

    http.formLogin();

    http.authorizeRequests().antMatchers("/lec02/**").authenticated();

    http.csrf().disable();
    http.headers().frameOptions().disable();

    http.logout().logoutSuccessUrl("/");
  }

}
