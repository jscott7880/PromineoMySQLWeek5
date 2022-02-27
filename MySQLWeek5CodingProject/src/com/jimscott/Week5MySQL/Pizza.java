package com.jimscott.Week5MySQL;

import java.util.ArrayList;
import java.util.List;

public class Pizza {

	public static final List<Pizza> pizzas = null;

	private String name;
	
	public static List<Pizza> animals = new ArrayList<>(List.of(
			new Pizza("Cheese"), 
			new Pizza("Pepperoni"),
			new Pizza("Hawaiian"), 
			new Pizza("Veggie"), 
			new Pizza("Meat Lover's"),
			new Pizza("Fantastic Feast")));
	
	
	public Pizza(String name) {
		this.setName(name);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public static int compare(Pizza p1, Pizza p2) {
		return p1.name.compareTo(p2.name);
	}

	@Override
	public String toString() {
		return "" + name + " Pizza";
	}
}
