package no.hal.learning.fv.util;

public interface Pred2 extends Op2 {

	public boolean test(double val1, double val2);
	
	static abstract class Impl implements Pred2 {

		public double apply(double val1, double val2) {
			return test(val1, val2) ? 1.0 : 0.0;
		}
	}
	
	public static Pred2 EQ = new Impl() {
		@Override
		public boolean test(double val1, double val2) {
			return val1 < val2 + Pred1.EPSILON && val1 > val2 - Pred1.EPSILON;
		}
	};
	public static Pred2 LT = new Impl() {
		@Override
		public boolean test(double val1, double val2) {
			return val1 < val2;
		}
	};
	public static Pred2 LE = new Impl() {
		@Override
		public boolean test(double val1, double val2) {
			return val1 < val2 + Pred1.EPSILON;
		}
	};
	public static Pred2 GT = new Impl() {
		@Override
		public boolean test(double val1, double val2) {
			return val1 > val2;
		}
	};
	public static Pred2 GE = new Impl() {
		@Override
		public boolean test(double val1, double val2) {
			return val1 > val2 - Pred1.EPSILON;
		}
	};
}
