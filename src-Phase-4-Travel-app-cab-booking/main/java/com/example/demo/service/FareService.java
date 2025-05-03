package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class FareService {

    public double calculateFare(int distance) {
        double ratePerKm = 10.0; // Example rate
        return distance * ratePerKm;
    }
}
