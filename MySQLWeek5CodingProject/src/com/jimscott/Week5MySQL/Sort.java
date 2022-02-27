package com.jimscott.Week5MySQL;

import java.util.List;

public class Sort {

	public static void main(String[] args) {
		
		List<Pizza> lambda = lambda(Pizza.pizzas);
		System.out.println(lambda);
		
		List<Pizza> methodRef = methodReference(Pizza.pizzas);
		System.out.println(methodRef);
		
	}
	
	public static List<Pizza> lambda(List<Pizza> pizzas) {
		
		List<Pizza> pizzaList = pizzas;
		pizzaList.sort((p1, p2) -> Pizza.compare(p1, p2));
		
		return pizzaList;
	}
	
	public static List<Pizza> methodReference(List<Pizza> pizzas) {
		List<Pizza> pizzaList = pizzas;
		pizzaList.sort(Pizza::compare);
		
		return pizzaList;
	}

}


