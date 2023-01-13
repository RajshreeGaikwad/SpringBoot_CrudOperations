package com.example.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Model.Groceries;

public interface GroceriesRepository extends JpaRepository<Groceries,Integer> {

	public List<Groceries> findByName(String name);

}
