package com.kodilla.good.patterns.challenges;

public class Application {

	public static void main(String[] args) {

		OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
		OrderRequest orderRequest = orderRequestRetriever.retrieve(); // po co zapisuję do klasy OrderRequest

		ProductOrderService productOrderService = new ProductOrderService(new MailService(), new ItemOrderService(),
				new ItemOrderRepository()); //co oznaczają ()
		productOrderService.process(orderRequest);
	}
}
