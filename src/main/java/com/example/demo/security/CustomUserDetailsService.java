// package com.example.demo.security;

// import org.springframework.security.core.userdetails.UserDetails;
// import org.springframework.security.core.userdetails.UserDetailsService;
// import org.springframework.security.core.userdetails.UsernameNotFoundException;
// import org.springframework.security.core.userdetails.User;
// import org.springframework.stereotype.Service;

// import java.util.Collections;

// @Service
// public class CustomUserDetailsService implements UserDetailsService {

//     @Override
//     public UserDetails loadUserByUsername(String username)
//             throws UsernameNotFoundException {

//         // 🔹 Dummy user (replace with DB later)
//         if (!username.equals("admin")) {
//             throw new UsernameNotFoundException("User not found");
//         }

//         return User.builder()
//                 .username("admin")
//                 .password("$2a$10$7sCjv6F4LQe5ZbGZJ9WqPej6CjZkzH1zR0hV3YzQqkz6Z8Bq4u") 
//                 // password = admin123
//                 .authorities(Collections.emptyList())
//                 .build();
//     }
// }

package com.example.demo.security;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String username)
            throws UsernameNotFoundException {

        // TEMP (matches your login)
        if (!"admin".equals(username)) {
            throw new UsernameNotFoundException("User not found");
        }

        return User.withUsername("admin")
                .password("") // password not needed for JWT
                .roles("ADMIN")
                .build();
    }
}
