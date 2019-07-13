package com.kodilla.good.patterns.challenges;

public class Application {

	public static void main(String[] args) {

		OrderRequestRetrieve orderRequestRetrieve = new OrderRequestRetrieve();
		OrderRequest orderRequest = new OrderRequest;

		ProductOrderService productOrderService = new ProductOrderService(new MailService(), new ItemOrderService(),
				new ItemOrderRepository());
		productOrderService.process(orderRequest);
	}
}
