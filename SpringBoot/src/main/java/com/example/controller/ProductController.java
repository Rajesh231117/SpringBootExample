package com.example.controller;

import com.example.dao.CityDao;
import com.example.dao.ProductDao;
import com.example.model.City;
import com.example.model.Products;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@EnableScheduling
@RequestMapping(path="/rest")
public class ProductController {

    @Autowired
    ProductDao productDao;

    @RequestMapping(value= "/getAllProducts", method = RequestMethod.GET)
    @CrossOrigin(origins = "http://localhost:4200")
    public @ResponseBody
    List<Products> getAllProducts(){
        return  productDao.getAllProducts();
    }

    @RequestMapping(value= "/getProductsById", method = RequestMethod.GET)
    @CrossOrigin(origins = "http://localhost:4200")
    public @ResponseBody
    List<Products> getProductsById(@RequestParam(name="id", required=true) String id){
        return  productDao.getProductsById(id);
    }

    //@Scheduled(fixedRate = 2000)
    public void test(){
        System.out.println("It works!!");
    }
}
