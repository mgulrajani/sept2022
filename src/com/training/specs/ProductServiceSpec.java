package com.training.specs;

import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

class ProductServiceSpec {
@Mock
ProductDAO dao = new ProductDAOImplInJDBC();

@InjectMocks
private ProductServiceImpl service = new ProductServiceImpl(dao);

	Product p1 ;
	Product p2 ;
	Product p3 ;
	Product p4 ;
	
	List<Product> products;
	
	@BeforeEach
	public  void setUp1() {
		
		MockitoAnnotations.initMocks(this);
		
	}
	
	@BeforeEach
	void setUp() throws Exception{
		p1=new Product(111,"mouse","hp",1000,10);
		p2= new Product(112,"keyboard","acer",2300,20);
		p3=new Product(113,"cables","hp",1000,10);
		p4= new Product(114,"monitor","acer",2300,20);
		
		products = new ArrayList<>();
		products.add(p1);
		products.add(p2);
		
	}
	
	
	@Test
	public void getAllProductsTest() {
		
		//arrange
		when(dao.getAllProducts()).thenReturn(products);
		
		//assert 
	    Assertions.assertEquals(2, service.getAllProducts().size());
		
	}
	

	@Test
	public void getProductByIdTest() {
		
		when(dao.getProductById(111)).thenReturn(p1);
		
		Assertions.assertEquals(p1, service.getProductById(111));
		
		
		
	}
@Test
public void addProductSpec() {
	
	when(dao.addProduct(p3)).thenReturn(p3);
	
	products.add(p3);
	
	Assertions.assertEquals(p3, service.addProduct(p3));
	
	when(dao.getAllProducts()).thenReturn(products);
	int numOfProducts =  products.size();
	
	Assertions.assertEquals(numOfProducts,service.getAllProducts().size());
	
	
	
}
	
	
}
