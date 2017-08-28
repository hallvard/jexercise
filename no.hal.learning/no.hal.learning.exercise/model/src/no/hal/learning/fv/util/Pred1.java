package no.hal.learning.fv.util;

public interface Pred1 {
	
	public boolean test(double val);

	public static double EPSILON = 0.00000001;
	
	public static Pred1 GT0 = new Pred1() {
		@Override
		public boolean test(double val) {
			return val > 0.0;
		}
	};
	public static Pred1 GE0 = new Pred1() {
		@Override
		public boolean test(double val) {
			return val > -EPSILON;
		}
	};
	public static Pred1 ZERO = new Pred1() {
		@Override
		public boolean test(double val) {
			return val < EPSILON && val > -EPSILON;
		}
	};
	public static Pred1 LE0 = new Pred1() {
		@Override
		public boolean test(double val) {
			return val < EPSILON;
		}
	};
	public static Pred1 LT0 = new Pred1() {
		@Override
		public boolean test(double val) {
			return val < 0.0;
		}
	};
}
