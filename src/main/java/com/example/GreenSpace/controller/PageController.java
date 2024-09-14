/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.GreenSpace.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author IBMUSER
 */

@Controller
public class PageController {
    @GetMapping("/")
    public String index() {
        return "index"; 
    }

    @GetMapping("/about")
    public String about() {
        return "about"; 
    }
    
    @GetMapping("/ecoguide")
    public String ecoguide() {
        return "ecoguide"; 
    }
    
    @GetMapping("/gallery")
    public String gallery() {
        return "gallery"; 
    }
    
    @GetMapping("/contact")
    public String contact() {
        return "contact"; 
    }

    @GetMapping("/maincart")
    public String maincart() {
        return "maincart"; 
    }
    
    @GetMapping("/cart")
    public String cart() {
        return "cart"; 
    }
    
    @GetMapping("/greencart")
    public String greencart() {
        return "greencart"; 
    }
    
    @GetMapping("/signin")
    public String signin() {
        return "signin";
    }
    
    @GetMapping("/page/signup")
    public String signup() {
        return "signup"; 
    }

}
