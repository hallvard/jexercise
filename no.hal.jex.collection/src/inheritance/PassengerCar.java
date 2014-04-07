package inheritance;

public class PassengerCar extends TrainCar{
	
	private static final int passengerWeight = 80;

	private int passengerCount;

	public PassengerCar(int deadWeight, int passengerCount) {
		super(deadWeight);
		this.passengerCount = passengerCount;
	}
	
	@Override
	protected String getTrainCarType() {
		return "passenger car";
	}
	
	public int getPassengerCount(){
		return passengerCount;
	}

	public void setPassengerCount(int passengerCount){
		this.passengerCount = passengerCount;
	}
	
	@Override
	public int getTotalWeight(){
		return super.getTotalWeight() + (passengerCount*passengerWeight);
	}
	
	@Override
	public String toString(){
		return super.toString() + " It contains " + passengerCount + " passengers.";
	}
}
