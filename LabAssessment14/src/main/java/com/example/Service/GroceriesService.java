package com.example.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Model.Groceries;

@Service
public interface GroceriesService
{
	//for crud operations
	public Groceries createGroceries(Groceries groceries); //for creating table
	
	public List<Groceries>findAllGroceries(); //for finding list of groceries
	
	public void deleteGroceries(int id); //for deleting groceries
	
	public Groceries updateGroceries(Groceries groceries); //for updating groceries

	public Groceries findGroceriesById(int id); //for finding by id

	public List<Groceries> findGroceriesByName(String name); //for finding by name
}
