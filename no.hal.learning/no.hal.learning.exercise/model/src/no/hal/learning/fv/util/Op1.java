package no.hal.learning.fv.util;

public interface Op1 {
	
	public double apply(double val);
	
	public static Op1
		IDENTITY = new Op1() {
			@Override
			public double apply(double val) {
				return val;
			}
		},
		NEG = new Op1() {
			@Override
			public double apply(double val) {
				return -val;
			}
		},
		INV = new Op1() {
			@Override
			public double apply(double val) {
				return 1 / val;
			}
		},
		ABS = new Op1() {
			@Override
			public double apply(double val) {
				return Math.abs(val);
			}
		},
		SIGNUM = new Op1() {
			@Override
			public double apply(double val) {
				return Math.signum(val);
			}
		}
		;
}
