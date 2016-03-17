package battleship.battleship2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Battleship {

	private int size;
	private List<Cell> board;

	private Collection<ShipType> shipTypes = new ArrayList<>();
	private Collection<Ship> ships = new ArrayList<>();
	
	public void init(String level) {
		/*
		String[] lines = level.split("\n");

        // The first line contains the board size
		size = Integer.valueOf(lines[0]);
		
        // Fill the board list with empty cells
        board = new ArrayList<>(size*size);
        for (int i = 0; i < size*size; i++) {
            board.add(new Cell(null));
        }

        // Fill ships and shipTypes collections
        for (int i = 1; i < lvl.length; i++) {
            String shipString = lvl[i];
            char type = shipString.charAt(0);
            int startRow = Character.getNumericValue(shipString.charAt(1));
            int startColumn = Character.getNumericValue(shipString.charAt(2));
            int endRow = Character.getNumericValue(shipString.charAt(3));
            int endColumn = Character.getNumericValue(shipString.charAt(4));
            int width = endColumn - startColumn + 1;
            int height = endRow - startRow + 1;

			ShipType shipType = new ShipType(type, width, height);
			Ship ship = new Ship(shipType, startColumn, startRow);
			addShipTypes(shipType);
			addShip(ship);
		}*/
	}

    public void init(int dimension, String hits, List<ShipType> types, List<Ship> ships) {

        this.board = new ArrayList<>();
        this.size = dimension;
        this.ships = ships;
        this.shipTypes = types;

        // Fill board list with empty cells
        for (int i = 0; i < dimension*dimension; i++) {
            board.add(new Cell(null));
        }

        // Place ships
        for (Ship ship : ships) {
            int x = ship.getX();
            int y = ship.getY();
            int width = ship.getShipType().getWidth();
            int height = ship.getShipType().getHeight();

            for (int row = y; row < y + height; row++) {
                for (int col = x; col < x + width; col++) {
                    Cell cell = new Cell(ship);
                    if(hits != null){
                    	cell.setHit(hits.charAt(row * size + col) == 'X');
                    }
                    board.set(row * size + col, cell);
                }
            }
        }
    }

    public Battleship(ShipType... shipTypes) {
		this.shipTypes.addAll(Arrays.asList(shipTypes));
	}
	
	public void addShipTypes(ShipType... types) {
        for (ShipType shipType : types) {
            if (shipTypes.stream().noneMatch(st -> st.equals(shipType))) {
                shipTypes.add(shipType);
            }
        }
	}

    public void addShip(Ship ship) {
        //TODO: Do not accept collisions (ships on top of each other).
        ships.add(ship);
        for (int row = ship.getY(); row < ship.getY() + ship.getShipType().getHeight(); row++) {
            for (int col = ship.getX(); col < ship.getX() + ship.getShipType().getWidth(); col++) {
                board.set(row * size + col, new Cell(ship));
            }
        }
    }
	
    
    public Collection<Ship> getShips() {
        return ships;
    }

    public Collection<ShipType> getShipTypes() {
        return shipTypes;
    }

	public int getSize() {
		return size;
	}

	public Cell getCell(int x, int y) {
		return board.get(y * size + x);
	}
	
    
    public List<Cell> getCells() {
        return board;
    }

	public boolean isCellHit(int x, int y) {
		return getCell(x, y).isHit();
	}

	public boolean isSunk(Ship ship) {
		for (int dx = 0; dx < ship.getShipType().getWidth(); dx++) {
			for (int dy = 0; dy < ship.getShipType().getHeight(); dy++) {
				if (! isCellHit(ship.getX() + dx, ship.getY() + dy)) {
					return false;
				}
			}
		}
		return true;
	}

	
    public int countShips(ShipType shipType, Boolean hit) {
		return (int) board.stream().filter(cell -> cell.isShip() && (shipType == null || cell.getShipType() == shipType) && (hit == null || cell.isHit() == hit)).count();
    }

	public boolean isGameOver(){
		for(Ship ship : ships){
			if(!isSunk(ship)){
				return false;
			}
		}
		return true;
	}
    
	public Boolean fire(int x, int y) {
		Cell cell = getCell(x, y);
		cell.setHit(true);
	    Ship ship = cell.getShip();
        return (ship == null) ? false: isSunk(ship);
    }
	
	public String toString() {
		String boardString = "";
		for (int row = 0; row < size; row++) {
			boardString += "|";
			for (int col = 0; col < size; col++) {
				Cell cell = getCell(col, row);
				boardString += cell.toString();
			}
			boardString += "|";
			boardString += "\n";
		}
		return boardString;
	}



}
