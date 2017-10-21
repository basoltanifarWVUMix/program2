package com;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)

public class GenericAdditionTest extends TestBase {
	private String base;
	private String number1;
	private String number2;
	private String expected;

	@SuppressWarnings("static-access")
	@Test
	public void verifydecimalAddition() {
		Assert.assertEquals(expected, getArithmetic().add(Integer.parseInt(base.trim().intern()), number1, number2));

	}

	public GenericAdditionTest(String base, String number1, String number2, String expected) {
		this.base = base;
		this.number1 = number1;
		this.number2 = number2;
		this.expected = expected;

	}

	@SuppressWarnings("rawtypes")
	@Parameterized.Parameters
	public static Collection primeNumbers() {
		return Arrays.asList(new Object[][] { { "2", "110", "101", "1011" }, { "8", "52", "71", "143" },
				{ "10", "159", "23", "182" }, { "16", "1F", "2AD", "2cc" }

		});
	}

}
