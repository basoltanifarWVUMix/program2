package com;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)

public class GenericMultiplicationTest extends TestBase {
	private String number1;
	private String number2;
	private String expected;
	private String base;

	@SuppressWarnings("static-access")
	@Test
	public void verifydecimalAddition() {
		Assert.assertEquals(expected,
				getArithmetic().multiply(Integer.parseInt(base.intern().trim()), number1, number2));

	}

	public GenericMultiplicationTest(String base, String number1, String number2, String expected) {
		this.number1 = number1;
		this.number2 = number2;
		this.expected = expected;
		this.base = base;

	}

	@SuppressWarnings("rawtypes")
	@Parameterized.Parameters
	public static Collection primeNumbers() {
		return Arrays.asList(new Object[][] { { "10", "8", "4", "32" }, { "2", "1000", "100", "100000" },
				{ "8", "10", "4", "40" }, { "16", "8", "4", "20" }

		});
	}

}
