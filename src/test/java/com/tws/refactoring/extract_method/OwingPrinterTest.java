package com.tws.refactoring.extract_method;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;

import static org.junit.Assert.*;

public class OwingPrinterTest {
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final PrintStream originalOut = System.out;

	@Before
	public void setUpStreams() {
		System.setOut(new PrintStream(outContent));
	}

	@After
	public void restoreStreams() {
		System.setOut(originalOut);
	}

	@Test
	public void printOwing() {
		System.out.print("hello");
		assertEquals("hello", outContent.toString());
	}

	@Test
	public void should_print_orders_when_print_owing_given_name_as_tom() {
		//given
		OwingPrinter owingPrinter=new OwingPrinter();
		String name="LiuMengMeng";
		Order order=new Order(100.0);
		List<Order> orders = null;
		orders.get(index);
		//when
		owingPrinter.printOwing(name, orders);
		//then
		assertEquals("*****************************" + "/r/n" + "****** Customer totals ******"
				+ "*****************************", outContent.toString());
	}
}