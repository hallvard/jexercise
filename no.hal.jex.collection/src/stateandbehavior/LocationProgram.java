package stateandbehavior;

/* @startuml

object "Location" as location1 {
	x = 0
	y = 0
}

object "Location" as location2 {
	x = -1
	y = 0
}
location1 --> location2 : left()

object "Location" as location3 {
	x = -1
	y = 1
}
location2 --> location3 : down()

object "Location" as location4 {
	x = 0
	y = 1
}
location3 --> location4 : right()

location4 --> location1 : up()

@enduml */

public class LocationProgram {
	
	Location location;
	
	void init() {
		location = new Location();
	}
	
	void run() {
		System.out.println(location);
		location.left();
		System.out.println(location);
		location.up();
		System.out.println(location);
		location.right();
		System.out.println(location);
		location.down();
		System.out.println(location);
	}

	public static void main(String[] args) {
		LocationProgram locationProgram = new LocationProgram();
		locationProgram.init();
		locationProgram.run();
	}
}
