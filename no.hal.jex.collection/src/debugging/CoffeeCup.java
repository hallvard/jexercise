package debugging;

public class CoffeeCup {

	private double capacity;
	private double currentVolume;
	
	
	public CoffeeCup() {
		this.capacity = 0.0;
		this.currentVolume = 0.0;
	}
	
	public CoffeeCup(double capacity, double currentVolume){
		if(isValidCapacity(capacity)){
			this.capacity = capacity;
		}
		else{
			throw new IllegalArgumentException("Illegal capacity given.");
		}
		if(isValidVolume(currentVolume)){
			this.currentVolume = currentVolume;
		}
		else{
			throw new IllegalArgumentException("Illegal volume given.");
		}
	}
	
	private boolean isValidCapacity(double capacity){
		if(capacity >= 0.0){
			return true;
		}
		return false;
	}
	
	public void increaseCupSize(double biggerCapacity){
		if(isValidCapacity(biggerCapacity)){
			this.capacity += biggerCapacity;
		}
	}
	
	private boolean isValidVolume(double volume){
		if(volume > this.capacity || volume < 0.0){
			return false;
		}
		return true;
	}
	
	private boolean canDrink(double volume){
		if(this.currentVolume >= volume){
			return true;
		}
		return false;
	}
	
	public void drinkCoffee(double volume){
		if(isValidVolume(volume) && canDrink(volume)){
			this.currentVolume -= volume;
		}
		else{
			throw new IllegalArgumentException("You can't drink that much coffee!");
		}
	}
	
	public void fillCoffee(double volume){
		if(isValidVolume(this.currentVolume + volume)){
			this.currentVolume += volume;
		}
		else{
			throw new IllegalArgumentException("You just poured coffee all over the table. Good job.");
		}
	}

}
