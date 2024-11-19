package com.devsuperior.desafioum.services;

import com.devsuperior.desafioum.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private ShippingService shippingService;
    public double calculateTotal(Order order) {
        double discount = order.getBasic() * (order.getDiscount() / 100.0);
        double valueAfterDiscount = order.getBasic() - discount;
        double shipping = shippingService.calculateShipment(order.getBasic());
        return valueAfterDiscount + shipping;
    }
}
