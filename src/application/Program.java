package application;

import java.util.ArrayList;
import java.util.List;

import entities.Product;

public class Program {
	public static void main(String[] args) {

		List<Product> list = new ArrayList<Product>();
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Notebook", 500.00));
		list.add(new Product("Tablet", 300.00));

		//list.sort((p1, p2) -> p1.getPrice().compareTo(p2.getPrice()));
		list.sort((p1, p2) -> p1.getName().compareTo(p2.getName()));
		//list.sort((p1, p2) -> p1.getPrice().compareTo(p2.getPrice().MAX_VALUE));

	
		for (Product p : list) {
			System.out.println(p);
		}
	}
}
