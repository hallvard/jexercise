package no.hal.learning.exercise.adm.plots.matrix;

public interface Matrix {
	
	public int getColumnCount();
	public int getRowCount();
	public double get(int column, int row);
	public void set(int column, int row, double value);

	public <T extends Number> void set(T[] values);
	public void set(double[] values);
	public Matrix copy();
}
