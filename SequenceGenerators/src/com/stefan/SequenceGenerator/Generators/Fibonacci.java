package com.stefan.SequenceGenerator.Generators;

import com.stefan.SequenceGenerator.Interfaces.SequenceGenerator;

public class Fibonacci implements SequenceGenerator {
	
	private int first;
	private int second;
	private int count;
	
	public Fibonacci() {
		this.first = 1;
		this.second = 1;
		this.count = 0;
	}

	@Override
	public int next() {

		if(this.count == 0){
			this.count++;			
			return this.first;
		} else if (this.count == 1) {
			this.count++;
			return this.second;
		} else {
			
			int next = this.first + this.second;
			this.first = this.second;
			this.second = next;
			this.count++;
			
			return next;
		}
	}

	@Override
	public int[] generate(int count) {
		int[] array = new int[count];
		array[0] = array[1] = 1;
		for(int i = 2; i<count; i++)
			array[i] = array[i-1] + array[i-2];
		
		return array;
	}

}
