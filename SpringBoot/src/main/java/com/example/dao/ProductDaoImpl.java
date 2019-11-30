package com.example.dao;

import com.example.model.Products;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Component
public class ProductDaoImpl implements ProductDao {

	@Autowired
	private NamedParameterJdbcTemplate jdbcTemplate;
	
	@Override
	public List<Products> getAllProducts() {
	String sql="SELECT * FROM PRODUCTS";
		return jdbcTemplate.query(sql,new ProductsRowMapper() );
	}

	@Override
	public List<Products> getProductsById(String id) {
		String sql="SELECT * FROM PRODUCTS WHERE ID=:id";
		MapSqlParameterSource params = new MapSqlParameterSource();
		params.addValue("id",id);
		return jdbcTemplate.query(sql,params,new ProductsRowMapper() );
	}

	
	class ProductsRowMapper implements RowMapper{
		@Override
		public Object mapRow(ResultSet row, int rowNum) throws SQLException {
			Products products = new Products();
			products.setProductId(row.getInt("ID"));
			products.setAvailable(row.getString("available"));
			products.setProductName(row.getString("product_name"));
			products.setProductCode(row.getString("product_code"));
			products.setPrice(row.getString("price"));
			products.setStarRating("3");
			return products;
		}
		
		
	}
	
	

}
