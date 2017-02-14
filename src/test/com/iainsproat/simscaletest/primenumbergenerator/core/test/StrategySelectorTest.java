package com.iainsproat.simscaletest.primenumbergenerator.core.test;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.instanceOf;

import org.junit.Test;

import com.iainsproat.simscaletest.primenumbergenerator.core.PrimeNumberGeneratorStrategy;
import com.iainsproat.simscaletest.primenumbergenerator.core.StrategySelector;
import com.iainsproat.simscaletest.primenumbergenerator.core.generators.*;

public class StrategySelectorTest {

	@Test
	public void canSelectNaive1Strategy() {

		PrimeNumberGeneratorStrategy result = StrategySelector.selectStrategy("naive1");
		assertThat(result, instanceOf(Naive1PrimeNumberGenerator.class));
	}
	
	@Test
	public void canSelectNaive2Strategy() {

		PrimeNumberGeneratorStrategy result = StrategySelector.selectStrategy("naive2");
		assertThat(result, instanceOf(Naive2PrimeNumberGenerator.class));
	}
	
	@Test(expected = UnsupportedOperationException.class)
	public void cannotSelectIncorrectStrategy() {
		StrategySelector.selectStrategy("");
	}
}
