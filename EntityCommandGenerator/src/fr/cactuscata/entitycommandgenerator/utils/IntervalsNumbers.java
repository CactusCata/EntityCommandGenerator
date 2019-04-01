package fr.cactuscata.entitycommandgenerator.utils;

public class IntervalsNumbers {

	private Number lastMinEnter, lastMaxEnter;

	public IntervalsNumbers(Number value, Number min, Number max) {
		check(value, min, max);
	}

	public IntervalsNumbers check(Number value, Number min, Number max) {
		this.lastMinEnter = min;
		this.lastMaxEnter = max;
		return this.check(value);
	}

	public IntervalsNumbers check(Number value) {
		if (value.floatValue() > this.lastMaxEnter.floatValue() || value
				.floatValue() < this.lastMinEnter
						.floatValue()) { throw new IllegalArgumentException(
								String.format(
										"The value %f isn't in interval [%f:%f]",
										value.floatValue(),
										this.lastMinEnter.floatValue(),
										this.lastMaxEnter.floatValue())); }
		return this;
	}

}
