package debugging;

import java.util.Random;
import java.lang.Math;

public class CoffeeCup {

	private double capacity;
	private double currentVolume;
	private Random rand;
	
	
	public CoffeeCup() {
		this.capacity = 0.0;
		this.currentVolume = 0.0;
		rand = new Random(123456789L);
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
		rand = new Random(987654321L);
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
	
	
	public static void main(String[] args) {
		/*
		 * Task 1: What is the state of the class members right before the Exception is thrown?
		 */
		CoffeeCup cup1 = new CoffeeCup();
		cup1.increaseCupSize(40.0);
		cup1.fillCoffee(20.5);
		cup1.drinkCoffee(Math.floor(cup1.rand.nextDouble()*20.5));
		cup1.fillCoffee(32.5);
		cup1.drinkCoffee(Math.ceil(cup1.rand.nextDouble()*38.9));
		cup1.drinkCoffee(Math.ceil(cup1.rand.nextDouble()*42));
		cup1.increaseCupSize(17);
		cup1.drinkCoffee(40);
		
		/*
		 * Task 2: List the all the values of currentVolume in cup2 before the program crashes.
		 */
		CoffeeCup cup2 = new CoffeeCup(40.0, 20.5);
		cup2.drinkCoffee(Math.floor(cup2.rand.nextDouble()*20.5));
		cup2.fillCoffee(Math.floor(cup2.rand.nextDouble()*30));
		cup2.drinkCoffee(Math.ceil(cup2.rand.nextDouble()*38.9));
		cup2.drinkCoffee(Math.ceil(cup2.rand.nextDouble()*42));
		cup2.increaseCupSize(Math.floor(cup2.rand.nextDouble()*26));
		cup2.drinkCoffee(40);
	}

}
