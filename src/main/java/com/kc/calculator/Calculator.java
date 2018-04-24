package com.kc.calculator;

import com.kc.model.Addition;
import com.kc.model.Division;
import com.kc.model.Multiplication;
import com.kc.model.Subtraction;

public class Calculator {

	public static void main(String[] args) {
		Addition add = new Addition();
		add.calculate(2.0, 4.0, 8.0);
		add.calculate("2", "4", "1");
		add.calculate(2.0, 2.0);
		add.calculate("1", "2");

		Subtraction sub = new Subtraction();
		sub.calculate(2.0, 4.0, 8.0);
		sub.calculate("2", "4", "1");
		sub.calculate(2.0, 2.0);
		sub.calculate("1", "2");

		Multiplication mul = new Multiplication();
		mul.calculate(2.0, 4.0, 8.0);
		mul.calculate("2", "4", "1");
		mul.calculate(2.0, 2.0);
		mul.calculate("1", "2");

		Division div = new Division();
		div.calculate(2.0, 0.0, 8.0);
		div.calculate("0", "4", "1");
		div.calculate(2.0, 2.0);
		div.calculate("1", "0");
	}
}
