package com.hx.application1.service1;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PassWordEncodeUtil {
    public static void main(String[] args) {
        System.out.println(new BCryptPasswordEncoder().encode("123"));
    }
}
