package com.kc.model;

public class Subtraction extends AbstractCalculation {
	@Override
	public Double calculate(Double firstVariable, Double secondVariable) {
		return firstVariable - secondVariable;
	}

	@Override
	public Double calculate(String... variables) {
		Double result = 0.0;
		for (String var : variables) {
			result -= Double.parseDouble(var);
		}
		return result;
	}

	@Override
	public Double calculate(Double... variables) {
		Double result = 0.0;
		for (Double var : variables) {
			result -= var;
		}
		return result;
	}

	@Override
	public Double calculate(String firstVariable, String secondVariable) {
		return Double.parseDouble(firstVariable) - Double.parseDouble(firstVariable);
	}
}
