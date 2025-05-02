package com.finalproject.calitatesoftware;

import com.finalproject.calitatesoftware.domain.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CalitateSoftwareApplication {

    public static void main(String[] args) {
        SpringApplication.run(CalitateSoftwareApplication.class, args);
    }

//    @GetMapping
//    public String HelloWorld(){
//        return "Hello World";
//    }
//
//    @GetMapping("/user")
//    public User getUser() {
//        User user = new User();
//        user.setId(1L);
//        user.setUsername("admin");
//        user.setPassword("admin");
//        user.setAddress("adresa");
//        user.setEmail("admin@email.com");
//        return user;
//    }
}
