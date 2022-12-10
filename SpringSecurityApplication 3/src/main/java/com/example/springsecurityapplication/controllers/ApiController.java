package com.example.springsecurityapplication.controllers;


import org.springframework.data.jpa.repository.support.SimpleJpaRepository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@CrossOrigin(origins = "http://localhost:3001/")
@RestController
@RequestMapping("/api")
public class ApiController {
}