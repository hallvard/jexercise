package inheritance;

public class TrainCar {
	
	private int deadWeight;
	
	public TrainCar(int deadWeight) {
		this.deadWeight = deadWeight;
	}

	protected String getTrainCarType() {
		return "train car";
	}

	public void setDeadWeight(int deadWeight) {
		this.deadWeight = deadWeight;
	}
	
	public int getDeadWeight() {
		return deadWeight;
	}
	public int getTotalWeight() {
		return deadWeight;

	}

	public String toString(){
		return "This is a " + getTrainCarType() + ", and it weighs " + getTotalWeight() + " kg.";
	}
}
