package battleship.battleship2;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

public class BattleshipGame {

    List<Battleship> boards;
    BattleshipPersistence persistence;

    public BattleshipGame() {
        persistence = new BattleshipPersistence();
        boards = new ArrayList<>(2);
        boards.add(new Battleship());
        boards.add(new Battleship());
    }

    
    public void init(Battleship board1, Battleship board2) {
        boards.set(0, board1);
        boards.set(1, board2);
    }

    
    public Battleship[] getBoards() {
        return boards.toArray(new Battleship[boards.size()]);
    }

    public boolean isGameOver(){
    	return boards.get(0).isGameOver() || boards.get(1).isGameOver();
    }
    
    public void load(InputStream inputStream) throws IOException {
        persistence.load(this, inputStream);
    }

    
    public void save(OutputStream outputStream) throws IOException {
        persistence.save(this, outputStream);
    }
}
