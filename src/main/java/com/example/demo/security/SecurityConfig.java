// package com.example.demo.security;

// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;
// import org.springframework.security.config.annotation.web.builders.HttpSecurity;
// import org.springframework.security.config.http.SessionCreationPolicy;
// import org.springframework.security.web.SecurityFilterChain;
// import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
// import org.springframework.web.cors.CorsConfiguration;
// import org.springframework.web.cors.CorsConfigurationSource;
// import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

// import java.util.List;

// @Configuration
// public class SecurityConfig {

//     private final JwtAuthenticationFilter jwtAuthenticationFilter;

//     public SecurityConfig(JwtAuthenticationFilter jwtAuthenticationFilter) {
//         this.jwtAuthenticationFilter = jwtAuthenticationFilter;
//     }

//     @Bean
//     public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {

//         http
//             .cors(cors -> cors.configurationSource(corsConfigurationSource()))
//             .csrf(csrf -> csrf.disable())
//             .sessionManagement(session ->
//                     session.sessionCreationPolicy(SessionCreationPolicy.STATELESS)
//             )
//             .authorizeHttpRequests(auth -> auth
//                     .requestMatchers("/auth/**").permitAll()
//                     .anyRequest().authenticated()
//             )
//             .addFilterBefore(
//                     jwtAuthenticationFilter,
//                     UsernamePasswordAuthenticationFilter.class
//             );

//         return http.build();
//     }

//     @Bean
//     public CorsConfigurationSource corsConfigurationSource() {

//         CorsConfiguration config = new CorsConfiguration();
//         config.setAllowedOrigins(List.of("*"));
//         config.setAllowedMethods(
//                 List.of("GET", "POST", "PUT", "DELETE", "OPTIONS")
//         );
//         config.setAllowedHeaders(List.of("*"));

//         UrlBasedCorsConfigurationSource source =
//                 new UrlBasedCorsConfigurationSource();
//         source.registerCorsConfiguration("/**", config);

//         return source;
//     }
// }


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

//     @Bean
//     public JwtAuthenticationFilter jwtAuthenticationFilter() {
//         return new JwtAuthenticationFilter();
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
//                           "/",                     // ✅ REQUIRED
//         "/index.html",
//         "/favicon.ico",

//         "/swagger-ui/**",         // ✅ Swagger UI
//         "/v3/api-docs/**",

//         "/api/auth/**",           // APIs
//         "/api/metrics/**",
//         "/api/employees/**",
//         "/api/anomalies/**",
//         "/api/anomaly-rules/**",
//         "/api/team-summary/**"
//                 ).permitAll()
//                 .anyRequest().authenticated()
//             )
//             .addFilterBefore(
//                     jwtAuthenticationFilter(),
//                     UsernamePasswordAuthenticationFilter.class
//             );

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
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
            .csrf(csrf -> csrf.disable())
            .authorizeHttpRequests(auth -> auth
                .anyRequest().permitAll()
            );

        return http.build();
    }
}
