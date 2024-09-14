/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.GreenSpace.controller;

import com.example.GreenSpace.entity.User;
import com.example.GreenSpace.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author IBMUSER
 */

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    // Show the signup form
    @GetMapping("/signup")
    public String showSignupForm(Model model) {
        model.addAttribute("user", new User());
        return "signup";
    }

    // Handle the form submission
    @PostMapping("/signup")
    public String registerUser(@ModelAttribute("user") @Valid User user, Model model) {
        userService.saveUser(user);
        model.addAttribute("message", "User registered successfully!");
        return "signin";
    }
    
    /*@PostMapping("/signin")
    public String signin(@RequestParam("email") String email, @RequestParam("password") String password, Model model) {
        User user = userService.authenticateUser(email, password);
        
        if (user != null) {
            // Successful sign-in logic
            return "ecoguide";  
        } else {
            model.addAttribute("error", "Invalid email or password");
            return "signin";  // Redirect back to sign-in page on failure
        }
    }*/
    
    @PostMapping("/signin")
    public String signin(@RequestParam("email") String email, @RequestParam("password") String password, Model model) {
        User user = userService.authenticateUser(email, password);
        
        if (user != null) {
    // Successful user sign-in logic
    return "ecoguide";  // Redirect to the ecoguide page for regular users
} else if (email.equals("admin@gmail.com") && password.equals("123")) {
    // Successful admin login
    return "greencart";  // Redirect to the greencart page for admin
} else {
    model.addAttribute("error", "Invalid email or password");
    return "signin";  // Redirect back to sign-in page on failure
}

    }

}
