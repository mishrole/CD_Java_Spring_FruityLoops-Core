package com.codingdojo.fruityloops.model;
import lombok.Data;

/* 
 * Lombok genera getters y setters.
 * Brinda legibilidad a medida que las entidades crecen y ahorra tiempo.
*/

@Data
public class Item {
	private String name;
	private double price;
	
	public Item(String name, double price) {
		this.name = name;
		this.price = price;
	}
}
