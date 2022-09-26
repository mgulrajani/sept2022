package com.training.dao.impl;

import com.training.dao.CalcDAO;

public class CalcDAOImpl implements CalcDAO{

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int subtract(int a, int b) {
		// TODO Auto-generated method stub
	return (a>b)?a-b:b-a;
	}

}
