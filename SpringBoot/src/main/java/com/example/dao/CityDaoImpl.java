package com.example.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.example.model.City;
import org.springframework.stereotype.Component;

@Component
public class CityDaoImpl implements CityDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public List<City> getAllCities() {
	String sql="SELECT * FROM CITY";
	
		return jdbcTemplate.query(sql,new CityRowMapper() );
	}
	
	
	class CityRowMapper implements RowMapper{

		@Override
		public Object mapRow(ResultSet row, int rowNum) throws SQLException {
			City city=new City();
			city.setId(row.getInt("ID"));
			city.setCountrycode(row.getString("CountryCode"));
			city.setDistrict(row.getString("District"));
			city.setName(row.getString("Name"));
			city.setPopulation(row.getInt("Population"));
			return city;
		}
		
		
	}
	
	

}
