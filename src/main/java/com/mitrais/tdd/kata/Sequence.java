package com.mitrais.tdd.kata;

import java.util.Arrays;

public class Sequence {
	private int[] numbers;

	public void addElement(int[] numbers) {
		this.numbers = numbers;
	}

	public int[] getElement() {
		
		return numbers;
	}

	public int getMinimumValue() {
		//return -24; 
		return Arrays.stream(numbers).min().getAsInt();
		/*
		int rtn = 999999999;
		for (int n : numbers) {
			if (n < rtn) {
				rtn = n;
			}
		}
		return rtn;
		*/
	}

	public int getMaximumValue() {
	//	return 128;
		return Arrays.stream(numbers).max().getAsInt();
	}

	public int getNumberOfElement() {
		// return 6;
		return (int) Arrays.stream(numbers).count();
	}

	public double getAverageOfElement() {
		// return 21.83333;
		return Arrays.stream(numbers).average().orElse(Double.NaN);
	}
	
	
}
