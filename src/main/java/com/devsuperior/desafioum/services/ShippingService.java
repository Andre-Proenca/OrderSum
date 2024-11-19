package com.devsuperior.desafioum.services;


import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    public double calculateShipment(double basicValue) {
        if(basicValue < 100.00) {
            return 20.00;
        } else if(basicValue < 200.00) {
            return 12.0;
        }

        return 0.00;
    }
}
