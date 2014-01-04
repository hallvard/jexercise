package stateandbehavior;

public class Calc1 {

	private double value = 0.0;
	
	@Override
	public String toString() {
		return String.format("[Calc1 %f]", value);
	}
	
	double getValue() {
		return value;
	}
	
	void setValue(double value) {
		this.value = value;
	}
	
	void add(double value) {
		this.value += value; 
	}
	
	void subtract(double value) {
		this.value -= value; 
	}
	
	void multiply(double value) {
		this.value *= value; 
	}
	
	void divide(double value) {
		this.value /= value; 
	}
	
	void percent(double value) {
		this.value = (this.value * value) / 100; 
	}

	void negate() {
		this.value = -value;
	}
	
	void pi() {
		this.value = Math.PI;
	}
}
