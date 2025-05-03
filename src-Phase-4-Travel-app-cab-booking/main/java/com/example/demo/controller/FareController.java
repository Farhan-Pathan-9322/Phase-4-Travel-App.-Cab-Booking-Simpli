package com.example.demo.controller;

import com.example.demo.service.FareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/fare")
public class FareController {

    @Autowired
    private FareService fareService;

    @GetMapping
    public double calculateFare(@RequestParam int distance) {
        return fareService.calculateFare(distance);
    }
}
