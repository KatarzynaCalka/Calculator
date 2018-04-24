package com.kc.model;

import com.kc.model.exceptions.DivideByZeroException;

public class Division extends AbstractCalculation {
	@Override
	public Double calculate(Double firstVariable, Double secondVariable) {
		Double result = 0.0;
		if (secondVariable != 0) {
			result = firstVariable / secondVariable;
		} else {
			throw new DivideByZeroException();
		}
		return result;
	}

	@Override
	public Double calculate(String... variables) {
		Double result = 0.0;
		int index = 0;

		for (String var : variables) {
			if (index != 0 && Double.parseDouble(var) == 0)
				throw new DivideByZeroException();
			else
				result /= Double.parseDouble(var);

			index++;
		}

		return result;
	}

	@Override
	public Double calculate(Double... variables) {
		Double result = 0.0;
		int index = 0;

		for (Double var : variables) {
			if (index != 0 && var == 0)
				throw new DivideByZeroException();
			else
				result /= var;
			index++;
		}

		return result;
	}

	@Override
	public Double calculate(String firstVariable, String secondVariable) {
		Double result = Double.parseDouble(firstVariable);
		if (Double.parseDouble(secondVariable) != 0) {
			result /= Double.parseDouble(secondVariable);
		} else {
			throw new DivideByZeroException();
		}
		return result;
	}

}
