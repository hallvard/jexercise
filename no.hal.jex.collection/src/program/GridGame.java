package program;

public interface GridGame {
	
	/**
	 * Loads and initializes the game to a (new) specified level. The String can be anything, e.g. a file name or a String encoding a level.
	 * Note that there should be no output at this point.
	 * @param level the String decribing a level, e.g. path or URL
	 */
	public void init(String level);
	
	/**
	 * Start the game (that was just initialized with init) and use the argument for all game output
	 * @param output the object used for providing text-based output to the user (messages, warnings and errors)
	 */
	public void run(GameOutput output);
	
	/**
	 * Perform a command (line). This method may update the underlying grid and provide output to the user using the GameOutput object given to.
	 * @param command
	 * @return A value indicating status of game, null for unfinished, 0 for a draw and negative or positive value for failure or success.
	 */
	public Integer doCommand(String command);

	/**
	 * Returns the object that encapsulates the underlying grid.
	 * @return  the object that encapsulates the underlying grid
	 */
	public GridProvider getGridProvider();
	
	/**
	 * Returns the text (label) corresponding to the provided grid element, or null of there is none.
	 * @param o the object
	 * @return the text (label) corresponding to the provided grid element
	 */
	public String getTextFor(Object o);
	
	/**
	 * Returns the location (URL or file) of the image corresponding to the provided grid element, or null of there is none.
	 * @param o the object
	 * @return the location (URL or file) of the image corresponding to the provided grid element
	 */
	public String getImageFor(Object o);
	
	/**
	 * Perform an action corresponding to selecting a grid element. This method may update the underlying grid and provide output to the user using the GameOutput object given to.
	 * @param command
	 * @return A value indicating status of game, null for unfinished, 0 for a draw and negative or positive value for failure or success.
	 */
	public Integer gridElementInput(int x, int y);
	
	/**
	 * Perform an action corresponding to moving in a certain direction. This method may update the underlying grid and provide output to the user using the GameOutput object given to.
	 * @param command
	 * @return A value indicating status of game, null for unfinished, 0 for a draw and negative or positive value for failure or success.
	 */
	public Integer directionInput(int dx, int dy);
}
