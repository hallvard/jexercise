package no.hal.learning.fv.util;

public interface Op2 {
	
	public double apply(double val1, double val2);
	
	public static Op2
		PLUS = new Op2() {
			@Override
			public double apply(double val1, double val2) {
				return val1 + val2;
			}
		},
		MINUS = new Op2() {
			@Override
			public double apply(double val1, double val2) {
				return val1 - val2;
			}
		},
		MULT = new Op2() {
			@Override
			public double apply(double val1, double val2) {
				return val1 * val2;
			}
		},
		DIV = new Op2() {
			@Override
			public double apply(double val1, double val2) {
				return val1 / val2;
			}
		},
		
		MIN = new Op2() {
			@Override
			public double apply(double val1, double val2) {
				return Math.min(val1, val2);
			}
		},
		MAX = new Op2() {
			@Override
			public double apply(double val1, double val2) {
				return Math.max(val1, val2);
			}
		},
		
		COMPARE = new Op2() {
			@Override
			public double apply(double val1, double val2) {
				return Double.compare(val1, val2);
			}
		};
}
