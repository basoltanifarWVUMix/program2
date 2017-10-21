package com;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class GenericSqrtTest extends TestBase {
	private String number1;
	private String base;
	private String expected;

	@SuppressWarnings("static-access")
	@Test
	public void verifydecimalAddition() {
		Assert.assertEquals(expected, getArithmetic().squareRoot(Integer.parseInt(base.intern().trim()), number1));

	}

	public GenericSqrtTest(String base, String number1, String expected) {
		this.number1 = number1;
		this.expected = expected;
		this.base = base;

	}

	@SuppressWarnings("rawtypes")
	@Parameterized.Parameters
	public static Collection primeNumbers() {
		return Arrays.asList(new Object[][] { { "10", "8", "2" }, { "2", "1000", "10" }, { "8", "10", "2" },
				{ "16", "8", "2" }

		});
	}

}