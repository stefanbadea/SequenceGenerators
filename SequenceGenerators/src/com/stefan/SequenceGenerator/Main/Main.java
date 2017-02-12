package com.stefan.SequenceGenerator.Main;

import com.stefan.SequenceGenerator.Generators.EvenNumbers;
import com.stefan.SequenceGenerator.Generators.Fibonacci;
import com.stefan.SequenceGenerator.Generators.PrimeNumbers;

public class Main {

	public static void main(String[] args) {
		
		Fibonacci fib = new Fibonacci();
		PrimeNumbers pn = new PrimeNumbers();
		EvenNumbers en = new EvenNumbers();
		
		//test for Fibonacci generators
		System.out.println("Fibonacci:");
		int[] arrayFib = fib.generate(5);
		for(int i = 0; i<5; i++)
			System.out.println(arrayFib[i]);
		
		for(int i = 0; i<5; i++)
			System.out.println(fib.next());
		
		//test for Prime generators
		System.out.println("Prime numbers:");
		for (int i = 0; i<10; i++)
			System.out.println(pn.next());
		
		int[] arrayPrimes = pn.generate(10);
		for (int i = 0; i<10; i++)
			System.out.println(arrayPrimes[i]);
		
		//test for Even generator
		System.out.println("Even numbers:");
		for (int i = 0; i<10; i++)
			System.out.println(en.next());
		
		int[] arrayEvens = en.generate(10);
		for(int i = 0; i<10; i++)
			System.out.println(arrayEvens[i]);
	}

}
