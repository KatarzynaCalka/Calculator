package com.kc.model.exceptions;

public class DivideByZeroException extends ArithmeticException {
	private static final long serialVersionUID = -2380715068049477324L;

	@Override
	public void printStackTrace() {
		System.err.println("Second argument cannot equal to zero!");
	}
}
