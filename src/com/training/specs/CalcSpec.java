package com.training.specs;



import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

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
	private  CalcDAOImpl daoImpl;
	
	@BeforeAll
	public static void methodBeforeAllTest() {
		
		//arrange the data 
		System.out.println("Before all tests ,run only once");
		
	}
	
	@AfterAll
	public static void afterAllMethods() {
		
		System.out.println("run once after all tests are done");
		
		
	}
	
	@BeforeEach
	public void beforeEachM1() {
		System.out.println("before every test case ");

		
		
		 daoImpl = new CalcDAOImpl();

	}
	
	
	
	@AfterEach
	public void afterEachM() {
		System.out.println("after test ");
		daoImpl=null;
		
	}
	
	
	
	@Test
	@DisplayName("testing some dummy test cases")
	public void m1() {Object o1 =new String("Incomprehensible");
	int expected  = 4;
	int actual =  2+2;
	
	
		
		assertAll("Assert all of the following",
				
				()->assertEquals(4,(2+2)),
				()->assertEquals(expected, actual),
				()->assertTrue(o1!=null)
				);
		
		
		
		
		
		
	
	}
		
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
	  
	@Disabled
	@Test
	public void testSubtractMethodOfDaoImp() {
		
		assertEquals(1,daoImpl.subtract(3, 4));
	}
	
	//assertThrows --means you are asserting that the method might throw a certain exception
	//EMployee Not found -- name -- NameAlreadyException
	
	//findEmployeeById(int id) throws EmployeeNotFoundException 
	
	
	
	
	
	
	@Test
	@DisplayName("Test illegal argument for method add")
	public void testAddForException() {
		
		int result = daoImpl.add(3, 3);
		
		assertThrows(IllegalArgumentException.class ,()-> daoImpl.add(3,4));
		
		
	}
	

@ParameterizedTest
@ValueSource(ints = { 1, 2, 3, 4, 5 })
public void findById(int a) {

	assertNotNull(daoImpl);
	int result =  daoImpl.square(a);
	
	assertEquals(a*a, daoImpl.square(a));
                }
	
	
}
