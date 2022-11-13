package com.project.webhook.controller;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ExecutionException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.datetime.standard.DateTimeContext;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.api.client.util.DateTime;
import com.project.webhook.entity.IncomeOrder;
import com.project.webhook.entity.Order;
import com.project.webhook.entity.Product;
import com.project.webhook.entity.Test;
import com.project.webhook.service.OrderService;

@RestController
public class OrderController {
	
	@Autowired
	OrderService orderService;
	
	@PostMapping("/webhook")
	public String saveOrder(@RequestBody IncomeOrder incomeOrder) throws InterruptedException, ExecutionException {
			System.out.println(incomeOrder);
			if (incomeOrder.getTest() != null) {
				return "ok";
			}
			List<Product> list = new ArrayList<Product>(Arrays.asList(incomeOrder.getPayment().getProducts()));
			StringBuilder items = new StringBuilder();
			for (Product product : list) {
				items.append(product.toString());
			}
			Date date = new Date();
			SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss"); 
			Order order = new Order();
			order.setId(incomeOrder.getPayment().getOrderid());
			order.setEmail(incomeOrder.getMa_email());
			order.setCount(incomeOrder.getPayment().getAmount());
			order.setItems(items.toString());
			order.setDate(formatter.format(date));
	        return orderService.savePatientDetails(order);
    }
	
}
