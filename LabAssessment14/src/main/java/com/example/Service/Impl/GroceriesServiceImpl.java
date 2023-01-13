package com.example.Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.Model.Groceries;
import com.example.Repository.GroceriesRepository;
import com.example.Service.GroceriesService;

@Repository
//declaring class
public class GroceriesServiceImpl  implements GroceriesService{
	@Autowired(required=true)
	//creating method groceriesRepository
	private GroceriesRepository groceriesRepository;
	
	//for saving values
	public Groceries createGroceries(Groceries groceries) {
		// TODO Auto-generated method stub
		return groceriesRepository.save(groceries);
	}

	//for finding values
	public List<Groceries> findAllGroceries() {
		// TODO Auto-generated method stub
		return groceriesRepository.findAll();
	}
	

	//for deleting values
	public void deleteGroceries(int id) {
		// TODO Auto-generated method stub
		groceriesRepository.deleteById(id);
		
	}
	

	


	//for updating values
	public Groceries updateGroceries(Groceries groceries) {
		// TODO Auto-generated method stub
		Groceries _groceries=groceriesRepository.findById(groceries.getId()).get();
		_groceries.setName(groceries.getName());
		_groceries.setPrice(groceries.getPrice());
		_groceries.setQuantity(groceries.getQuantity());
		return _groceries;
	}
	
	//for finding value by id
	public Groceries findGroceriesById(int id) {
		// TODO Auto-generated method stub
		return groceriesRepository.findById(id).get();
	}

	//for finding value by name
	public List<Groceries> findGroceriesByName(String name) {
		// TODO Auto-generated method stub
		return groceriesRepository.findByName(name);
	}

	

	
}
