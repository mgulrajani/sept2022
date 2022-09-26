package com.training.specs;

import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.MethodSource;

public class AssumptionsDemo1 {

	@Test
	public void test1() {
		
	System.setProperty("ENV","QA");
	Assumptions.assumeTrue("PROD".equals(System.getProperty("ENV")));
	
	Assertions.assertEquals(2,3);
	
	
	}

    @Test
    void test2() {
    	
    	Assumptions.assumeFalse("QA".equals(System.getProperty("ENV")),AssumptionsDemo1::getMessage);
    }
	

    static String getMessage() {
    	return "Test is going to pass!!";
    	
    }
    
    
    @DisplayName("Numbers ")
    @ParameterizedTest(name="{0}  greets    {1}")
    @CsvSource({"morning,good morning","daytime,good day","evening,good evening"})
    void withGreetings(String greet1,String greet2) {}
    
    
    
    @ParameterizedTest
    @EnumSource(value=TimeUnit.class, names= {"DAYS","HOURS"})
    void allEnumValuesOfTimeUnit(TimeUnit unit) {}
    
    
    @ParameterizedTest
    @MethodSource("providerMethod")
    void getValues(String names,int length) {}
    
    private static Stream<Arguments> providerMethod(){
    	
    	return Stream.of(Arguments.of("sahil",5),
    			Arguments.of("Mohita",6));
    	
    }
    
    
   
}
