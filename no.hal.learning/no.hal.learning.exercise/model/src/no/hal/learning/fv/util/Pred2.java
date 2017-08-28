package no.hal.learning.fv.util;

public interface Pred2 {

	public boolean test(double val1, double val2);
	
	public static Pred2 EQ = new Pred2() {
		@Override
		public boolean test(double val1, double val2) {
			return val1 < val2 + Pred1.EPSILON && val1 > val2 - Pred1.EPSILON;
		}
	};
	public static Pred2 LT = new Pred2() {
		@Override
		public boolean test(double val1, double val2) {
			return val1 < val2;
		}
	};
	public static Pred2 LE = new Pred2() {
		@Override
		public boolean test(double val1, double val2) {
			return val1 < val2 + Pred1.EPSILON;
		}
	};
	public static Pred2 GT = new Pred2() {
		@Override
		public boolean test(double val1, double val2) {
			return val1 > val2;
		}
	};
	public static Pred2 GE = new Pred2() {
		@Override
		public boolean test(double val1, double val2) {
			return val1 > val2 - Pred1.EPSILON;
		}
	};
}
