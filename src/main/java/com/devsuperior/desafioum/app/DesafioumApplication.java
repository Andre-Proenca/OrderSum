package com.devsuperior.desafioum.app;

import com.devsuperior.desafioum.entities.Order;
import com.devsuperior.desafioum.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.devsuperior"})
public class DesafioumApplication implements CommandLineRunner {

	@Autowired
	private OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(DesafioumApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Order order = new Order(1034, 150.00, 20.0);
		Order order2 = new Order(2282, 800.00, 10.0);
		Order order3 = new Order(1309, 95.90, 0.0);
		System.out.println("------RESULTADO--------");
		System.out.println("Pedido código: " + order.getCode());
		double total = orderService.calculateTotal(order);
		System.out.println("Valor total: R$ " + String.format("%.2f", total));
		System.out.println("----------------");
		System.out.println("Pedido código: " + order2.getCode());
		double total2 = orderService.calculateTotal(order2);
		System.out.println("Valor total: R$ " + String.format("%.2f", total2));
		System.out.println("----------------");
		System.out.println("Pedido código: " + order3.getCode());
		double total3 = orderService.calculateTotal(order3);
		System.out.println("Valor total: R$ " + String.format("%.2f", total3));

	}
}
