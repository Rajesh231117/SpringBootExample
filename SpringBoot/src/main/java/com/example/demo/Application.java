package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.dao.CityDaoImpl;
import com.example.model.City;
import org.springframework.context.annotation.ComponentScan;

import java.util.List;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.*"})
public class Application {
	
	 //static CityDaoImpl cityDaoImpl=new CityDaoImpl();

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		System.out.println("Test2");
		//List<City> city=cityDaoImpl.getAllCities();
	}
}
