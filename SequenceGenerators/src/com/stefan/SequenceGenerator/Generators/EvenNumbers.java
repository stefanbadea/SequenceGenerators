package com.stefan.SequenceGenerator.Generators;

import com.stefan.SequenceGenerator.Interfaces.SequenceGenerator;

public class EvenNumbers implements SequenceGenerator{

	private int next;
	
	public EvenNumbers() {
		this.next = 0;
	}
	
	@Override
	public int next() {
		int ret = this.next;
		this.next += 2;
		return ret;
	}

	@Override
	public int[] generate(int count) {
		int[] array = new int[count];
		for(int i = 0; i<count; i++)
			array[i] = i * 2;
		return array;
	}

}
