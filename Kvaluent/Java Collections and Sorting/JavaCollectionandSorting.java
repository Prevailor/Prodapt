package com.assignmentk;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JavaCollectionandSorting {

	public static void main(String[] args) {

		List<Customer> customers = new ArrayList<>();
		Customer cust1 = new Customer(1l, "Stefan Walker", 1);
		Customer cust2 = new Customer(2l, "Daija Von", 1);
		Customer cust3 = new Customer(3l, "Ariane Rodriguez", 1);
		Customer cust4 = new Customer(4l, "Marques Nikolaus", 2);
		Customer cust5 = new Customer(5l, "Rachelle Greenfelder", 0);
		Customer cust6 = new Customer(6l, "Larissa White", 2);
		Customer cust7 = new Customer(7l, "Fae Heidenreich", 1);
		Customer cust8 = new Customer(8l, "Dino Will", 2);
		Customer cust9 = new Customer(9l, "Eloy Stroman", 1);
		Customer cust10 = new Customer(10l, "Brisa O'Connell", 1);
		customers.add(cust1);
		customers.add(cust2);
		customers.add(cust3);
		customers.add(cust4);
		customers.add(cust5);
		customers.add(cust6);
		customers.add(cust7);
		customers.add(cust8);
		customers.add(cust9);
		customers.add(cust10);
		List<Product> products = new ArrayList<>();
		Product prod1 = new Product(1l, "omnis quod consequatur", "Games", 184.83);
		Product prod2 = new Product(2l, "vel libero suscipit", "Toys", 12.66);
		Product prod3 = new Product(3l, "non nemo iure", "Grocery", 498.02);
		Product prod4 = new Product(4l, "voluptatem voluptas aspernatur", "Toys", 536.80);
		Product prod5 = new Product(5l, "animi cum rem", "Games", 458.20);
		Product prod6 = new Product(6l, "dolorem porro debitis", "Toys", 146.52);
		Product prod7 = new Product(7l, "aspernatur rerum qui", "Books", 656.42);
		Product prod8 = new Product(8l, "deleniti earum et", "Baby", 41.46);
		Product prod9 = new Product(9l, "voluptas ut quidem", "Books", 697.57);
		Product prod10 = new Product(10l, "eos sed debitis", "Baby", 366.90);
		products.add(prod1);
		products.add(prod2);
		products.add(prod3);
		products.add(prod4);
		products.add(prod5);
		products.add(prod6);
		products.add(prod7);
		products.add(prod8);
		products.add(prod9);
		products.add(prod10);
		List<Order> orders = new ArrayList<>();
		Order order1 = new Order(1l, LocalDate.of(2021, 2, 28), LocalDate.of(2021, 3, 8), "NEW", 5l);
		Order order2 = new Order(2l, LocalDate.of(2021, 2, 28), LocalDate.of(2021, 3, 5), "NEW", 3l);
		Order order3 = new Order(3l, LocalDate.of(2021, 4, 10), LocalDate.of(2021, 4, 18), "DELIVERED", 5l);
		Order order4 = new Order(4l, LocalDate.of(2021, 3, 22), LocalDate.of(2021, 3, 27), "PENDING", 3l);
		Order order5 = new Order(5l, LocalDate.of(2021, 3, 4), LocalDate.of(2021, 3, 12), "NEW", 1l);
		Order order6 = new Order(6l, LocalDate.of(2021, 3, 30), LocalDate.of(2021, 4, 7), "DELIVERED", 9l);
		Order order7 = new Order(7l, LocalDate.of(2021, 3, 5), LocalDate.of(2021, 3, 9), "PENDING", 8l);
		Order order8 = new Order(8l, LocalDate.of(2021, 3, 27), LocalDate.of(2021, 4, 5), "NEW", 4l);
		Order order9 = new Order(9l, LocalDate.of(2021, 4, 14), LocalDate.of(2021, 4, 18), "NEW", 10l);
		Order order10 = new Order(10l, LocalDate.of(2021, 3, 10), LocalDate.of(2021, 3, 19), "NEW", 8l);
		orders.add(order1);
		orders.add(order2);
		orders.add(order3);
		orders.add(order4);
		orders.add(order5);
		orders.add(order6);
		orders.add(order7);
		orders.add(order8);
		orders.add(order9);
		orders.add(order10);
		List<Product> expensiveBooks = new ArrayList<>();
        for (Product product : products) {
            if (product.getCategory().equalsIgnoreCase("Books") && product.getPrice() > 100) {
                expensiveBooks.add(product);
            }
        }
        System.out.println("Expensive Books:");
        for (Product expensiveBook : expensiveBooks) {
            System.out.println(expensiveBook);
        }
        // Obtain a list of order with products belong to category “Baby”
        List<Order> babyOrders = new ArrayList<>();
        for (Order order : orders) {
            for (Product product : products) {
                if (product.getId() == order.getCust_id() && product.getCategory().equalsIgnoreCase("Baby")) {
                    babyOrders.add(order);
                    break; 
                }
            }
        }
        System.out.println("\nBaby Orders:");
        for (Order babyOrder : babyOrders) {
            System.out.println(babyOrder);
        }

        List<Product> discountedToys = new ArrayList<>();
        		for (Product product : products) {
        		    if (product.getCategory().equalsIgnoreCase("Toys")) {
        		        double discountedPrice = product.getPrice() * 0.9;
        		        product.setPrice(discountedPrice);
        		        discountedToys.add(product);
        		    }
        		}
        		System.out.println("\nDiscounted Toys:");
        		for (Product toy : discountedToys) {
        		    System.out.println(toy);
        		}
        // Obtain a list of products ordered by customer of tier 2 between 01-Feb-2021 and 01-Apr-2021
        List<Product> tier2CustomerProducts = new ArrayList<>();
        for (Order order : orders) {
            if (order.getOrderdate().isAfter(LocalDate.of(2021, 2, 1))
&& order.getOrderdate().isBefore(LocalDate.of(2021, 4, 1))) {
                for (Customer customer : customers) {
                    if (customer.getCustomerid() == order.getCust_id() && customer.getTier() == 2) {
                        for (Product product1 : products) {
                            if (product1.getId() == order.getCust_id()) {
                                tier2CustomerProducts.add(product1);
                                break; 
                            }
                        }
                        break; 
                    }
                }
            }
        }
        System.out.println("\nProducts ordered by Tier 2 customers between 01-Feb-2021 and 01-Apr-2021:");
        for (Product product1 : tier2CustomerProducts) {
            System.out.println(product1);
        }
        // Get the cheapest products of “Books” category
        Product cheapestBook = null;
        double minPrice = Double.MAX_VALUE;
        for (Product product1 : products) {
            if (product1.getCategory().equalsIgnoreCase("Books") && product1.getPrice() < minPrice) {
                cheapestBook = product1;
                minPrice = product1.getPrice();
            }
        }
        System.out.println("\nCheapest Book:");
        System.out.println(cheapestBook);
    }
	
}
