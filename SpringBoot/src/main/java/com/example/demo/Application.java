package com.example.demo;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.dao.CityDaoImpl;
import com.example.model.City;

@SpringBootApplication
public class Application {
	
	 static CityDaoImpl cityDaoImpl=new CityDaoImpl();

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		System.out.println("Test2");
		List<City> city=cityDaoImpl.getAllCities();
	}
}
