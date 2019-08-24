//package com.kodilla.hibernate.invoice.dao;
//
//import com.kodilla.hibernate.invoice.Invoice;
//import com.kodilla.hibernate.invoice.Item;
//import com.kodilla.hibernate.invoice.Product;
//import org.junit.Assert;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import java.math.BigDecimal;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//public class InvoiceDaoTestSuite {
//	@Autowired
//	private ProductDao productDao;
//	private InvoiceDao invoiceDao;
//
//	@Test
//	public void testInvoiceDaoSave() {
//		//Given
//		Product product1 = new Product("ProductOne");
//		Product product2 = new Product("ProductTwo");
//		Product product3 = new Product("ProductThree");
//
//		Invoice invoiceA = new Invoice("AAA");
//		Invoice invoiceB = new Invoice("BBB");
//
//		Item item1A = new Item(product1, new BigDecimal(15.00), 1, new BigDecimal(15));
//		Item item1B = new Item(product1, new BigDecimal(15.00), 2, new BigDecimal(30));
//		Item item2A = new Item(product2, new BigDecimal(10.00), 3, new BigDecimal(30));
//		Item item2B = new Item(product2, new BigDecimal(10.00), 4, new BigDecimal(40));
//		Item item3A = new Item(product3, new BigDecimal(5.00), 5, new BigDecimal(25));
//		Item item3B = new Item(product3, new BigDecimal(5.00), 6, new BigDecimal(30));
//
//		item1A.setInvoice(invoiceA);
//		item1A.setProduct(product1);
//		item1B.setInvoice(invoiceB);
//		item1B.setProduct(product1);
//		item2A.setInvoice(invoiceA);
//		item2A.setProduct(product2);
//		item2B.setInvoice(invoiceB);
//		item2B.setProduct(product2);
//		item3A.setInvoice(invoiceA);
//		item3A.setProduct(product3);
//		item3B.setInvoice(invoiceB);
//		item3B.setProduct(product3);
//
//		product1.getItems().add(item1A);
//		product1.getItems().add(item1B);
//		product2.getItems().add(item2A);
//		product2.getItems().add(item2B);
//		product3.getItems().add(item3A);
//		product3.getItems().add(item3B);
//
//		invoiceA.getItems().add(item1A);
//		invoiceA.getItems().add(item2A);
//		invoiceA.getItems().add(item3A);
//		invoiceB.getItems().add(item1B);
//		invoiceB.getItems().add(item2B);
//		invoiceB.getItems().add(item3B);
//
//		//When
//		productDao.save(product1);
//		int id1 = product1.getId();
//		productDao.save(product2);
//		int id2 = product2.getId();
//		productDao.save(product3);
//		int id3 = product3.getId();
//
//		invoiceDao.save(invoiceA);
//		int idA = invoiceA.getId();
//		invoiceDao.save(invoiceB);
//		int idB = invoiceB.getId();
//
//		//Then
//		Assert.assertNotEquals(0, id1);
//		Assert.assertNotEquals(0, id2);
//		Assert.assertNotEquals(0, id3);
//		Assert.assertNotEquals(0, idA);
//		Assert.assertNotEquals(0, idB);
//
//		//CleanUp
////		productDao.deleteById(id1);
////		productDao.deleteById(id2);
////		productDao.deleteById(id3);
////		invoiceDao.deleteById(idA);
////		invoiceDao.deleteById(idB);
//
//	}
//}
