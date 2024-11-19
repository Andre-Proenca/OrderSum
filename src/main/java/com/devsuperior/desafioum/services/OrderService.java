package com.devsuperior.desafioum.services;

import com.devsuperior.desafioum.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    public double total(Order order) {
        return order.getBasic() - order.getDiscount();
    }
}
