package battleship.battleship2;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

// Example file content:
/*
..X...........X...X......X.......XX.........X........XX.X..X......X.....X..X........................
H32,U13,
H20,U63,
...XXX.....XXXXX.......XX..................X...X...........................X...........X............
H32,U13,
H20,U63,
*/

public class BattleshipPersistence {

	public void load(BattleshipGame game, InputStream inputStream) throws IOException {

        Scanner scanner = new Scanner(inputStream);

        // First read all lines
        List<String> lines = new ArrayList<>(7);
        while (scanner.hasNextLine()) {
            lines.add(scanner.nextLine());
        }
        scanner.close();
        
        int dimension = Integer.parseInt(lines.get(0));
        
        // Create Battleship objects from the lines
        for (int i = 0; i < 2; i++) {

            String hits = lines.get(1 + i * 3);
            System.out.println("hits: " + hits);
            List<String> shipTypeInfo = Arrays.asList(lines.get(2 + i * 3).split(","));
            List<String> shipInfo = Arrays.asList(lines.get(3 + i * 3).split(","));

            List<ShipType> shipTypes = new ArrayList<>();
            shipTypeInfo.forEach(type -> {
                char t = type.charAt(0);
                int width = Character.getNumericValue(type.charAt(1));
                int height = Character.getNumericValue(type.charAt(2));
                shipTypes.add(new ShipType(t, width, height));
            });

            List<Ship> ships = new ArrayList<>();
            shipInfo.forEach(ship -> {
                char type = ship.charAt(0);
                int startRow = Character.getNumericValue(ship.charAt(1));
                int startColumn = Character.getNumericValue(ship.charAt(2));
                ShipType shipType = shipTypes.stream().filter(t -> t.getCharacter() == type).findAny().get();
                ships.add(new Ship(shipType, startColumn, startRow));
            });

            game.getBoards()[i].init(dimension, hits, shipTypes, ships);
        }
    }

	public void save(BattleshipGame game, OutputStream outputStream) throws IOException {
		
		// Handles uninitialized boards
        if (game == null || game.getBoards()[0] == null || game.getBoards()[1] == null || game.getBoards()[0].getCells() == null || game.getBoards()[1].getCells() == null) {
            return;
        }

		PrintWriter writer = new PrintWriter(outputStream);
		
		

        for (Battleship board : game.getBoards()) {
        	
        	// First line is the 
        	writer.println(board.getSize());
        	
            // Second line is the hits string
            StringBuilder hits = new StringBuilder();
            board.getCells().forEach(c -> hits.append(c.isHit() ? 'X' : '.'));
            writer.println(hits.toString());

            // Third line contains ship types (character, width and height) separated by commas
            StringBuilder typeSB = new StringBuilder();
            board.getShipTypes().forEach(type -> {
                char c = type.getCharacter();
                int width = type.getWidth();
                int height = type.getHeight();
                typeSB.append(c).append(width).append(height).append(",");
            });

            writer.println(typeSB.toString().substring(0, typeSB.length() - 1)); // Removes the last comma

            // Fourth line is the string of ships (character of ship type, x and y) separated by commas
            StringBuilder shipsSB = new StringBuilder();
            board.getShips().forEach(ship -> {
                char type = ship.getCharacter();
                int x = ship.getX();
                int y = ship.getY();
                shipsSB.append(type).append(x).append(y).append(",");
            });

            writer.println(shipsSB.toString().substring(0, shipsSB.length() - 1));
        }

        writer.flush();
	}

}
