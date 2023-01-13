package com.example.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Model.Groceries;
import com.example.Service.GroceriesService;

@RestController
//declaring class
public class GroceriesController
{
	@Autowired(required=true)
	GroceriesService groceriesService;
	
	@PostMapping("/Groceries")
	Groceries createGroceries(@RequestBody Groceries groceries)
	{
		return groceriesService.createGroceries(groceries);
	}
	
	@GetMapping("/Groceries")
	public List<Groceries>findAllGroceries()
	{
		return groceriesService.findAllGroceries();
	}
	
	
	@GetMapping(value="/Groceries/{id}")
	public Groceries findGroceriesById(@PathVariable int id)
	{
		return groceriesService.findGroceriesById(id);
		
	}
	
	@GetMapping(value="/Groceries/Name/{Name}")
	public List<Groceries>findGroceriesByName(@PathVariable String name)
	{
		return groceriesService.findGroceriesByName(name);
	}
	
	@DeleteMapping(value="/Groceries/{id}")
	public void deleteGroceries(@PathVariable int id)
	{
		groceriesService.deleteGroceries(id);
	}
	
	@PutMapping(value="/Groceries")
	public Groceries updateGroceries(@RequestBody Groceries Groceries)
	{
		return groceriesService.updateGroceries(Groceries);
	}
	
}
