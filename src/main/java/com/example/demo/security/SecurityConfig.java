// package com.example.demo.security;

// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;
// import org.springframework.security.authentication.AuthenticationManager;
// import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
// import org.springframework.security.config.annotation.web.builders.HttpSecurity;
// import org.springframework.security.config.http.SessionCreationPolicy;
// import org.springframework.security.web.SecurityFilterChain;
// import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

// @Configuration
// public class SecurityConfig {

//     private final JwtAuthenticationFilter jwtFilter;

//     public SecurityConfig(JwtAuthenticationFilter jwtFilter) {
//         this.jwtFilter = jwtFilter;
//     }

//     @Bean
//     public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {

//         http
//             .csrf(csrf -> csrf.disable())
//             .sessionManagement(session ->
//                 session.sessionCreationPolicy(SessionCreationPolicy.STATELESS)
//             )
//             .authorizeHttpRequests(auth -> auth
//                 .requestMatchers(
//                         "/api/auth/**",
//                         "/swagger-ui/**",
//                         "/v3/api-docs/**"
//                 ).permitAll()
//                 .anyRequest().authenticated()
//             )
//             .addFilterBefore(jwtFilter, UsernamePasswordAuthenticationFilter.class);

//         return http.build();
//     }

//     @Bean
//     public AuthenticationManager authenticationManager(
//             AuthenticationConfiguration config) throws Exception {
//         return config.getAuthenticationManager();
//     }
// }
package com.example.demo.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
public class SecurityConfig {

    private final JwtAuthenticationFilter jwtFilter;

    public SecurityConfig(JwtAuthenticationFilter jwtFilter) {
        this.jwtFilter = jwtFilter;
    }

  @Bean
public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {

    http
        .csrf(csrf -> csrf.disable())
        .sessionManagement(session ->
            session.sessionCreationPolicy(SessionCreationPolicy.STATELESS)
        )
        .authorizeHttpRequests(auth -> auth
            .requestMatchers(
                // "/api/auth/**",

                // // ✅ ADD ALL YOUR API PATHS HERE
                // "/api/employees/**",
                // "/api/anomalies/**",
                // "/api/anomaly-rules/**",
                // "/api/team-file-summary/**",
                // "/api/productivity-metrics/**",

                // // swagger
                // "/swagger-ui/**",
                // "/v3/api-docs/**"
                  "/",                     // ✅ REQUIRED
        "/index.html",
        "/favicon.ico",

        "/swagger-ui/**",         // ✅ Swagger UI
        "/v3/api-docs/**",

        "/api/auth/**",           // APIs
        "/api/metrics/**",
        "/api/employees/**",
        "/api/anomalies/**",
        "/api/anomaly-rules/**",
        "/api/team-file-summary/**"
            ).permitAll()
            .anyRequest().authenticated()
        )
        .addFilterBefore(jwtFilter, UsernamePasswordAuthenticationFilter.class);

    return http.build();
}


    @Bean
    public AuthenticationManager authenticationManager(
            AuthenticationConfiguration config) throws Exception {
        return config.getAuthenticationManager();
    }
}
