package com.stefan.SequenceGenerator.Generators;

import java.util.Vector;
import com.stefan.SequenceGenerator.Interfaces.SequenceGenerator;

public class PrimeNumbers implements SequenceGenerator{
	
	private Vector<Integer> primes;
	private int countNext;
	
	public PrimeNumbers() {
		this.countNext = 0;
		this.primes = new Vector<>();
		this.primes.add(2);
		this.primes.add(3);
	}
	
	private Boolean isPrime(int number) {
		for(int i = 0; i < this.primes.size(); i++){
			if (number % this.primes.get(i) == 0) {
				return false;
			}
		}
		
		return true;
	}

	@Override
	public int next() {
		if (countNext == 0) {
			this.countNext++;
			return this.primes.get(0);
		}
		else if (countNext == 1) {
			this.countNext++;
			return this.primes.get(1);
		} else {
			for (int toTest = this.primes.lastElement() + 2; ; toTest+=2){
				if(isPrime(toTest)){
					this.primes.add(toTest);
					this.countNext++;
					
					return toTest;
				}
			}
		}
	}

	@Override
	public int[] generate(int count) {
		int[] generated = new int[count];
		PrimeNumbers pn = new PrimeNumbers();
		for (int i = 0; i<count; i++){
			generated[i] = pn.next();
		}
		
		return generated;
	}

}
