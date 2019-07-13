package com.kodilla.good.patterns.challenges.food2door;

public class BookProcessor {

	private InfoService infoService; // wysyłanie potwierdzenia zamówienia
	private BookService bookService; // serwis zamawiania
	private BookRepository bookRepository; // zapisanie zamówienia do bazy danych

	public BookProcessor(final InfoService infoService, final BookService bookService, final BookRepository bookRepository) {
		this.infoService = infoService;
		this.bookService = bookService;
		this.bookRepository = bookRepository;
	}
	public BookDto process(final ProductRequest productRequest) {
		boolean isBooked = bookService.book(productRequest.getSupplier(), productRequest.getQuantity(), productRequest.getTypeOfProduct());
		if(isBooked) {
			infoService.inform(productRequest.getSupplier()); //powiadamia dostawcę o zamówieniu
			bookService.createOrder(productRequest.getSupplier(), productRequest.getQuantity(), productRequest.getTypeOfProduct());

			return new BookDto(productRequest.getSupplier(), true);
		} else {
			return new BookDto(productRequest.getSupplier(), false);
		}
	}



}
