package com.training.dao.impl;

import com.training.dao.CalcDAO;

public class CalcDAOImpl implements CalcDAO{

	@Override
	public int add(int a, int b) throws IllegalArgumentException{
		// TODO Auto-generated method stub
		int result = a+b;
		System.out.println(result);
		if(result > 100)
		throw new IllegalArgumentException();
		else
			return result;
		
	}

	@Override
	public int subtract(int a, int b) {
		// TODO Auto-generated method stub
	return (a>b)?a-b:b-a;
	}

	@Override
	public int square(int a) {
		// TODO Auto-generated method stub
		return a*a;
	}

}
