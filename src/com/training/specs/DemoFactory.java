package com.training.specs;

import java.util.Arrays;
import java.util.Collection;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

public class DemoFactory {
	
	@TestFactory
	Collection<DynamicTest> dynamicTestMethod(){
		
		return Arrays.asList(
				
				
				DynamicTest.dynamicTest("first simple dynamic test",()->Assertions.assertTrue(2<3)),
				DynamicTest.dynamicTest("second simple dynamic test",()->new NewExecutable()),
				DynamicTest.dynamicTest("third  simple dynamic test",()->Assertions.assertFalse(2>3)),
				DynamicTest.dynamicTest("fourth simple dynamic test",()->{throw new Exception("some exception");}));
		
				
				
				
				
			
		
		
	}
	
	

}
