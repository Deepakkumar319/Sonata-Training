package com.sonata2.test;
import static org.junit.jupiter.api.Assertions.assertThrows;

import com.sonata2.Calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


	
	public class CalTest {
		@Test
		public void addTest() {
			Calculator c1=new Calculator();
			Assertions.assertEquals(4, c1.add(2, 2));
			
		}
		@Test
		public void divtest() {
			Calculator c1=new Calculator();
			int x=c1.div(1,1);
			assertThrows(ArithmeticException.class,()->c1.div(1,0),"it is an error");
		}

	}


