package com.kc.model;

public abstract class AbstractCalculation {
	public Double firstVariable = 0.0;
	public Double secondVariable = 0.0;

	public abstract Double calculate(Double firstVariable, Double secondVariable);

	public Double calculate(String firstVariable, String secondVariable) {
		return null;
	}

	public Double calculate(Double... variables) {
		return null;
	}

	public Double calculate(String... variables) {
		return null;
	}
}
