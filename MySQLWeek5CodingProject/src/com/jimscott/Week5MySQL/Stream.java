package com.jimscott.Week5MySQL;

import java.util.List;
import java.util.stream.Collectors;

public class Stream {

	public static void main(String[] args) {
		
		List<Pizza> pizzas = Pizza.pizzas;
		System.out.println(Sort(pizzas));
		
	}

	public static String Sort(List<Pizza> pizzas) {
		List<Pizza> pizzaList = pizzas;
		
		return pizzaList.stream()
				.map(Pizza -> Pizza.toString())
				.sorted()
				.collect(Collectors.joining(", "));

	}

}
