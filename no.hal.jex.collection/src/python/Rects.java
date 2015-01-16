package python;

import java.util.Scanner;

public class Rects {

	double r1x1 = 0, r1y1 = 0, r1x2 = 0, r1y2 = 0;
	double r2x1 = 0, r2y1 = 0, r2x2 = 0, r2y2 = 0;

	boolean intervalsOverlap(double n1, double n2, double m1, double m2) {
		return ! (n1 > m2 || m2 < n1);
	}
	
	boolean rectanglesOverlap() {
	    return intervalsOverlap(r1x1, r1x2, r2x1, r2x2) && intervalsOverlap(r1y1, r1y2, r2y1, r2y2);
	}

	String rectangle2String(double x1, double y1, double x2, double y2) {
	    return "(" + x1 + "," + y1 + ")" + "," + "(" + x2 + "," + y2 + ")";
	}

	void main() {
		Scanner scanner = new Scanner(System.in);
		while (true) {
		    System.out.println("Rect1: " + rectangle2String(r1x1, r1y1, r1x2, r1y2));
		    System.out.println("Rect2: " + rectangle2String(r2x1, r2y1, r2x2, r2y2));
		    System.out.print(" > ");
		    String token = scanner.nextLine();
		    if (token.equals("overlaps?")) {
	    		System.out.println(rectanglesOverlap());
		    } else if (token.equals("exit")) {
		        break;
		    } else {
		        int pos = token.indexOf("=");
		        if (pos >= 4) {
		            int val = Integer.valueOf(token.substring(pos + 1).trim());
		            if (token.startsWith("r1x1")) {
	            		r1x1 = val;
		            } else if (token.startsWith("r1y1")) {
		                r1y1 = val;
		            } else if (token.startsWith("r1x2")) {
		                r1x2 = val;
		            } else if (token.startsWith("r1y2")) {
		                r1y2 = val;
		            } else if (token.startsWith("r2x1")) {
		                r2x1 = val;
		            } else if (token.startsWith("r2y1")) {
		                r2y1 = val;
		            } else if (token.startsWith("r2x2")) {
		                r2x2 = val;
		            } else if (token.startsWith("r2y2")) {
		                r2y2 = val;
		            }
		        }
		    }
		}
		scanner.close();
	}
	
	public static void main(String[] args) {
		new Rects().main();
	}
}
