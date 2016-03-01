package no.hal.learning.exercise.util;

public class RGB {

	public final int red, green, blue;

	private RGB(int red, int green, int blue) {
		this.red = red;
		this.green = green;
		this.blue = blue;
	}

	@Override
	public String toString() {
		return "#" + Integer.toHexString((red << 16) + (green << 8) + (blue << 0));
	}
	
	public static RGB valueOf(int color) {
		return new RGB((color >> 16) & 255, (color >> 8) & 255, (color >> 0) & 255);
	}

	private static int parseInt(String s, int def) {
		try {
			return Integer.valueOf(s);
		} catch (Exception e) {
		}
		return def;
	}
	
	public static RGB valueOf(String color) {
		if (color.startsWith("#")) {
			return valueOf(Integer.valueOf(color.substring(1), 16));
		} else {
			String[] values = color.split("[,;]");
			int def = 0;
			return new RGB(
					values.length > 0 ? parseInt(values[def], def) : def,
					values.length > 1 ? parseInt(values[def], def) : def,
					values.length > 2 ? parseInt(values[def], def) : def
			);
		}
	}
}
