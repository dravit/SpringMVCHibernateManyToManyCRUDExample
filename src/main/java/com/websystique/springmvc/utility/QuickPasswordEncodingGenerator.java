package com.websystique.springmvc.utility;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
  
public class QuickPasswordEncodingGenerator {
  
    /**
     * @param args
     */
    public static void main(String[] args) {
            String password = "dravit";
            BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
            System.out.println(passwordEncoder.encode(password));
    }
  
}