package com.jimscott.Week5MySQL;

import java.util.NoSuchElementException;
import java.util.Optional;

public class Optionals {

	public static void main(String[] args) {
		
		methodP("Anchovie");
		
	}
	
	public static Pizza PizzaMethod(Optional<Pizza> optionalPizza) {
		
		return optionalPizza.orElseThrow(() -> new NoSuchElementException("You want WHAT kind of pizza? We don't serve that here!"));
		
	}
	
	public static void methodP(String Pizza) {
		Pizza checkPizza = PizzaMethod(Optional.of(new Pizza(Pizza)));
		System.out.println(checkPizza);
		try {
			PizzaMethod(Optional.empty());
		} catch (NoSuchElementException e) {
			System.out.println(e.getMessage());
		}
	}
	
}