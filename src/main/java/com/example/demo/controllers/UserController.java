package com.example.demo.controllers;

import com.example.demo.entities.User;
import com.example.demo.services.IUserService;
import de.mkammerer.argon2.Argon2;
import de.mkammerer.argon2.Argon2Factory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import org.slf4j.Logger;

@RestController
public class UserController {

    @Autowired
    private Logger loggerZZ;

    @Autowired
    private IUserService service;

    @GetMapping("/api/users")
    public List<User> getAll() {
        return service.getAll();
    }

    @GetMapping("/api/users/{id}")
    public User getById(@PathVariable String id) {
        return service.getById(Long.parseLong(id));
    }

    @DeleteMapping("/api/users/{id}")
    public void remove(@PathVariable String id) {
        service.remove(Long.parseLong(id));
    }

    @PostMapping("/api/users")
    public void save(@RequestBody User user) {

        Argon2 argon2 = Argon2Factory.create(Argon2Factory.Argon2Types.ARGON2id);
        String hash = argon2.hash(1, 1024, 1, user.getPassword());
        user.setPassword(hash);
        service.save(user);
    }

    // Add a login endpoint
    @PostMapping("/api/login")
    public ResponseEntity<String> login(@RequestBody User user) {
        // Validate credentials and generate a token if valid
        //loggerZZ.debug("Hello!!!debug aitorrrr");
        //loggerZZ.info("Hello!!!info aitorrrr");
        System.out.println("Hello!!!systemoutprintln aitorrrr");
        if (isValidCredentials(user)) {
            String token = generateAuthToken(); // Implement a method to generate a secure token

            System.out.println("Ok:"+token);

            return ResponseEntity.ok(token);
//            return ResponseEntity.ok("aitorrrrrrrtoken");
        } else {
            System.out.println("Error");
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid credentials");
        }
    }

    private boolean isValidCredentials(User user) {
        // Implement logic to check username and password against the database
        // You may use UserRepository or IUserService to fetch user details and verify the password
        // Return true if credentials are valid, false otherwise
        try {
            // Attempt to retrieve the user based on provided credentials

            System.out.println("systemoutprintln:aitorrrrrrrrrrrrr00");

            User authenticatedUser = service.obtenerUsuarioPorCredenciales(user);

            // If the authenticatedUser is not null, credentials are valid
            return authenticatedUser != null;
        } catch (Exception e) {
            // Log or handle exceptions appropriately
            return false;
        }    }

    // Implement a method to generate a secure authentication token
    private String generateAuthToken() {
        // Your implementation for generating a secure token
        // This could be a JWT or a session token
        return "your_generated_token";
    }



}
