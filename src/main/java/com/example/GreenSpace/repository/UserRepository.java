/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.GreenSpace.repository;

import com.example.GreenSpace.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 *
 * @author IBMUSER
 */
public interface UserRepository extends JpaRepository<User, Long>{ 
     User findByEmail(String email);
}
