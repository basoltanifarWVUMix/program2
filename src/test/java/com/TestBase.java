package com;

import org.junit.Rule;
import org.junit.rules.TestRule;
import org.junit.rules.TestWatcher;

import com.generic.arithmetic.Arithmetic;

public abstract class TestBase {

	@Rule
	public final TestRule rule = new TestWatcher() {

	};

	public Arithmetic getArithmetic() {
		return (new Arithmetic());
	}

}
