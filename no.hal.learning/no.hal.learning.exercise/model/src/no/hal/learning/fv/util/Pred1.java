package no.hal.learning.fv.util;

public interface Pred1 extends Op1 {
	
	public boolean test(double val);

	public static double EPSILON = 0.00000001;
	
	static abstract class Impl implements Pred1 {
		@Override
		public double apply(double val) {
			return test(val) ? 1.0 : 0.0;
		}
	}
	
	public static Pred1 GT0 = new Impl() {
		@Override
		public boolean test(double val) {
			return val > 0.0;
		}
	};
	public static Pred1 GE0 = new Impl() {
		@Override
		public boolean test(double val) {
			return val > -EPSILON;
		}
	};
	public static Pred1 ZERO = new Impl() {
		@Override
		public boolean test(double val) {
			return val < EPSILON && val > -EPSILON;
		}
	};
	public static Pred1 LE0 = new Impl() {
		@Override
		public boolean test(double val) {
			return val < EPSILON;
		}
	};
	public static Pred1 LT0 = new Impl() {
		@Override
		public boolean test(double val) {
			return val < 0.0;
		}
	};
}
