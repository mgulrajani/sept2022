package com.training.dao;

import java.io.Serializable;
import java.util.List;

//Layered architecture 
//Product class --POJO -- for which table in Postgresql
//ProductDAO --crud operations
//ProductService --which will be consuming the DAO layer
//Controller --whihc will be consuming the service
//RESTFul Apis whihc will be consumed by UI /React app /Angular app /jsp /php

//entity which you are goingto persist in Product table in db -- rdbms 

class Product implements Serializable{
	
 private long id;
 private String name;
 private String brand;
 private double price;
 private int qoh;
 
 //getters /setters
 //constructors
 //toString
 //hashcode and equals for Set coll
 
	
}

public interface ProductDAO {

	//crud
	public Product addProduct(Product p) ;
	public Product updateProduct(long id, Product p);
	public void deleteProduct(long id);
	public List<Product> getAllProducts();
    public Product getProductById(long id);	
 
	
	
}

class ProductDAOImplInJDBC implements ProductDAO{
// this will use jdbc - api to perform product crud
	
	@Override
	public Product addProduct(Product p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product updateProduct(long id, Product p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteProduct(long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product getProductById(long id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}



class ProductDAOImplInFiles implements ProductDAO{

	
	//so you will create some ObjectOutputStream and FileOutputStream and write objects to file and read using ObjectInputStream from the file ,FIleInputStream will be used to read
	
	@Override
	public Product addProduct(Product p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product updateProduct(long id, Product p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteProduct(long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product getProductById(long id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}


//service layer
interface ProductService{
	
	public Product addProduct(Product p) ;
	public Product updateProduct(long id, Product p);
	public void deleteProduct(long id);
	public List<Product> getAllProducts();
    public Product getProductById(long id);	
 
	
	
	
} 


//service layer impl

//always code to abstraction not to the implementation

//i have to test the service layer 
//service layer is talking to dao layers
//there are two layers
//service layer and dao layer 
//we are doing unit testing  . only 1 layer is to be tested in isolation


class ProductServiceImpl implements ProductService{
	
	//service will use the dao 
	
	//here in this case we are tying with jdbc impl
	/*
	 * 
	 * 
	 * if you want files dao then , it will be 
	 * ProductDAO dao =new ProductDAOImplInFiles();
	 * only impl will change
	 * rest all service method calls from the client will remain the same.
	 * 
	 */
	
	//Mockito 
	//Mocking the DAO layer --we will not hit the actual db  --
	//mock it by static ,train our mock ,if i say addproduct , deletepro,list we have to train dao layer's mock object
	
	private ProductDAO dao=new ProductDAOImplInJDBC();

	
	
	public ProductServiceImpl(ProductDAO dao) {
		super();
		this.dao = dao;
	}

	@Override
	public Product addProduct(Product p) {
		// TODO Auto-generated method stub
		return null;
		
	}

	@Override
	public Product updateProduct(long id, Product p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteProduct(long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product getProductById(long id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
	
	
}

class ClientApp{
	
	
	//dao layer
	//client should talk to service
	
	public static void main(String[] args) {
		
		
		
	}
}









