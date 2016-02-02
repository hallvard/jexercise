package debugging;

public class CoffeeCupProgram {

	private CoffeeCup cup;
	
	public void init(){
		cup = new CoffeeCup();
	}
	
	public void run(){
		part1();
		part2();
	}
	
	private void part1(){
		cup.increaseCupSize(40.0);
		cup.fillCoffee(20.5);
		cup.drinkCoffee(Math.floor(cup.nextDouble()*20.5));
		cup.fillCoffee(32.5);
		cup.drinkCoffee(Math.ceil(cup.nextDouble()*38.9));
		cup.drinkCoffee(Math.ceil(cup.nextDouble()*42));
		cup.increaseCupSize(17);
		cup.drinkCoffee(40);
		cup.drinkCoffee(Math.ceil(cup.nextDouble()*42));
		cup.drinkCoffee(Math.floor(cup.nextDouble()*20.5));
		cup.fillCoffee(32.5);
		cup.drinkCoffee(Math.ceil(cup.nextDouble()*38.9));
		cup.drinkCoffee(Math.ceil(cup.nextDouble()*42));
		cup.increaseCupSize(17);
	}
	
	private void part2(){
		cup = new CoffeeCup(40.0, 20.5);
		cup.drinkCoffee(Math.floor(cup.nextDouble()*20.5));
		cup.fillCoffee(Math.floor(cup.nextDouble()*30));
		cup.drinkCoffee(Math.ceil(cup.nextDouble()*38.9));
		cup.drinkCoffee(Math.ceil(cup.nextDouble()*42));
		cup.increaseCupSize(Math.floor(cup.nextDouble()*26));
		cup.drinkCoffee(40);
	}
	
	
	public static void main(String[] args) {
		CoffeeCupProgram program = new CoffeeCupProgram();
		program.init();
		program.run();
	}

}
