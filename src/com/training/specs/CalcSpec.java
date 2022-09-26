package com.training.specs;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.jupiter.api.Test;

import com.training.dao.impl.CalcDAOImpl;


//which class i want to test
//we are using TDD -- Test driven development approach
//code minimal
//any development -- for the CalcDAO impl -- not done
//we test first
//second step we fail the test
//refactor the code 
//run the test again
///green
//means our code is working
//AAA -- Arrange the data , Assert whether the test passes or fails Act if it passes or fails

class CalcSpec {
	//1st A  -- Arrange the facts /data which we have 
	
	private CalcDAOImpl daoImpl = new CalcDAOImpl();
	
	//collect all the facts
	//which is the class I am testing
	
	//1st A
	//remember 3 As
	//Arrange
	
	
	
	
	

	@Test
	public void testAddNumbersOfDaoImplClass() {
		//A  --second A 
	
		
		//where ever you are actually testing you will use assertion apis
		
		assertEquals(7,daoImpl.add(3, 4));
		
		//act 
		//where will you act
		//in the class which is under test
		//in daoimpl , you refactor the code
		//test again
		
		
	}
	  
	@Test
	public void testSubtractMethodOfDaoImp() {
		
		assertEquals(1,daoImpl.subtract(3, 4));
	}
	
	
}
