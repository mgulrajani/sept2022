package com.training.dao.impl;

import com.training.dao.CalcDAO;

@Ann1(name="aa")
public class CalcDAOImpl implements CalcDAO{

	@Ann1(name="add")
	@Override
	public int add(int a, int b) throws IllegalArgumentException{
		System.out.println("adding two numbers and throwing exception");
		// TODO Auto-generated method stub
		int result = a+b;
		System.out.println(result);
		if(result > 100)
		throw new IllegalArgumentException();
		else
			return result;
		
	}
	@Ann1(name="cal const")
	public
	CalcDAOImpl(){}

	@Override
	public int subtract(int a, int b) {
		// TODO Auto-generated method stub
	return (a>b)?a-b:b-a;
	}

	@Override
	public int square(int a) {
		// TODO Auto-generated method stub
		System.out.println("a new statement");
		System.out.println("returning the square a number");
		return a*a;
	}

}
