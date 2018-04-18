package com.kc.model;

public class Addition extends AbstractCalculation {
	@Override
	public Double calculate(Double firstVariable, Double secondVariable) {
		return firstVariable + secondVariable;
	}
	
	@Override
	public Double calculate(String... variables) {
		Double result = 0.0;
		for (String var : variables) {
			result += Double.parseDouble(var);
		}
		return result;
	}
}
