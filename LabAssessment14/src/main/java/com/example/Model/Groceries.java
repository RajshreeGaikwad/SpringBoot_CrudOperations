/*
 * Program:Create table of Groceries(ld, name, price, Quantity) and perform CRUD operation using Springboot Add Groceries, delete Groceries,
 * 			 findall Groceries, findbyid and findbyname groceries, update groceries.
 * Author :RajshreeGaikwad
 * Date   :12 Jan 2023
 * */

package com.example.Model;

import javax.persistence.Entity;

import javax.persistence.Id;


@Entity
//declaring Entity Class
public class Groceries
{
	@Id
	
	private int Id;
	private String Name;
	private int Price;
	private int Quantity;
	
	//NoArgs Constructor
	public Groceries()
	{
	
	}
	
	//parameterized Constructor
	public Groceries(int id, String name, int price, int quantity) {
		super();
		Id = id;
		Name = name;
		Price = price;
		Quantity = quantity;
	}

// using getter setter
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getPrice() {
		return Price;
	}
	public void setPrice(int price) {
		Price = price;
	}
	public int getQuantity() {
		return Quantity;
	}
	public void setQuantity(int quantity) {
		Quantity = quantity;
	}
	
	
} //end class of Groceries
