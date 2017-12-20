package misc;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class Heisenberg {

	private String[] symbols = {
		"H", "He", "Li", "Be", "B", "C", "N", "O", "F", "Ne", "Na", "Mg",
		"Al", "Si", "P", "S", "Cl", "Ar", "K", "Ca", "Sc", "Ti", "V", "Cr", "Mn", "Fe", "Co", "Ni", "Cu", "Zn", "Ga", "Ge", "As", "Se", "Br", "Kr", "Rb", "Sr",
		"Y", "Zr", "Nb", "Mo", "Tc", "Ru", "Rh", "Pd", "Ag", "Cd", "In", "Sn", "Sb", "Te", " I ", "Xe", "Cs", "Ba",
		"La", "Ce", "Pr", "Nd", "Pm", "Sm", "Eu", "Gd", "Tb", "Dy", "Ho", "Er", "Tm", "Yb", "Lu", "Hf", "Ta", "W", "Re", "Os", "Ir", "Pt", "Au", "Hg", "Tl", "Pb", "Bi", "Po", "At", "Rn", "Fr", "Ra",
		"Ac", "Th", "Pa", "U", "Np", "Pu", "Am", "Cm", "Bk", "Cf", "Es", "Fm", "Md", "No", "Lr", "Rf", "Db", "Sg", "Bh", "Hs", "Mt", "Ds", "Rg", "Cn", "Fl", "Lv"
	};

	private boolean startsWithIgnoreCase(String s, String prefix) {
		if (prefix.length() > s.length()) {
			return false;
		}
		for (int i = 0; i < prefix.length(); i++) {
			if (Character.toUpperCase(s.charAt(i)) != Character.toUpperCase(prefix.charAt(i))) {
				return false;
			}
		}
		return true;
	}
	
	private String findNextSymbol(String s) {
		String longest = null;
		for (String symbol : symbols) {
			if (startsWithIgnoreCase(s, symbol) && symbol.length() > (longest != null ? longest.length() : 0)) {
				longest = symbol;
			}
		}
		return longest;
	}
	
	private String removeNonAlphabeticCharacters(String s, Collection<Integer> removedIndices) {
		String result = "";
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (Character.isAlphabetic(c)) {
				result = result + c;
			} else {
				removedIndices.add(i);
			}
		}
		return result;
	}
	
	public String translate(String original, boolean wholeWordsOnly) {
		Collection<Integer> removedIndices = new ArrayList<Integer>();
		String s = original;
		if (! wholeWordsOnly) {
			s = removeNonAlphabeticCharacters(s, removedIndices);
		}
		String result = "";
		while (s.length() > 0) {
			String nextSymbol = findNextSymbol(s);
			if (nextSymbol != null) {
				result = result + nextSymbol;
				s = s.substring(nextSymbol.length());
			} else {
				result = result + Character.toUpperCase(s.charAt(0));
				s = s.substring(1);
			}
		}
		for (int index : removedIndices) {
			result = result.substring(0, index) + original.charAt(index) + result.substring(index); 
		}
		return result;
	}

	public static void main(String[] args) {
		Heisenberg translator = new Heisenberg();
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i] + " => " + translator.translate(args[i], false));
		}
		Scanner scanner = new Scanner(System.in);
		System.out.println("?");
		while (scanner.hasNextLine()) {
			String line = scanner.nextLine();
			if (line.trim().length() == 0) {
				break;
			}
			System.out.println(line + " => " + translator.translate(line, false));
			System.out.println("?");
		}
		scanner.close();
	}
}
