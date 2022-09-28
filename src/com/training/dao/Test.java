package com.training.dao;

import java.util.function.IntConsumer;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test{
	
	public static void main(String[] args) {
		
		IntConsumer c1=(val)->{System.out.println(val);};
		
		
		//1st statement create a stream of Integer  --IntStream -- upper value is exclusive
 IntStream.range(1, 5)
		.map(a->a*2)  //mapping each and every object of the stream ,we are doubling
		.forEach(c1);  // forEach -- every element will be 
		
		
		
		
 IntStream.range(1, 5)
	.map(a->a*2)  //mapping each and every object of the stream ,we are doubling
	.forEach(System.out::println);  // forEach -- every element will be 
	

		//Predicate is a Functional
 //test --which takes arg - fulfilling the condition or not
Predicate<String> p1 = (s)-> s.contains("A");

	//Function interface --Functional interface
// Supplier
//Consumer
//Predicate 

//Comparator
	
	boolean containsA= Stream.of("amit","sumit","vinay","ketki")
	
	
	.map(s3->s3.toUpperCase())
	.anyMatch(p1);
	
	
	if(containsA) {
		System.out.println("condition met");
	}
	
	else
		System.out.println("some names do not have a in them");
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}