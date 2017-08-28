package no.hal.learning.fv.util;

public class Constant implements Op2 {

	private final double val;
	
	public Constant(double val) {
		this.val = val;
	}

	@Override
	public double apply(double ignore1, double ignore2) {
		return val;
	}
}
