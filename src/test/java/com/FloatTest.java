package com;

import org.junit.Assert;
import org.junit.Test;

import com.generic.arithmetic.Arithmetic;

public class FloatTest extends TestBase {
	@Test
	public void floatAdd() {
		Assert.assertEquals("22.7",Arithmetic.floatAdd("10.5", "12.2"));
		
	}
	@Test
	public void floatSub() {
		Assert.assertEquals("-73.55000000000001",Arithmetic.floatSubtract("-50.2", "23.35"));
		
	}
	@Test
	public void floatMult() {
		Assert.assertEquals("252693.44268",Arithmetic.floatMultiply("54.789", "4612.12"));
	}
	@Test
	public void floatDiv() {
		Assert.assertEquals("4.761904761904762",Arithmetic.floatDivide("100", "21"));
		
	}

}
